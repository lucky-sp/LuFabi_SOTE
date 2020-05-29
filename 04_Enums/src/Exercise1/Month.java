public enum Month {
    JANUARY("January", 31, Seasons.WINTER),
    FEBRUARY("February",28, Seasons.WINTER),
    MARCH("March", 31, Seasons.WINTER);

    private String myName;
    private Seasons season;
    private int amountOfDays;

    private Month(String name, int amountOfDays, Seasons season){
        this.myName = name;
        this.amountOfDays = amountOfDays;
        this.season = season;
    }

    public String getName() {
        return this.myName;
    }

    public int getAmountOfDays(){
        return this.amountOfDays;
    }

    public boolean in(Seasons season){
        return season == this.season;
    }
}