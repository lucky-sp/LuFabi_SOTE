public class CrewMember extends AirlinePersons {

    public void activity(String exec) {
        if (exec.equals("2")) {
            if (this.type.equals("Crew") | this.type.equals("Pilot")) {
                System.out.println("Here is the passenger list ...");
            } else {
                System.out.println("You are not authorized to retrieve the passenger list");
            }
        }
    }

    public String position(String position) {
        if (position.equals("Crew")) {
            System.out.println("You are registered as a Crew Member");
            return "Crew";
        }
        return "noCrew";
    }
}
