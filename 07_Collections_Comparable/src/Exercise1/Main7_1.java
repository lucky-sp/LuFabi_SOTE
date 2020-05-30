package Exercise1;

public class Main7_1 {
    public static void main(String[] args) {

        LList list =  new LList();

        list.insert("Car1");
        list.insert("Car2");
        list.insert("Car3");
        list.insert("Car4");
        list.insert("Car5");

        list.remove(2);

        System.out.println("Does the list contain Car1 ? " + list.contains("Car1"));
        System.out.println("Does the list contain Car4 ? " + list.contains("Car4"));
        System.out.println("Does the list contain Car10 ? " + list.contains("Car10"));
        System.out.println("////////");

        /*System.out.println(list.size());
        System.out.println(list.get(1));

        System.out.println("///////////");
        for(Object o : list) {
            Node node = (Node)o;
            System.out.println(node.getContent());
        }*/

        System.out.println("Programm finished successfully");
    }
}
