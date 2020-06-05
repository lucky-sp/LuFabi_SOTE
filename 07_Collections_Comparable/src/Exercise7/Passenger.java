package Exercise7;

public class Passenger implements  Comparable<Passenger>{
    public String name;

    public Passenger(String name ){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int compareTo(Passenger otherPassenger) {
        return this.name.compareTo(otherPassenger.name);
    }
}