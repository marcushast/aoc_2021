import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class Day05Test {

    @Test
    fun work1_1() {
        Day05.work1_2(Day05.process(Day05.data1))
    }

    @Test
    fun work1_2() {
        Day05.work1_2(Day05.process(Day05.data2))
    }

    @Test
    fun work2_1() {
        Day05.work2(Day05.process(Day05.data1))
    }

    @Test
    fun work2_2() {
        Day05.work2(Day05.process(Day05.data2))
    }

    @Test
    fun intersectTests() {
        assertTrue(Day05.intersectLines(Line(Point(0,9), Point(5,9)), Line(Point(0,9),Point(2,9))))

        assertFalse(Day05.intersectLines(Line(Point(0,9), Point(5,9)), Line(Point(6,9),Point(8,9))))

        assertFalse(Day05.intersectLines(Line(Point(0,9), Point(5,9)), Line(Point(0,8),Point(2,8))))
    }

//    0,9 -> 5,9
//    8,0 -> 0,8
//    9,4 -> 3,4
//    2,2 -> 2,1
//    7,0 -> 7,4
//    6,4 -> 2,0
//    0,9 -> 2,9
//    3,4 -> 1,4
//    0,0 -> 8,8
//    5,5 -> 8,2
}