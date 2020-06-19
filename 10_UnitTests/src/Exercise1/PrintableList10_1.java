package Exercise1;

public class PrintableList10_1<T>{

    public static <T> void print(LList10_1<T> list) {
        for (Object o : list) {
            Node10_1 node = (Node10_1) o;
            System.out.println(node.getContent());
        }
    }
}
