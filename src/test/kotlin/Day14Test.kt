import org.junit.jupiter.api.Test

internal class Day14Test {

    @Test
    fun run1() {
        Day14.work1(Day14.process1(Day14.data1), 10)
    }

    @Test
    fun run2() {
        Day14.work2(Day14.process1(Day14.data1), 10)
    }

    @Test
    fun run3() {
        Day14.work3(Day14.process2(Day14.data1), 10)
    }

    @Test
    fun run4_1() {
        Day14.work4(Day14.process1(Day14.data2), 10)
    }

    @Test
    fun run4_2() {
        Day14.work4(Day14.process1(Day14.data2), 40)
    }
}