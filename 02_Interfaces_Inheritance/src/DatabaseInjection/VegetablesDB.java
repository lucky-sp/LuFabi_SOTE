package DatabaseInjection;

import java.util.ArrayList;

public class VegetablesDB implements IDataBase{
    public ArrayList<String> liste = new ArrayList<String>();

    public VegetablesDB(){
        this.liste.add("Gurke");
        this.liste.add("Tomate");
        this.liste.add("Möhre");
    }

    @Override
    public boolean search(String searchedVegtable){
        for (String element : liste ){
            if (searchedVegtable.equals(element))return true;
        }
        return false;
    }
}