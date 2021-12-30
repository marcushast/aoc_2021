import org.junit.jupiter.api.Test

internal class Day02Test {

    @Test
    fun work1_1() {
        Day02.work(Day02.process(Day02.data1))
    }

    @Test
    fun work1_2() {
        Day02.work(Day02.process(Day02.data2))
    }

    @Test
    fun work2_1() {
        Day02.work2(Day02.process(Day02.data1))
    }

    @Test
    fun work2_2() {
        Day02.work2(Day02.process(Day02.data2))
    }
}