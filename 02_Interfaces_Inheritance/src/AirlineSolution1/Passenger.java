package AirlineSolution1;

import AirlineSolution1.AirlinePersons;

public class Passenger extends AirlinePersons {

    public static String getPassenger() {
        return "Passenger";
    }
    public static String getNoPassenger(){
        return "noPassenger";
    }

    public String position(String position) {
        if (position.equals(getPassenger())) {
            System.out.println("You are registered as a Passenger");
            return getPassenger();
        }
        else {
            return getNoPassenger();
        }
    }
}


