package Exercise1;

public abstract class Human {

    protected String name;
    protected Types position;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", position=" + position.getName() +
                '}';
    }

    public Human(String name, Types position) {
        this.name = name;
        this.position = position;
    }
}
