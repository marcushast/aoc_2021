object Day14 {

    val data1 = """
        NNCB

        CH -> B
        HH -> N
        CB -> H
        NH -> C
        HB -> C
        HC -> B
        HN -> C
        NN -> C
        BH -> H
        NC -> B
        NB -> B
        BN -> B
        BB -> N
        BC -> B
        CC -> N
        CN -> C
    """.trimIndent()

    val data2 = """
        SHHBNFBCKNHCNOSHHVFF

        CK -> N
        VP -> B
        CF -> S
        FO -> V
        VC -> S
        BV -> V
        NP -> P
        SN -> C
        KN -> V
        NF -> P
        SB -> C
        PC -> B
        OB -> V
        NS -> O
        FH -> S
        NK -> S
        HO -> V
        NV -> O
        FV -> O
        FB -> S
        PS -> S
        FN -> K
        HS -> O
        CB -> K
        HV -> P
        NH -> C
        BO -> B
        FF -> N
        PO -> F
        BB -> N
        PN -> C
        BP -> C
        HN -> K
        CO -> P
        BF -> H
        BC -> S
        CV -> B
        VV -> F
        FS -> B
        BN -> P
        VK -> S
        PV -> V
        PP -> B
        PH -> N
        SS -> O
        SK -> S
        NC -> P
        ON -> F
        NB -> N
        CC -> N
        SF -> H
        PF -> H
        OV -> O
        KH -> C
        CP -> V
        PK -> O
        KC -> K
        KK -> C
        KF -> B
        HP -> C
        FK -> H
        BH -> K
        VN -> H
        OO -> S
        SC -> K
        SP -> B
        KO -> V
        KV -> F
        HK -> N
        FP -> N
        NN -> B
        VS -> O
        HC -> K
        BK -> N
        KS -> K
        VB -> O
        OH -> F
        KB -> F
        KP -> H
        HB -> N
        NO -> N
        OF -> O
        BS -> H
        VO -> H
        SH -> O
        SV -> K
        HF -> C
        CS -> F
        FC -> N
        VH -> H
        OP -> K
        OK -> H
        PB -> K
        HH -> S
        OC -> V
        VF -> B
        CH -> K
        CN -> C
        SO -> P
        OS -> O
    """.trimIndent()

    private fun process(data: String): Pair<String, Map<String, String>> {
        val rows = data.lines()

        val template = rows.first()
        val map = rows.drop(2).map { it.split(" -> ") }.associate { Pair(it[0], it[1]) }

        return Pair(template, map)
    }

    private fun process2(data: String): Pair<CharArray, Map<String, Char>> {
        val rows = data.lines()

        val template = rows.first().toCharArray()
        val map = rows.drop(2).map { it.split(" -> ") }.associate { Pair(it[0], it[1].toCharArray()[0]) }

        return Pair(template, map)
    }

    private fun work(data: Pair<String, Map<String, String>>, reps: Int) {
        val template = data.first
        val rules = data.second

        var process = template
        repeat(reps) {
            process = applyRules1(process, rules)
            println(it)
        }

        val res = process.groupingBy { it }.eachCount().toList().sortedBy { it.second }
        print(res)
    }

    private fun applyRules1(template: String, rules: Map<String, String>): String {
        val temp = template.toCharArray().toList().asSequence()
        val inserts = temp.windowed(2).map { String(it.toCharArray()) }.map { rules.getValue(it) }.asSequence()

        val res = temp.zip(inserts).flatMap { listOf(it.first, it.second) } + temp.last()
        return res.joinToString(separator = "") { it.toString() }
    }

    private fun work2(data: Pair<String, Map<String, String>>, reps: Int) {
        val template = data.first
        val rules = data.second

        //val accumulation = mutableListOf<Pair<Char, Int>>()
        val accumulation = mutableMapOf<Char, Int>()


        val segmentedInput = template.toCharArray().toList().windowed(2)
        var i = 1
        segmentedInput.forEach { pair ->
            println("Processing chunk ${i++} of ${segmentedInput.size}")
            var process = pair.joinToString(separator = "") { it.toString() }
            repeat(reps) {
                process = applyRules2(process, rules)
                println(it)
            }

            //accumulation.addAll(process.groupingBy { it }.eachCount().toList())
            addUp(process.groupingBy { it }.eachCount(), accumulation)
        }

        println(accumulation.toList().sortedBy { it.second })
        //print(accumulation.groupBy )
    }

    private fun applyRules2(template: String, rules: Map<String, String>): String {
        //println(template)
        val temp = template.toCharArray().toList().asSequence()
        val inserts = temp.windowed(2).map { String(it.toCharArray()) }.map { rules.getValue(it) }.asSequence()

        val res = temp.zip(inserts).flatMap { listOf(it.first, it.second) } + temp.last()
        return res.joinToString(separator = "") { it.toString() }
    }

    private fun addUp(newData: Map<Char, Int>, acc: MutableMap<Char, Int>) {
        newData.keys.forEach { key ->
            val v = (acc.remove(key) ?: 0) + newData.getValue(key)
            acc[key] = v
        }
    }




    private fun work3(data: Pair<CharArray, Map<String, Char>>, steps: Int) {
        val count = ruleIterator(data.first.iterator(), data.second, steps, true).asSequence().groupingBy { it }.eachCount().toList().sortedBy { it.second }
        println(count)

        println("Most - least is " + (count.last().second-count.first().second))
    }

    fun ruleIterator(data: Iterator<Char>, rules: Map<String, Char>, steps: Int, top: Boolean): Iterator<Char> = iterator {
        if(steps == 0) {
            while (data.hasNext()) {
                yield(data.next())
            }
        } else {
            var counter = 1

            val recData: Iterator<Char> = ruleIterator(data, rules, steps-1, false)

            var first = recData.next()
            while(recData.hasNext()) {
                if(top) {
                    if (counter.mod(1000000000) == 0) println(counter)
                    counter++
                }
                val second = recData.next()

                yield(first)

                yield(rules["$first$second"]!!)

                first = second
            }

            yield(first)
        }
    }



    fun run1() {
        work(process(data2), 10)
    }

    fun run2() {
        work(process(data2), 40)
    }

    fun run1_2() {
        work2(process(data1), 40)
    }

    fun run1_3() {
        work3(process2(data1), 40)
    }
}