import org.junit.jupiter.api.Test

internal class Day03Test {

    @Test
    fun work1_1() {
        Day03.work1(Day03.process(Day03.data1))
    }

    @Test
    fun work1_2() {
        Day03.work1(Day03.process(Day03.data2))
    }

    @Test
    fun work2_1() {
        Day03.work2(Day03.process(Day03.data1))
    }

    @Test
    fun work2_2() {
        Day03.work2(Day03.process(Day03.data2))
    }
}