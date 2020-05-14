import java.util.Scanner;

public class MainAirline2 {


    public static void main(String[] args) {

        Scanner scannObj = new Scanner(System.in);


        UseCases[] ucase = new UseCases[4];
        ucase[1] = new GetFlightInfos();
        ucase[2] = new GetPassengerList();
        ucase[3] = new CancelFlight();

        System.out.println("Enter your position in the airline system.");
        System.out.println("You can choose between:");
        System.out.println("Pilot");
        System.out.println("Crew");
        System.out.println("Passenger");
        System.out.print("Enter:");
        String position = scannObj.nextLine();
        System.out.println("Please enter what you want to do:");
        System.out.println("1/ get flight infos");
        System.out.println("2/ retrieve passenger list (if you are Crew)");
        System.out.println("3/ cancel flight (if you are a pilot");
        boolean loop = true;
        while (loop) {
            System.out.print("Enter your selection:");
            String selection = scannObj.nextLine();
            System.out.println(ucase[Integer.parseInt(selection)].getActivity(position));
            System.out.print("If you want to continue, enter 1, if you want to abort enter something else");
            String abort = scannObj.nextLine();
            if (!abort.equals("1")) {
                loop = false;
            }
        }
        scannObj.close();
    }
}

