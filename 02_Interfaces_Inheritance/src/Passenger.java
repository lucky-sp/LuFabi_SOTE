public class Passenger extends AirlinePersons {

    public String position() {
        return "Passenger";
    }

    public String position(String position) {
        if (!position.equals("Pilot") & !position.equals("Crew"))
            System.out.println("You are registered as a Passenger");
        return "Passenger";
    }

    public void activity(String exec) {
        if (exec.equals("1")) {
            System.out.println("Here are the flight details ...");

        }
    }
}


