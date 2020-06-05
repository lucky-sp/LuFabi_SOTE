package Exercise8;

import java.util.Set;
import java.util.TreeSet;

public class main07_8 {

    public static void main(String[] args){

        Set<Passenger> set = new TreeSet<>(new AgePassengerComparator());
        set.add(new Passenger("Peter", 23));
        set.add(new Passenger("Lisa", 13));
        set.add(new Passenger("Günter", 33));
        set.add(new Passenger("Nina", 53 ));
        set.add(new Passenger("Norbert", 3));

        for (Passenger passenger : set){
            System.out.println(passenger);
        }
    }
}
