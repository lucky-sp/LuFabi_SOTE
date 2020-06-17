package Exercise0;

import java.util.List;

public class Main8_0 {
    public static void main(String[] args) {

        LList8_0<Object> list = new LList8_0<>();

        list.insert("Car1");
        list.insert("Car2");
        list.insert("Car3");
        list.insert("Car4");
        list.insert("Car5");

        /*        list.remove(2);*/
//Aufgabe 1
/*        System.out.println("Does the list contain Car1 ? " + list.contains("Car1"));
        System.out.println("Does the list contain Car4 ? " + list.contains("Car4"));
        System.out.println("Does the list contain Car10 ? " + list.contains("Car10"));
        System.out.println("////////");

        System.out.println(list.size());
        System.out.println(list.get(1));

        System.out.println("///////////");*/
/*        for (Object o : list) {
            Node8_0 node = (Node8_0) o;
            System.out.println(node.getContent());
        }*/
        PrintableList8_0.print(list);
        System.out.println("////////////////////");
        //Aufgabe 2
/*        list.put(0, "CarXX");
        list.put(4, "CarYY");*/
        //Aufgabe 3
/*        list.insertOnIndex(0,"Auto1");
        list.insertOnIndex(5,"Auto6");*/
        //Aufgabe 4
        System.out.println("Konnte Car1 gelöscht werden: " + list.removeOnObject("Car1"));
        System.out.println("Konnte Car5 gelöscht werden: " + list.removeOnObject("Car5"));
        PrintableList8_0.print(list);
/*        for (Object o : list) {
            Node8_0 node = (Node8_0) o;
            System.out.println(node.getContent());
        }*/
        System.out.println("Programm finished successfully");
    }
}
