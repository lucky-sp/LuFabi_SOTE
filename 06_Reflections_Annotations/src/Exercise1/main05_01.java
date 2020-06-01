package Exercise1;

import java.lang.reflect.Field;

public class main05_01 {
    public static void main (String[] args){
        printObjectsAttributes(Student.class);
    }

    private static void printObjectsAttributes(Class clazz) {
        printObjectsAttributesRecursive("", clazz);
         
    }

    private static void printObjectsAttributesRecursive(String spaces, Class clazz){
        Field[] attributes = clazz.getDeclaredFields();
        for (Field attribute : attributes){
            System.out.println(spaces + ">" + attribute.getName());
            if ( ! attribute.getType().equals(String.class) ){
                printObjectsAttributesRecursive((spaces + "     " ),attribute.getType());
            }
        }
    }
}