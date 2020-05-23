package Exercise2;

public class Plane {

    private int id;
    private int amountSeats;
    private String engine;

    public Plane(int id, int amountSeats, String engine) {
        this.id = id;
        this.amountSeats = amountSeats;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmountSeats() {
        return amountSeats;
    }

    public String getEngine() {
        return engine;
    }

    public Plane copy() {
        return new Plane(this.getId(), this.getAmountSeats(), this.getEngine());
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", amountSeats=" + amountSeats +
                ", engine='" + engine + '\'' +
                '}';
    }
}
