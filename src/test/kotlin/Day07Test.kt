import org.junit.jupiter.api.Test

internal class Day07Test {

    @Test
    fun work1_1() {
        Day07.work1(Day07.process(Day07.data1))
    }

    @Test
    fun work1_2() {
        Day07.work1(Day07.process(Day07.data2))
    }

    @Test
    fun work2_1() {
        Day07.work2(Day07.process(Day07.data1))
    }

    @Test
    fun work2_2() {
        Day07.work2(Day07.process(Day07.data2))
    }
}