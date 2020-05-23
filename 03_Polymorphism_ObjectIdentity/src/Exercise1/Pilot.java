package Exercise1;

public class Pilot extends CrewMember {

    private static Pilot pilot;
    private static boolean inList;

    public Pilot(String name, Types position) {
        super(name, position);
    }


    public static String checkPilot(Human[] list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] instanceof Pilot) {
                pilot = (Pilot) list[i];
                if (!inList) {
                    inList = true;
                    System.out.println("Dieser Pilot ist auf dem Flug als Pilot in der Passagierliste vermerkt: " +
                            pilot.name + " " + pilot.position.getName());
                    System.out.println("Listenplatz "+ i);
                    for (int j = ++i; j < list.length; j++) {
                        if (pilot.position.equals(list[j].position)) {
                            System.out.println("Dieser Pilot ist fälschlicherweise zusätzlich in der Passagierliste: " +
                                    list[j].name + " " + list[j].position.getName());
                            System.out.println("Listenplatz "+ j );
                        }
                    }

                }
            }
        }
        return "Suche abgeschlossen";
    }
}

