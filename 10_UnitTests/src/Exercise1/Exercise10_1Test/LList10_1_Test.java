package Exercise1.Exercise10_1Test;

import static org.junit.Assert.*;

import Excercise2.Exceptions.ListISEmptyException;
import Excercise2.Exceptions.OutOfRangeException;
import Exercise10_1.LList10_1;
import org.junit.Test;

public class LList10_1_Test {

    @Test(expected= ListISEmptyException.class)
    public void TestPut_ListIsEmpty() throws OutOfRangeException, ListISEmptyException {
        //given
        LList10_1<Object> list = new LList10_1<>();
        //when
        list.put(0, "CarXX");
    }
    @Test(expected= OutOfRangeException.class)
    public void TestPut_OutOfRange() throws OutOfRangeException, ListISEmptyException {
        //given
        LList10_1<Object> list = new LList10_1<>();
        list.insert("Car1");
        //when
        list.put(2, "CarXX");
    }
    @Test
    public void TestSize_Calculate() {
        //given
        LList10_1<Object> list = new LList10_1<>();
        list.insert("Car1");
        list.insert("Car2");
        list.insert("Car3");
        //when
        int result = list.size();
        assertEquals(3,result);
    }

}