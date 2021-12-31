import org.junit.jupiter.api.Test

internal class Day04Test {

    @Test
    fun work1_1() {
        Day04.work1(Day04.process(Day04.data1))
    }

    @Test
    fun work1_2() {
        Day04.work1(Day04.process(Day04.data2))
    }

    @Test
    fun work2_1() {
        Day04.work2(Day04.process(Day04.data1))
    }

    @Test
    fun work2_2() {
        Day04.work2(Day04.process(Day04.data2))
    }
}