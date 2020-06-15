package Exercise1;

public class main08_1 {
    public static void main(String[] args){
        String[] array = {"as", "asfd", "gfd", "hdsf", "hfdhh"};
        array = exchangePositions(array, 2, 0);
        System.out.println(array[2]);
        System.out.println(array[0]);
    }

    public static <T> T[] exchangePositions (T[] array, int p1, int p2){
        T T1 = array[p1];
        array[p1] = array[p2];
        array[p2] = T1;
        return array;
    }

}
