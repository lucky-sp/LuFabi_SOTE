package Exercise2.Exercise10_2Test;

import Exercise2.Exercise10_2.Exceptions.ResultOutOfRangeException;
import Exercise2.Exercise10_2.Main10_2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Main10_2_Test {

    @Test(expected = ResultOutOfRangeException.class)
    public void TestFaculty_OutOfRangeException() throws ResultOutOfRangeException {
        //when
        Main10_2.faculty(21);
    }

    @Test
    public void TestFaculty_CalculateZero() throws ResultOutOfRangeException {
        //when
        long result = Main10_2.faculty(0);
        //then
        assertEquals(1,result);
    }
    @Test
    public void TestFaculty_CalculateEight() throws ResultOutOfRangeException {
        //when
        long result = Main10_2.faculty(8);
        //then
        assertEquals(40320,result);
    }

}
