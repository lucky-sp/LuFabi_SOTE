package AirlineSolution1;

import AirlineSolution1.Crew;

public class CrewMember extends Crew {

    public static String getCrewMember() {
        return "AirlineSolution1.CrewMember";
    }
    public static String getNoCrewMember(){
        return "noCrewMember";
    }


    public String position(String position) {
        if (position.equals(getCrewMember())) {
            System.out.println("You are registered as a AirlineSolution1.Crew Member");
            return getCrewMember();
        }
        return getNoCrewMember();
    }


}
