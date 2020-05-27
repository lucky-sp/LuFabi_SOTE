package Exercise2;

public class Car {
    private String brand;
    private String model;
    private int cc;
    private EngineType type;
    private ConsumptionType consumptionType;

    public Car(String brand, String model, int cc, EngineType type) {
        this.brand = brand;
        this.model = model;
        this.cc = cc;
        this.type = type;
        this.consumptionType = type.getConsumptionType();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCc() {
        return cc;
    }

    public EngineType getType() {
        return type;
    }

    public int getTax() {
        return getType().getTax(cc);
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cc=" + cc +
                ", type=" + type.getName() +
                ", consumptionType=" + consumptionType.getConsumptionTypeName() +
                '}';
    }
}
