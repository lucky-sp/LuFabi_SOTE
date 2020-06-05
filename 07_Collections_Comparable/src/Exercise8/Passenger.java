package Exercise8;

public class Passenger implements  Comparable<Passenger>{
    public String name;
    public int age;

    public Passenger(String name, int age){
        this.name = name; this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return (this.name + " : " + this.age);
    }

    @Override
    public int compareTo(Passenger otherPassenger) {
        return this.name.compareTo(otherPassenger.name);
    }
}