package Exercise2.Exercise10_2;

import Exercise2.Exercise10_2.Exceptions.ResultOutOfRangeException;

public class Main10_2 {

    public static void main(String[] args) throws ResultOutOfRangeException {


        System.out.println(faculty(5));
    }

    public static long faculty(int facNumber) throws ResultOutOfRangeException {
        long faculty = 1;
        for (int i = 2; i <= facNumber; i++) {
            faculty *= i;
        }
        if (faculty < 0 & facNumber > 0) {
            throw new ResultOutOfRangeException("Faculty of " + facNumber + " is too large and cant be computed");
        } else {
            return faculty;
        }
    }
}
