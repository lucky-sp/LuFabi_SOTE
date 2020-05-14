public abstract class AirlinePersons {

    public String category;
    public String type;

    public abstract String position(String position);



    public void activity(String exec, Crew[] crew) {
        if (exec.equals("1")) {
            System.out.println("Here are the flight details ...");

        }
    }
}