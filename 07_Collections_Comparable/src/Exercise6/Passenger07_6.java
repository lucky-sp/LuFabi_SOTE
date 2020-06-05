package Exercise6;

public class Passenger07_6 {
    String name;
    Passenger07_6 nextPassenger;

    public Passenger07_6(String name ){
        this.name = name;
    } 

    public Passenger07_6 getNextPassenger() {
        return nextPassenger;
    }

    public void setNextPassanger(Passenger07_6 nextPassanger) {
        this.nextPassenger = nextPassanger;
    }


    public void setNextPassenger(Passenger07_6 passenger) {
    }
}