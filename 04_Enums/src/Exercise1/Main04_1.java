package Exercise1;

public class Main04_1 {
    public static void main(String[] args){
        Month month= Month.FEBRUARY;
        System.out.println(month.getName() + " has " + month.getAmountOfDays() + " days."); 
        if(month.in(Seasons.WINTER)) {
             System.out.println("This month is in Winter.");
             }
    }
}
