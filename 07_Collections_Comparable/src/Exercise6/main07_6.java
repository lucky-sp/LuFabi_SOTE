package Exercise6;

import java.util.LinkedList;
import java.util.List;

public class main07_6 {

    public static void main(String[] args) {

        List<Passenger> list = new LinkedList<>();
        list.add(new Passenger("Peter"));
        list.add(new Passenger("Lisa"));
        list.add(new Passenger("Günter"));
        list.add(new Passenger("Nina"));
        list.add(new Passenger("Norbert"));

        for (Passenger passenger : list) {
            System.out.println(passenger);
        }
    }
}
