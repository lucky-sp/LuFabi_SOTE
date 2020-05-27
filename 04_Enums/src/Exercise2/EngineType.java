package Exercise2;

public enum EngineType {

    DIESEL("Diesel"){
        public int getTax(int cc) {
            return cc/10;
        }
    },
    PETROL("Benzin"){
        public int getTax(int cc) {
            return cc/20;
        }
    },
    ELECTRIC("Elektrisch"){
        public int getTax(int cc) {
            return 40;
        }
    };

    private String name;

    private EngineType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getTax(int cc);
}
