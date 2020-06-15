package Exercise5;

import java.util.Arrays;
import java.util.List;

public class main08_5 {
    public static void main(String[] args) {
        List<Integer> ints= Arrays.asList(1,2,4,3,5,6,7,9,475);
        Integer last = getLast(ints);
        System.out.println(last);
    }

    private static <T> T getLast(List<T> liste) {
        return liste.get(liste.size() - 1);
    }
}
