public abstract class AirlinePersons {

    public String type;

    public abstract String position(String position);

    public void activity(String exec) {
        if (exec.equals("1")) {
            System.out.println("Here are the flight details ...");

        }
    }
}