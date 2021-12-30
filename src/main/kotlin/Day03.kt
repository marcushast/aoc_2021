object Day03 {

    val data1 = """
        00100
        11110
        10110
        10111
        10101
        01111
        00111
        11100
        10000
        11001
        00010
        01010
    """.trimIndent()

    val data2 = """
        101011111001
        100100110111
        101010101011
        010100010000
        001101101101
        110001101010
        001001011001
        101111101111
        110001001000
        111111000000
        111100110001
        101100010100
        000010000011
        000110000011
        101010100101
        000111001010
        100101101110
        111111010101
        110010001100
        000011001101
        001001111110
        100101001100
        000011100100
        000100110011
        000101101000
        101010011011
        101011110000
        010010110011
        110110101110
        001110000110
        001110111101
        110111100101
        000010101010
        101010101010
        011011001101
        110110000111
        011010011000
        000111000101
        100000101011
        010010101100
        110000101110
        000010001001
        101010001100
        101111110101
        101111011110
        110011100001
        011011100100
        111100011010
        110110101001
        101011100010
        111000110110
        111011100101
        111000001111
        101110110011
        111101000000
        101111100110
        011111101101
        100111110111
        000111011011
        001001001111
        100010110000
        001101010000
        100101101001
        100001010000
        110101110001
        100111111111
        101101000101
        001110100110
        101010110000
        101111010010
        101011100101
        001110010100
        011110110100
        100011000000
        001000000100
        010000010001
        101101111011
        111010001011
        101010100000
        101001000000
        001000010101
        010011000111
        101010111100
        111101000101
        111111100010
        100010011101
        101001111101
        010111001111
        111111110110
        100111101010
        010101000101
        100101010010
        010110010001
        011101000111
        011110011010
        100000111100
        011111111000
        001111010001
        110110100111
        111000001011
        110010010011
        101010110010
        110000110111
        101111010000
        110111010000
        110011100011
        010000100111
        001010110001
        011101011010
        110111010010
        011001001101
        101101001111
        011101110100
        001101101110
        011011101101
        111001010001
        001100101000
        010011100000
        011000010100
        111000111111
        001001100001
        010011001010
        001110101100
        010010111010
        000111111011
        010010000110
        110001100100
        001110110111
        000010001111
        100011100001
        100001101110
        100001110111
        010110100000
        100101101111
        001100000111
        101100111001
        100100001100
        100000101100
        010101000110
        101110001000
        101110000110
        101110011100
        001001010001
        110111101011
        101001000001
        111100111110
        001100010100
        010001111111
        110011000011
        100110011101
        011010100100
        011111000011
        000110001000
        010010111111
        010011111011
        001000111110
        000111101011
        100010111100
        010110001111
        011011000000
        010111000011
        010001011111
        111000101100
        010110110000
        001100111011
        011110100101
        100011100011
        001000101000
        101011001011
        101111001111
        111000100101
        111101100111
        111010101000
        001110000111
        010101011110
        001111010100
        101011011101
        000111101010
        000011001011
        111000010001
        011001011011
        011011011001
        011110111000
        000010001100
        011110010000
        010000101001
        101011011111
        100111001100
        101000011100
        111000000100
        011100110000
        011100101010
        010001110011
        100100100010
        011110010010
        011000100111
        110101000101
        111011000001
        011000010111
        010011110011
        011001000001
        000100101110
        100111110001
        010010011010
        111101011001
        100110101111
        100010001100
        010010000111
        100011100100
        111001111011
        110000010111
        101001010001
        011111001010
        110111111100
        000101111101
        101011000111
        000100010000
        111100001111
        100000110010
        110001110100
        000001001100
        000101000001
        100111101011
        011000110110
        101111000000
        010100101100
        101111100011
        100111001101
        100000010010
        100101001111
        011110100010
        110110100110
        100000100001
        110100001110
        010011001111
        011010010000
        000000010101
        111111011100
        000011100000
        011110111101
        110000011100
        011011011000
        010100111010
        010010100101
        001110100011
        000110000100
        100111000101
        000010001000
        110110110000
        010011000100
        011001100010
        110000011110
        000110100111
        010111111011
        011100000011
        100011101110
        001100011010
        000010100100
        000011110000
        000000101000
        101001101001
        101111010101
        101100101101
        110000000000
        111011001110
        001100101110
        100101111000
        010001000111
        111100111010
        000100011101
        010001000011
        100000101001
        111111101101
        000000011101
        001101110110
        001100000101
        010110011110
        001011100100
        110001100101
        001011110011
        011101111000
        001001100110
        000001011000
        001011010000
        110001010100
        000100011011
        010101101010
        101000101010
        101111011000
        110001010111
        111100110011
        101011101000
        000100010110
        111010000110
        000100000001
        101011110101
        010010010011
        100101011001
        100101001010
        110100110101
        010011100111
        100110010101
        111010000011
        011011110110
        111000101110
        001011101100
        010110100010
        011001101011
        011000101101
        011011111110
        011011111001
        100001001101
        101110011011
        001111011100
        111110010011
        000010101011
        001111101010
        100001101000
        111100100000
        010011100100
        011101101100
        000001101011
        001100001110
        000011000111
        100110001000
        101101101011
        001011011110
        101010111101
        101110100110
        011111000100
        111101111000
        001011110111
        010010011001
        111110110001
        100101000100
        011011010101
        100010010000
        100010101000
        110010000100
        000001001111
        101110011010
        010000111111
        111101010001
        100000000000
        011101100110
        001110101101
        001001110010
        110011101001
        101101011001
        000000110101
        011101100011
        010100000011
        101011110010
        100101000010
        100110001100
        000111111010
        111100011001
        111110101001
        010000111000
        100110000011
        100011001110
        000100010010
        001101100100
        000000001100
        011101001001
        100001001000
        101100111000
        110011011111
        111110101110
        101101001010
        111000011001
        111110011001
        110111010100
        011001111011
        101101111000
        010010010100
        100000110110
        011110010100
        010010101010
        001111100100
        100000011101
        110100010010
        101101100000
        111001111010
        010001100110
        011000110101
        011110010011
        011111100000
        001000101100
        000100010111
        011000101010
        011000010110
        010001101011
        110101010000
        000100100100
        011011001100
        010100011101
        100111110110
        111010000001
        001001111111
        010100001111
        011111101011
        011000011011
        111010000100
        110001001111
        111011011010
        001110001110
        100100101001
        101101101001
        001100001001
        001000001110
        101111000010
        000110001110
        101111110010
        110011001011
        000000010100
        110100110001
        111000011111
        100000001110
        100100011011
        101100100011
        011101000010
        001100100101
        111110101101
        011100001001
        101100000110
        101011010011
        000101101100
        001011101001
        110000000101
        011111011110
        000001100110
        100110011011
        111010100100
        011001101001
        010111110011
        110111000000
        011100101011
        010110100111
        110011001001
        000010111011
        101110010110
        000001011001
        100101000111
        110110111011
        000101110001
        100000111101
        011110001011
        000101010101
        101011110011
        000110011001
        101010000001
        100001011110
        010000000111
        000011100110
        100111100010
        110101000111
        001010101110
        111000100000
        001100101101
        000111010111
        101110000000
        011111000010
        111000001110
        001100110101
        101001000100
        010111011101
        000100000100
        111111000111
        111011001111
        101000011110
        110011101101
        111101000011
        101101111001
        010010010101
        110000100010
        000100100111
        000110111111
        000011001000
        011011100001
        101100111101
        011111000001
        000110101100
        010010111001
        111100101110
        100111010100
        011111000000
        001011001000
        101111000011
        000100001010
        110100010000
        110001000011
        010010101111
        001010001010
        010001110001
        011000001101
        101001010111
        000000011100
        010011111000
        110010011011
        001110100111
        011101000011
        111110011101
        100111000000
        101011101110
        111000010111
        101001000011
        011110011001
        000100010001
        101110000100
        111101101101
        000100100110
        010011010001
        000101100110
        010111110001
        001110111100
        100000111111
        101100000011
        110011000100
        100000001011
        010101100000
        101010000101
        010110101101
        010011100001
        001101001111
        101100100111
        100000001101
        100100101100
        101111010111
        010101001100
        011001111111
        010111110000
        010100110101
        101111010001
        111101111100
        011010011011
        111100110100
        111110001010
        011110011111
        000110001100
        011001010111
        000010010111
        011100101111
        111110111000
        110010110010
        000101111010
        001010010100
        100110110001
        101101010001
        100001111011
        010101001001
        000001000010
        100101100011
        010100101010
        001001001100
        101000110110
        111110001000
        100101110010
        001000111011
        100111010111
        000000110000
        110101111000
        011000101110
        110101001111
        101000010010
        101011000010
        100110000111
        110101011001
        110010010100
        010000001111
        110011011001
        111010110100
        010000101010
        101100111011
        000000011010
        110110001000
        001011011011
        101110100001
        010100011011
        111101001101
        010000011001
        110010100100
        101101011010
        110000100001
        010101111000
        101000111010
        011011010100
        011110011101
        010000100100
        001111101001
        010011110000
        111000100111
        010101010101
        000001001010
        010001001100
        111011111100
        001110000011
        110101101000
        111010011110
        110011010011
        001010101101
        001111110001
        110001011110
        011110010001
        010010000100
        111010111001
        000100111111
        000001010101
        001010110111
        000110010011
        000010011111
        011110100001
        011111010110
        001110010110
        001001000011
        101111011101
        011100110111
        010000001101
        010010100111
        010000110011
        011110110111
        010000110110
        011101011011
        000010100001
        001100011111
        011110110000
        111011011011
        101011101111
        010001000101
        010100001000
        010100101110
        001000000101
        001001011011
        111001000101
        110101110100
        111111010111
        101010100111
        110000011010
        000100100000
        011101000001
        000011000001
        010101010001
        010010011100
        010001110101
        010110110111
        010011110010
        011011100110
        000110100011
        100010100011
        101111110011
        001011100101
        011101110000
        110001110000
        111010010000
        111111000011
        010010001100
        010111101010
        010010101000
        111001010111
        010110110011
        001101110010
        011111001111
        010100110100
        010010100100
        101011101100
        000111101001
        000001011010
        101010111000
        100011111111
        100100011111
        111000010010
        011011100010
        000111010010
        101010101111
        010000100101
        100110110101
        011011100011
        011011110011
        111011000100
        100010001010
        110000010000
        100101011111
        101100001100
        111110101111
        100111000100
        011101001110
        100011011101
        111101011010
        110101111001
        001000110101
        111110101100
        001010010111
        100110000000
        110101010100
        110110001101
        011110101101
        100110101110
        000000000010
        011010111001
        000001101111
        000100000101
        110000100011
        001010000101
        100111011010
        000001101001
        001011000001
        000111100110
        111111110011
        000101000000
        111000110000
        000010000111
        000101010001
        000011110001
        101100110100
        100001111110
        001111111111
        100011000110
        011100011001
        101011110100
        001010001111
        100010100001
        001111100110
        010110110010
        110010110101
        011000110011
        000101011110
        101000100100
        010110010110
        001000000110
        110000100100
        011101101011
        100100000111
        000111010101
        110111000100
        001010110000
        101001110001
        001001101011
        101000100101
        111111000010
        000010110101
        110000000110
        000100110000
        111111011011
        101101100101
        011001010010
        111111101111
        000111101101
        100110110011
        110000001000
        111000001101
        110011010010
        110110111110
        000001011111
        001100001010
        111101011100
        010010100010
        110100011011
        110001101011
        010111111010
        011111100100
        001010010110
        001010111111
        111110111110
        011010000110
        111111111001
        011011011110
        001010011101
        001110010111
        001001111100
        110010111000
        000111000100
        001100001000
        110110110100
        101001010000
        000101000101
        010101101100
        101010110110
        111101011000
        101010011100
        110010110011
        111110001110
        100100101110
        001010000000
        001000110010
        101000111111
        111110111101
        000110010110
        101100100110
        100010011001
        100110100010
        111101100110
        111100111111
        010111011011
        111100011111
        001010010011
        111101010010
        110111001010
        010110000000
        011111011001
        101011100011
        011100110011
        111100011110
        101001001001
        100101100110
        000100110010
        010011101110
        000011110111
        000000011111
        110011011100
        111110100100
        101110101111
        001101011000
        101101110001
        101011000100
        111001101100
        110111111001
        011010101001
        000000000000
        111100000101
        110010111001
        000100001110
        110101111100
        110010011111
        001001110111
        111111111111
        000110011100
        110101111010
        011010111011
        111000000101
        011110100111
        001010101111
        001011011001
        101010001011
        100001000000
        111110111010
        001110111110
        000000110100
        111110111001
        111000010101
        110011110111
        110111001101
        111011010010
        110100000110
        100111111100
        010001100010
        111100010000
        100111011101
        101001000111
        111110110011
        010101010100
        101000110111
        000111101100
        100001011001
        010000011111
        000100101011
        011011011010
        001111000010
        111001101011
        100011010111
        110111100111
        100001010110
        100001110101
        100110110111
        011111111011
        111111101110
        111111001000
        101010000110
        110010010110
        100110100111
        011101011100
        011010011101
        101111101101
        110111010110
        110000000100
        110000110100
        001100000110
        001011001101
        001010011111
        011001110000
        100111100100
        001111000000
        110100011001
        110000110011
        000000101101
        111101111111
        111111010010
        011101101110
        111101101100
        100000110000
        110101010001
        101001110100
        010010110110
        111011000111
        101100000100
        010011010101
        111101000001
        101001111000
        101110000011
        001011011101
        111010000010
        001001110100
        111111001001
        001001010000
        001110000001
        111100000000
        010101110100
        000101011011
        001100011001
        001110001100
        001110100010
        000000100111
        000100111000
        110100101100
        110100111010
        111001101101
        111100101011
        011101100000
        100000100011
        010111110010
        010011001000
        101001100110
        100110001111
        000110110101
        111001110110
        000101010110
        011000011010
        010100110110
        110100111111
        111000110011
        001011111000
        001000000000
        111111010100
        111111100110
        000000001111
        110001000001
        010000101000
        101111111010
        100100001101
        111011110100
        110101110011
        010111111110
        001000101111
        100110101100
        110010010010
        010010001000
        011111101100
        111100100011
        110111101000
        100000111001
        001011100011
        001010111100
        000100001100
        010111000110
        001111000101
        001110000010
        110100101000
        001110000101
        101000110000
        001001011101
        101001011001
        011110100011
        101010010110
        101000001101
        110111111111
        010010001101
        011100010110
        000100100001
        001111111101
        001001111000
        001100101111
        111010111100
        110100010111
        000000010011
        100110110000
        101100101111
        100011010100
        001001101110
        110001101000
        110101101110
        010011110101
        010000110001
        100011111000
        111110000010
        100111100000
        100001100110
        110111000110
        000101100011
        010110001100
        100000100010
        001011000000
        110101000010
        101110101001
        011010100110
        111111110000
        001010110010
        010000001011
        100000010011
        010111010111
        101111100010
        010100010011
    """.trimIndent()

    fun process(data: String): List<IntArray> =
        data.lines().map {
            it.toCharArray().map { it.digitToInt() }.toIntArray()
        }

    fun work1(data: List<IntArray>) {
        val sum = data.reduce { acc, it -> IntArray(it.size) { i -> acc[i]+it[i] } }

        println("sum")
        sum.forEach { print("$it, ") }
        println()

        val half = data.size/2
        println("Half is $half")

        val gamma = IntArray(sum.size) { i -> if (sum[i] > half) 1 else 0 }

        println("gamma")
        gamma.forEach { print("$it, ") }
        println()

        val gammaInt = Integer.parseInt(gamma.joinToString(""), 2 )
        println("Gamma as int is $gammaInt")

        val epsilon = IntArray(sum.size) { i -> if (sum[i] < half) 1 else 0 }

        println("epsilon")
        epsilon.forEach { print("$it, ") }
        println()

        val epsilonInt = Integer.parseInt(epsilon.joinToString(""), 2 )
        println("epsilon as int is $epsilonInt")

        println("Multiply gamma and epsilon is " + (gammaInt*epsilonInt))
    }

    private fun IntArray.asBinaryAsInt() =
        Integer.parseInt(this.joinToString(""), 2 )

    fun work2(data: List<IntArray>) {
        val oxygenSort = o2BestMatch(data)

        val o2 = oxygenSort.asBinaryAsInt()
        println("oxygen int $o2")

        val co2Sort = co2BestMatch(data)

        val co2 = co2Sort.asBinaryAsInt()
        println("CO2 int $co2")

        println("Multiply O2 and CO2 is " + (o2*co2))
    }

    private fun o2BestMatch(list: List<IntArray>): IntArray {
        var filteredList = list

        for (i in 0..list.first().size) {
            filteredList = filteredList.o2BestMatch(i)
            if (filteredList.size == 1) break
        }

        return filteredList.first()
    }

    private fun co2BestMatch(list: List<IntArray>): IntArray {
        var filteredList = list

        for (i in 0..list.first().size) {
            filteredList = filteredList.co2BestMatch(i)
            if (filteredList.size == 1) break
        }

        return filteredList.first()
    }

    private fun List<IntArray>.o2BestMatch(position: Int): List<IntArray> {
        val numberOnes = this.count { it[position] == 1 }
        val numberZeros = this.count { it[position] == 0 }

        val matchNumber = if(numberZeros > numberOnes) 0 else 1

        return this.filter { it[position] == matchNumber }
    }

    private fun List<IntArray>.co2BestMatch(position: Int): List<IntArray> {
        val numberOnes = this.count { it[position] == 1 }
        val numberZeros = this.count { it[position] == 0 }

        val matchNumber = if(numberOnes >= numberZeros) 0 else 1

        return this.filter { it[position] == matchNumber }
    }
}
