package Exercise3;

public class Main7_3 {
    public static void main(String[] args) {

        LList7_3 list = new LList7_3();

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
        for (Object o : list) {
            Node7_3 node = (Node7_3) o;
            System.out.println(node.getContent());
        }
        System.out.println("////////////////////");
        //Aufgabe 2
/*        list.put(0, "CarXX");
        list.put(4, "CarYY");*/
        //Aufgabe 3
        list.insertOnIndex(0,"Auto1");
        list.insertOnIndex(5,"Auto6");

        for (Object o : list) {
            Node7_3 node = (Node7_3) o;
            System.out.println(node.getContent());
        }
        System.out.println("Programm finished successfully");
    }
}
