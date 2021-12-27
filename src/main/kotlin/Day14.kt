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

    /**
     * The first attempt simply builds a long string and then counts the letters.
     * Unsurprisingly the string becomes a bit too long.
     */
    fun process1(data: String): Pair<String, Map<String, String>> {
        val rows = data.lines()

        val template = rows.first()
        val map = rows.drop(2).map { it.split(" -> ") }.associate { Pair(it[0], it[1]) }

        return Pair(template, map)
    }

    fun work1(data: Pair<String, Map<String, String>>, reps: Int) {
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

    /**
     * Second iteration expands on the string building at tries to use sequences to do the work. But it's not entirely
     * successful as it doesn't do the work iteratively. (So it still runs out of memory on part 2.)
     */
    fun work2(data: Pair<String, Map<String, String>>, reps: Int) {
        val template = data.first
        val rules = data.second

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

            addUp(process.groupingBy { it }.eachCount(), accumulation)
        }

        println(accumulation.toList().sortedBy { it.second })
    }

    private fun applyRules2(template: String, rules: Map<String, String>): String {
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

    /**
     * Third iteration uses a more proper iterator, it seems to generate a long sequence of letters properly.
     * This no longer runs out of memory. Instead, it runs out of time.
     */
    private fun process2(data: String): Pair<CharArray, Map<String, Char>> {
        val rows = data.lines()

        val template = rows.first().toCharArray()
        val map = rows.drop(2).map { it.split(" -> ") }.associate { Pair(it[0], it[1].toCharArray()[0]) }

        return Pair(template, map)
    }

    fun work3(data: Pair<CharArray, Map<String, Char>>, steps: Int) {
        println("Input length: " + data.first.size)

        val count = ruleIterator(data.first.iterator(), data.second, steps, true).asSequence().groupingBy { it }.eachCount().toList().sortedBy { it.second }
        println(count)

        println("Most - least is " + (count.last().second-count.first().second))
    }

    // For debugging
    fun print3(data: Pair<CharArray, Map<String, Char>>, steps: Int) {
        println("Input length: " + data.first.size)

        for (char in ruleIterator(data.first.iterator(), data.second, steps, true).asSequence()) {
            println(char)
        }
    }

    // To save on memory we create an iterator to generate new characters at a given "depth". And we can feed it characters
    // using a recursive iterator. Step 0 means we simply return the input sequence.
    private fun ruleIterator(data: Iterator<Char>, rules: Map<String, Char>, steps: Int, top: Boolean): Iterator<Char> = iterator {
        if(steps == 0) {
            while (data.hasNext()) {
                yield(data.next())
            }
        } else {
            val recData: Iterator<Char> = ruleIterator(data, rules, steps-1, false)

            var first = recData.next()
            while(recData.hasNext()) {
                val second = recData.next()

                yield(first)

                yield(rules["$first$second"]!!)

                first = second
            }

            yield(first)
        }
    }

    /**
     * Since it takes a really long time it seems reasonable to not recalculate the same strings all the time. And instead
     * of caching the results as the string is being built we might as well base the cache on pairs of characters. Fortunately
     * we have a supplied list of all pairs as part of the problem description.
     *
     * This solution starts off by iterating a cache by expanding all pairs step by step. For each new step we simply generate
     * the two new pairs and look up their previously calculated character count from the last iteration. And then we can discard
     * last iteration of the cache until we reach the number of steps we want to calculate.
     *
     * Turns out this is quite a bit faster.
     *
     */
    fun work4(data: Pair<String, Map<String, String>>, reps: Int) {
        val cache = buildCache(data.second, reps)

        val inputPairs = data.first.toCharArray().asList().windowed(2).map { it.joinToString(separator = "") + reps }

        println("input string " + data.first)
        println("input pairs $inputPairs")

        val result = addUpPairs(
            inputPairs.map { cache[it]?.toList() ?: emptyList() }.flatten() + countLetters(data.first).toList()
        )
        val sorted = result.toList().sortedBy { it.second }

        println("sorted" + sorted)
        println(sorted.last().second - sorted.first().second)
    }

    private fun addUpPairs(list: List<Pair<Char, Long>>): CacheLine {
        val keys = list.map { it.first }.distinct()
        val map = mutableMapOf<Char, Long>()
        for (key in keys) {
            map[key] = list.filter { it.first == key }.sumOf { it.second }
        }
        return map
    }

    /**
     * In order to not double count characters shared between pairs we only cache the "middle" of the pair.
     * Ie excluding the first and last characters. It is easy to add those to the final tally at the end.
     */
    private fun buildCache(rules: Map<String, String>, iterations: Int): Map<String, CacheLine> {
        val ruleMapping = rules.entries.associate { it.key to listOf("${it.key[0]}${it.value}", "${it.value}${it.key[1]}") }

        val basePairs = rules.keys.toList()

        var cachePrev: Map<String, Map<Char, Long>>
        var cacheNext = calculateZeroInternal(basePairs)

        /**
         * The cache consists of a mapping from a character pair to a count of the letters in that pair
         * (and all sub-pairs). The reason it stores an iteration number for each pair (eg NN0, GH14 etc) is because
         * the cache used to contain all previous steps as well. But these are not actually useful so in the final iteration
         * only the most recent iteration of the cache is kept.
         */
        for(i in 1..iterations) {
            cachePrev = cacheNext
            cacheNext =
                ruleMapping.entries.associate {
                    val lookup = listOfNotNull(
                        cachePrev["${it.value[0]}${i-1}"]?.toList(),
                        cachePrev["${it.value[1]}${i-1}"]?.toList(),
                        listOf(Pair<Char, Long>(it.value[0][1], 1))
                    ).flatten()

                    "${it.key}$i" to addUpPairs(lookup)
                }

        }

        // Dump the resulting cache to std out for debugging
        println("Cache content")
        cacheNext.entries.forEach {
            println("${it.key} has characters ${it.value.entries}")
        }

        return cacheNext
    }

    private fun calculateZeroInternal(basePairs: List<String>): Map<String, CacheLine> =
        basePairs.associate { "${it}0" to emptyMap() }

    private fun countLetters(input: String): CacheLine =
        input.toCharArray().toList().groupingBy { it }.eachCount().mapValues { it.value.toLong() }


    fun run1() {
        work1(process1(data2), 10)
    }

    fun run2() {
        work1(process1(data2), 40)
    }

    fun run1_2() {
        work2(process1(data1), 40)
    }

    fun run1_3() {
        work3(process2(data2), 10)
    }

    fun run1_4() {
        work4(process1(data2), 40)
    }
}

typealias CacheLine = Map<Char, Long>