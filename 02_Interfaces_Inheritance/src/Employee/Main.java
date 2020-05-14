package Employee;

import Employee.EmployeeTypA;
import Employee.EmployeeTypB;
import Employee.EmployeeTypC;
import Employee.employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Input object
        Scanner scannObj = new Scanner(System.in);
        
        // initialize all employees am structure them in array
        Iemployee[] allEmployees = new Iemployee[3];
        allEmployees[0] = new EmployeeTypA("Hubert", 2500);
        allEmployees[1] = new EmployeeTypB("Kim", 12);
        allEmployees[2] = new EmployeeTypC("Sieglinde", 2000);

        int monthSumSalary = 0;

        // Set monthly information
        for (int i = 0; i < allEmployees.length; i++ ){
            System.out.println(allEmployees[i].getInputInformation());  // returns inforamation about what to enter in the next line 
            monthSumSalary += allEmployees[i].thisMonthSalary(scannObj.nextInt()); // set monthly information for each empolyee
        }
        
        // prints out sum of salary for all employees for the month
        //test
        System.out.println("diesen Monat werden insgesamt " + monthSumSalary + "€ Gehalt gezahlt");
    }
}
