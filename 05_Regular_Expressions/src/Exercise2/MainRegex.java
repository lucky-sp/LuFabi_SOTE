package Exercise2;

public class MainRegex {
    public static void main( String[] args){
        String email= "philipp.hehnle@htwg-konstanz.de";
        String regExMail= ".{3,15}@.*\\.(de|org|ch)";
        String regExFirstName = "\\..*";
        String regExDomain = "@.*";
        String firstName = email.replaceAll(regExFirstName,"");
        String sirName = email.replaceAll(firstName,"").replaceAll(regExDomain,"").replaceAll("\\.", "");
        System.out.println("first Name: " + firstName);
        System.out.println("Sir Name: " + sirName);

        char[] emailAsArray = email.toCharArray();
        
        for (char ch : emailAsArray){

        }
    }
}