package Employee;

// Employee has a fix salary per month and an additional bonus payment

<<<<<<< HEAD:02_Interfaces_Inheritance/src/Employee/EmployeeTypC.java
import Employee.employee;

public class EmployeeTypC implements employee {
=======
public class EmployeeTypC implements Iemployee {
>>>>>>> 11dc4efca5b6d54db973a66d4bfedfbf9342089f:02_Interfaces_Inheritance/src/EmployeeTypC.java

    private int salaryPerM;
    private String name;

    public EmployeeTypC(String name, int salaryPerM){
        this.salaryPerM = salaryPerM;
        this.name = name;
    }

    @Override
    public String getInputInformation(){
        return  "Bitte trage ein, wie hoch der Bonus von " + this.name + " im vergangenen Monat war"; 
    }

    @Override
    public int thisMonthSalary(int bonus){
        return this.salaryPerM + bonus;
    }


}