package Exercise9;

import Exercise7.Passenger;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class main07_9 {
    public static void main (String[] args) {

        Map<String, Boolean> passengerEntered = new HashMap<>();
        passengerEntered.put("Sabine", true);
        passengerEntered.put("Thomas", false);
        passengerEntered.put("Sonja", false);
        passengerEntered.put("Nina", true);
        passengerEntered.put("Horst", true);

       // Set<String> collection = new TreeSet<>()

        for (String key : passengerEntered.keySet()) {
            System.out.println(key + " : " + passengerEntered.get(key));
        }
    }
}
