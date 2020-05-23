package Exercise2;

import java.util.Scanner;

public class Main {

    public static void main (String[]args) {
        Plane[] planes = new Plane[2];
        planes[0] = new Plane(1,500,"Rolls-Royce");

        Scanner scanner = new Scanner(System.in);

        Plane newPlane = planes[0].copy();
        System.out.print("Geben Sie die ID für das neu angelegte Flugzeug ein: ");
        newPlane.setId(scanner.nextInt());
        planes[1]= newPlane;

    		for (int i = 0; i < planes.length; i++) {
                System.out.println(planes[i].toString());
            }
    		scanner.close();
    }
}
