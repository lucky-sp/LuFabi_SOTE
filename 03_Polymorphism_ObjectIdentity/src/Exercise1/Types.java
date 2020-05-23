package Exercise1;

public enum Types {
    Passenger("Passagier") {
    },
    Pilot("Pilot") {
    },
    CrewMember("Crew") {
    };


    private final String name;

    private Types(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
