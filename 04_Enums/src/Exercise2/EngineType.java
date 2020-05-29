package Exercise2;

public enum EngineType {

    DIESEL("Diesel",ConsumptionType.L){
        public int getTax(int cc) {
            return cc/10;
        }
    },
    PETROL("Benzin",ConsumptionType.L){
        public int getTax(int cc) {
            return cc/20;
        }
    },
    ELECTRIC("Elektrisch",ConsumptionType.kWh){
        public int getTax(int cc) {
            return 40;
        }
    };

    private String name;
    private ConsumptionType consumptionType;

    private EngineType(String name, ConsumptionType consumptionType) {
        this.name = name;
        this.consumptionType = consumptionType;
    }

    public String getName() {
        return name;
    }
    public ConsumptionType getConsumptionType() {
        return this.consumptionType;
    }

    public abstract int getTax(int cc);
}
