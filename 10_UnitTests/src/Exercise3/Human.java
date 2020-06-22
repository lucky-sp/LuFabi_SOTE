package Exercise3;

public class Human {
    private String name;
    private int age;
    private HumanType type;

    public Human( String name, int age,HumanType type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HumanType getType() {
        return type;
    }
}
