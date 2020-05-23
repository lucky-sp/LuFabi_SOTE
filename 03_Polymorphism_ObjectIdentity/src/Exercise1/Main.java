package Exercise1;

public class Main {
    public static void main(String[] args) {
        Human[] list = new Human[6];
        list[0] = new Passenger("Michael", Types.Passenger);
        list[1] = new CrewMember("Beate", Types.CrewMember);
        list[2] = new Pilot("Daniel", Types.Pilot);
        list[3] = new Pilot("Denzel", Types.Pilot);
        list[4] = new Pilot("Elliot", Types.Pilot);
        list[5] = new Passenger("Ute", Types.Passenger);

        System.out.println(Pilot.checkPilot(list));
    }
}
