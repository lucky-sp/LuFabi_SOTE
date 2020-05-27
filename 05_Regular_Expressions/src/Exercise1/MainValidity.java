package Exercise1;

import java.util.Scanner;

public class MainValidity {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your password has to meet following requirements:" +
                "\nThe password‘s first character must be a letter." +
                "\nThe password contains at least 4 but not more than 15 characters.");
        System.out.print("Please enter your password:");
        System.out.println(ValidityCheck.PasswordCheck(scanner.nextLine()));
    }
}
