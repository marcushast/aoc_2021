object Day06 {

    val data1 = """
        3,4,3,1,2
    """.trimIndent()

    val data2 = """
        5,1,5,3,2,2,3,1,1,4,2,4,1,2,1,4,1,1,5,3,5,1,5,3,1,2,4,4,1,1,3,1,1,3,1,1,5,1,5,4,5,4,5,1,3,2,4,3,5,3,5,4,3,1,4,3,1,1,1,4,5,1,1,1,2,1,2,1,1,4,1,4,1,1,3,3,2,2,4,2,1,1,5,3,1,3,1,1,4,3,3,3,1,5,2,3,1,3,1,5,2,2,1,2,1,1,1,3,4,1,1,1,5,4,1,1,1,4,4,2,1,5,4,3,1,2,5,1,1,1,1,2,1,5,5,1,1,1,1,3,1,4,1,3,1,5,1,1,1,5,5,1,4,5,4,5,4,3,3,1,3,1,1,5,5,5,5,1,2,5,4,1,1,1,2,2,1,3,1,1,2,4,2,2,2,1,1,2,2,1,5,2,1,1,2,1,3,1,3,2,2,4,3,1,2,4,5,2,1,4,5,4,2,1,1,1,5,4,1,1,4,1,4,3,1,2,5,2,4,1,1,5,1,5,4,1,1,4,1,1,5,5,1,5,4,2,5,2,5,4,1,1,4,1,2,4,1,2,2,2,1,1,1,5,5,1,2,5,1,3,4,1,1,1,1,5,3,4,1,1,2,1,1,3,5,5,2,3,5,1,1,1,5,4,3,4,2,2,1,3
    """.trimIndent()

    // When a fish hits 0 it breeds and resets to 6
    // A new fish starts at 8

    fun process(data: String): List<Int> =
        data.split(",").map { it.toInt() }

    fun work1(data: List<Int>, days: Int) {
        var iterating = data
        repeat(days) {
            val spawn = iterating.count { it == 0 }
            iterating = iterating.map { if(it>0) it-1 else 6 } + Array(spawn) { 8 }.toList()
        }

        println("After $days days there are ${iterating.size} fishes")
    }

    fun work2(data: List<Int>, days: Int) {
        val init = data.groupingBy { it }.eachCount().toList().sortedBy { it.first }
        // [(1, 121), (2, 47), (3, 38), (4, 44), (5, 50)]

        val fishes = Array<Long>(7) { 0 }
        for (age in init) {
            fishes[age.first] = age.second.toLong()
        }

        var step8: Long = 0
        var step7: Long = 0

        for(day in 0 until days) {
            val currentIndex = day%7
//            println("Day $day looking at $currentIndex")
            val spawning = fishes[currentIndex]

            fishes[currentIndex]+=step7
            step7 = step8
            step8 = spawning
        }

        val totalFishes = fishes.sum() + step7 + step8
        println("After $days days there are $totalFishes fishes")
//        println(fishes.mapIndexed { i, count -> "$i = $count" }.joinToString(separator = ", "))
    }
}