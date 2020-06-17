package Exercise4;

public class MainExplain08_4 {
    AnimalHouse <Animal> house1 = new AnimalHouse <Cat>();
    // Compile Error

    AnimalHouse <Dog> house2 = new AnimalHouse <Animal>();
    //Compile Error
    //kann keine neue Instanz mit Animal erzeugen, da das AnimalHouse als Dog-House definiert ist.
    //Als Animal aber auch eine Cat sein kann.

    AnimalHouse <?> house3 = new AnimalHouse <Cat>();
    house3.setAnimal(new Cat());
    //Compile Error

    AnimalHouse house4 = new AnimalHouse();
    house4.setAnimal(new Dog());
}
