package AirlineSolution1;

import AirlineSolution1.*;

import java.util.Scanner;

public class MainAirlineSystem {


    public static void main(String[] args) {

        Scanner scannObj = new Scanner(System.in);
        Crew[] crewPerson = new Crew[2];
        crewPerson[0] = new Pilot();
        crewPerson[1] = new CrewMember();

        AirlinePersons[] allAirlinePersons = new AirlinePersons[3];
        allAirlinePersons[0] = crewPerson[0];
        allAirlinePersons[1] = crewPerson[1];
        allAirlinePersons[2] = new Passenger();

        System.out.println("Enter your position in the airline system.");
        System.out.println("You can choose between:");
        System.out.println("AirlineSolution1.Pilot");
        System.out.println("AirlineSolution1.CrewMember");
        System.out.println("AirlineSolution1.Passenger");
        System.out.print("Enter:");
        String position = scannObj.nextLine();

        for (int i = 0; i < allAirlinePersons.length; i++) {
            allAirlinePersons[i].type = allAirlinePersons[i].position(position);
            for (int j = i; j < crewPerson.length; j++) {
                allAirlinePersons[j].category = crewPerson[j].category(allAirlinePersons[i]);
            }
        }

        System.out.println("Please enter what you want to do:");
        System.out.println("1/ get flight infos");
        System.out.println("2/ retrieve passenger list (if you are AirlineSolution1.Crew)");
        System.out.println("3/ cancel flight (if you are a pilot");
        boolean loop = true;
        while (loop) {
            System.out.print("Enter your selection:");
            String selection = scannObj.nextLine();
            for (int i = 0; i < allAirlinePersons.length; i++) {
                allAirlinePersons[i].activity(selection,crewPerson);
            }
            System.out.print("If you want to continue, enter 1, if you want to abort enter something else");
            String abort = scannObj.nextLine();
            if (!abort.equals("1")) {
                loop = false;
            }
        }
        scannObj.close();
    }
}