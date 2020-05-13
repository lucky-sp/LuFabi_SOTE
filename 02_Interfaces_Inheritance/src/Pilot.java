public class Pilot extends AirlinePersons {

    public void activity(String exec) {
        if (exec.equals("3")) {
            if (this.type.equals("Pilot")) {
                System.out.println("Flight cancelled");
            } else {
                System.out.println("You are not authorized to cancel the flight");
            }
        }
    }

    public String position(String position) {
        if (position.equals("Pilot")) {
            System.out.println("You are registered as a Pilot");
            return "Pilot";
        }
        return "noPilot";
    }

}
