package DatabaseInjection;

public class Search {

    private IDataBase db;

    public Search (IDataBase db){
        this.db = db;
    }

    public boolean search(String searchedFood){
        return db.search(searchedFood);
    }


    
}