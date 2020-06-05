package Exercise2;

import Exercise2.Car;
import Exercise2.EngineType;

public class Main04_2 {
    public static void main(String[] args) {


        Car a4 = new Car("Audi", "A4", 2000, EngineType.DIESEL);
        Car mercedesC = new Car("Mercedes", "C", 2000, EngineType.PETROL);
        Car eGolf = new Car("VW", "eGolf", 0, EngineType.ELECTRIC);

        Car[] cars = new Car[3];
        cars[0] = a4;
        cars[1] = mercedesC;
        cars[2] = eGolf;

        int totalTaxes = 0;
        for (int i = 0; i<cars.length; i++) {
            totalTaxes+=cars[i].getTax();
            cars[i].print();
        }

        System.out.println("The company needs to pay in total: "+totalTaxes);

/*        System.out.println("print all engine types");
        EngineType[] engineTypes = EngineType.values();
        for(int i=0; i<engineTypes.length; i++) {
            System.out.println(engineTypes[i].getName());
        }

        System.out.println("///////////");
        EngineType type = EngineType.valueOf("DIESEL");
        System.out.println(type.getName());*/
    }
}
