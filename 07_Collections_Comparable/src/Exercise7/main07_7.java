package Exercise7;

import java.util.TreeSet;
import java.util.Set;

public class main07_7 {
    
    public static void main(String[] args){
        
        Set<Passenger> set = new TreeSet<>();
        set.add(new Passenger("Peter"));
        set.add(new Passenger("Lisa"));
        set.add(new Passenger("Günter"));
        set.add(new Passenger("Nina"));
        set.add(new Passenger("Norbert"));

        for (Passenger passenger : set){
            System.out.println(passenger);
        }
    }
}