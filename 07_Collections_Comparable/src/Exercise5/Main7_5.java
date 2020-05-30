package Exercise5;

public class Main7_5 {
    public static void main(String[] args) {

        LList7_5 list = new LList7_5();

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
            Node7_5 node = (Node7_5) o;
            System.out.println(node.getContent());
        }
        System.out.println("////////////////////");*/
        //Aufgabe 2
/*        list.put(0, "CarXX");
        list.put(4, "CarYY");*/
        //Aufgabe 3
/*        list.insertOnIndex(0,"Auto1");
        list.insertOnIndex(5,"Auto6");*/
        //Aufgabe 4
/*        System.out.println("Konnte Car1 gelöscht werden: " + list.removeOnObject("Car1"));
        System.out.println("Konnte Car5 gelöscht werden: " + list.removeOnObject("Car5"));

        for (Object o : list) {
            Node7_5 node = (Node7_5) o;
            System.out.println(node.getContent());
        }*/

        for (Object object : list ) {
            System.out.println(object);
        }

        System.out.println("Programm finished successfully");
    }
}
