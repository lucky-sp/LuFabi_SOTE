package DatabaseInjection;

import java.util.ArrayList;

public class FruitsDB implements IDataBase{
    public ArrayList<String> liste = new ArrayList<String>();

    public FruitsDB(){
        this.liste.add("Apfel");
        this.liste.add("Banane");
        this.liste.add("Mango");
    }

    @Override
    public boolean search(String searchedFruit){
        for (String element : liste ){
            if (searchedFruit.equals(element))return true;
        }
        return false;
    }


}