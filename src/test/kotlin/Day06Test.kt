import org.junit.jupiter.api.Test

internal class Day06Test {

    @Test
    fun work1_1() {
        Day06.work1(Day06.process(Day06.data1), 80)
    }

    @Test
    fun work1_2() {
        Day06.work1(Day06.process(Day06.data2), 80)
    }

    @Test
    fun work2_2() {
        Day06.work2(Day06.process(Day06.data2), 256)
    }
}