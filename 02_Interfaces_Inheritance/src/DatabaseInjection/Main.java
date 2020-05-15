package DatabaseInjection;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        
        Scanner scannObj = new Scanner(System.in);

        IDataBase db = null;
        
        System.out.println("Suchst du Gemüse oder Früchte?");
        System.out.println("für Gemüse drücke 1");
        System.out.println("für Früchte drücke 2");
        String decision = scannObj.nextLine();
        if (decision.equals("1")) db = new VegetablesDB();
        if (decision.equals("2")) db = new FruitsDB();

        System.out.println("welches Essen möchtest du suchen?");
        String searchedFood = scannObj.nextLine();
        if(db.search(searchedFood))System.out.println("Das Essen ist in der Datenbank");
        else System.out.println("Das Essen ist noch nicht vorhanden");      

    }
}