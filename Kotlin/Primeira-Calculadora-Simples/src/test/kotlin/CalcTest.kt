import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalcTest {

    @Test
    fun suMTest(){

        assertEquals(20.0, Calc.suM(10.0, 10.0))
    }
    @Test
    fun suBTest(){

        assertEquals(20.0, Calc.suB(30.0, 10.0))
    }
    @Test
    fun diVTest(){

        assertEquals(20.0, Calc.diV(40.0,2.0))
    }
    @Test
    fun mulTTest(){

        assertEquals(20.0, Calc.mulT(10.0, 2.0))

    }


}

