package AirlineSolution1;

public abstract class Crew extends AirlinePersons {

    public static String getCrew() {
        return "Crew";
    }
    public static String getNoCrew(){
        return "noCrew";
    }

    public String category(AirlinePersons person) {
        if (person.type.equals(Pilot.getPilot()) | person.type.equals(CrewMember.getCrewMember())) {
            return getCrew();
        }
        else {
            return getNoCrew();
        }

    }

    public void activity(String exec, Crew[] crew) {
        if (exec.equals("2")) {
            if (this.type.equals(CrewMember.getCrewMember()) | crew[0].category.equals(Crew.getCrew())) {
                System.out.println("Here is the passenger list ...");
            } else {
                System.out.println("You are not authorized to retrieve the passenger list");
            }
        }
    }
}
