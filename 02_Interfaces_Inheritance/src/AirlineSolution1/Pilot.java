package AirlineSolution1;

import AirlineSolution1.Crew;

public class Pilot extends Crew {

    public static String getPilot() {
        return "Pilot";
    }
    public static String getNoPilot(){
        return "noPilot";
    }

    public void activity(String exec, Crew[] crew) {
        if (exec.equals("3")) {
            if (this.type.equals(getPilot())) {
                System.out.println("Flight cancelled");
            } else {
                System.out.println("You are not authorized to cancel the flight");
            }
        }
    }

    public String position(String position) {
        if (position.equals(getPilot())) {
            System.out.println("You are registered as a Pilot");
            return getPilot();
        }
        return getNoPilot();
    }

}
