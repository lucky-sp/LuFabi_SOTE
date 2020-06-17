package Exercise0;

import java.util.List;

public class PrintableList8_0<T>{

    public static <T> void print(LList8_0<T> list) {
        for (Object o : list) {
            Node8_0 node = (Node8_0) o;
            System.out.println(node.getContent());
        }
    }
}
