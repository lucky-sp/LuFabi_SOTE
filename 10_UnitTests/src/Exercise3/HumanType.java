package Exercise3;

public enum HumanType {
    PILOT("pilot") , CREWMEMBER("crew member") , PASSENGER("passenger");

    private String typeName;

    private HumanType(String typeName){
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

}
