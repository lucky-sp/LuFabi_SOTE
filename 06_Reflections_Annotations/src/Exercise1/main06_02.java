package Exercise1;

import java.lang.reflect.Field;

//import Exercise1.Address;
//import Exercise1.City;
//import Exercise1.Student;

public class main06_02 {
    public static void main (String[] args) throws IllegalArgumentException, IllegalAccessException {
        City konstanz = new City.Builder()
            .setName("Konstanz")
            .setZipCode("78467")
            .setState("Bawü");
        Address address = new Address();
        address.setCity(konstanz);
        address.setHouseNumber("21");
        address.setStreet("Max-Stromeyer-Straße");
        Student student = new Student("Max Mustermann", address);
        printObjectsAttributes(student);
    }

    private static void printObjectsAttributes(Object unknownObject)
            throws IllegalArgumentException, IllegalAccessException {
        printObjectsAttributesRecursive("", unknownObject);
    }

    private static void printObjectsAttributesRecursive(String spaces, Object unknownObject)
            throws IllegalArgumentException, IllegalAccessException {
        Class clazz = unknownObject.getClass();
        Field[] attributes = clazz.getDeclaredFields();
        for (Field attribute : attributes){
            System.out.print(spaces + ">" + attribute.getName() + " : ");
            attribute.setAccessible(true);
            if (attribute.getType().equals(String.class) ){
                System.out.println(attribute.get(unknownObject));
            }else{
                System.out.println("");
                printObjectsAttributesRecursive((spaces + "     " ),attribute.get(unknownObject));
            }
        }
    }
}