package Excerxicse2;

public class Main_without_regEx{

    
    public static void main( String[] args){
        String email= "philipp.hehnle@htwg-konstanz.de";
        String firstName = "";
        String sirName = "";

        char[] emailAsArray = email.toCharArray();
        
        boolean firstPart = true;

        for (char ch : emailAsArray){
            if (ch != '.' && firstPart) {
                firstName = firstName + ch;
            }else{
                firstPart = false;
                continue;
            }

            if ( ch != '@'){
                sirName = sirName + ch;
            }else{
                break;
            }
        }

        System.out.println("first Name: " + firstName);
        System.out.println("Sir Name: " + sirName);
    }
}