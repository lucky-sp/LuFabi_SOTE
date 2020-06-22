package Exercise3.Test;

import Exercise3.*;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class printListTest {
    @Test(expected = Test.None.class /* no exception expected */)
    public void testprintList_printPassengerList() throws NotAuthorizedException {
        //given
        Human h1 = new Pilot("otto", 33);
        Human h2 = new CrewMember("Zabrina", 66);
        List<Human> flightList = new LinkedList<>();
        flightList.add(h1);
        flightList.add(h2);

        //when
        printList.printPassengerList(h1, flightList);
        printList.printPassengerList(h1, flightList);
    }

    @Test(expected = NotAuthorizedException.class)
    public void testprintList_NotAuthorizedException() throws NotAuthorizedException {
        //given
        Human h1 = new Passenger("otto", 33);
        List<Human> flightList = new LinkedList<>();
        flightList.add(h1);

        //when
        printList.printPassengerList(h1, flightList);
    }

}