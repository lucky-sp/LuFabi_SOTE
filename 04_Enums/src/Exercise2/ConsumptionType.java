package Exercise2;

public enum ConsumptionType {

    L("Liter"),
    kWh("Kilowatt-Stunde");

    private String consumptionTypeName;

    ConsumptionType(String consumptionTypeName) {
        this.consumptionTypeName = consumptionTypeName;
    }

    public String getConsumptionTypeName() {
        return consumptionTypeName;
    }
}
