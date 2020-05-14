public class Passenger extends AirlinePersons {


    public String position(String position) {
        if (!position.equals("Pilot") & !position.equals("Crew"))
            System.out.println("You are registered as a Passenger");
        return "Passenger";
    }



}


