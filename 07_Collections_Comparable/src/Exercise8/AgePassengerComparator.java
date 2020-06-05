package Exercise8;

import java.util.Comparator;

public class AgePassengerComparator implements Comparator<Passenger> {

    @Override
    public int compare(Passenger p1, Passenger p2) {
        int dif = p1.age - p2.age;
        return dif;
    }
}

