import org.junit.jupiter.api.Test

internal class Day01Test {

    @Test
    fun Problem1_1() {
        Day01.work(Day01.process(Day01.data1))
    }

    @Test
    fun Problem1_2() {
        Day01.work(Day01.process(Day01.data2))
    }

    @Test
    fun Problem2_2() {
        Day01.work2(Day01.process(Day01.data2))
    }
}