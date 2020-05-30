package Exercise2;

public class MainRegex {
    public static void main( String[] args){
        String email= "philipp.hehnle@htwg-konstanz.de";
        String regExNotFirstName = "\\..*";
        String regExDomain = "@.*";
        String firstName = email.replaceAll(regExNotFirstName,"");
        String sirName = email.replaceAll(firstName,"").replaceAll(regExDomain,"").replaceAll("\\.", "");
        System.out.println("first Name: " + firstName);
        System.out.println("Sir Name: " + sirName);

    }
}