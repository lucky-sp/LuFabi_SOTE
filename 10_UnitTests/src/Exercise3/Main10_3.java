package Exercise3;

import java.util.List;
import java.util.LinkedList;

/**
 * Solution for Session Unit Tests Exercise3
 * @author Lukas
 *
 */


public class Main10_3 {
    public static void main(String args[]) throws NotAuthorizedException{
        List<Human> flightList = new LinkedList<>();
        flightList.add(new Pilot("otto", 33));
        flightList.add(new Passenger("Lotti", 65));
        flightList.add(new Passenger("Susi", 43));
        flightList.add(new Passenger("Joe", 23));
        flightList.add(new CrewMember("Karl", 35));
        flightList.add(new Passenger("Zabrina", 14));

        printList.printPassengerList(flightList.get(0), flightList);
        printList.printPassengerList(flightList.get(4), flightList);
        printList.printPassengerList(flightList.get(3), flightList);

    }
}
