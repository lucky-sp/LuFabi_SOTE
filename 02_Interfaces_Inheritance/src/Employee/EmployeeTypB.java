package Employee;


// Employee has a fix salary per hour, salary per month depends on working hours

<<<<<<< HEAD:02_Interfaces_Inheritance/src/Employee/EmployeeTypB.java
import Employee.employee;

public class EmployeeTypB implements employee {
=======
public class EmployeeTypB implements Iemployee {
>>>>>>> 11dc4efca5b6d54db973a66d4bfedfbf9342089f:02_Interfaces_Inheritance/src/EmployeeTypB.java

    private int salaryPerH;
    private String name;


    public EmployeeTypB(String name, int salaryPerH){
        this.salaryPerH = salaryPerH;
        this.name = name;
    }

    @Override
    public String getInputInformation(){
        return  "Bitte trage ein, wie viele Stunden " + this.name + " im vergangenen Monat gearbeitet hat"; 
    }

    @Override
    public int thisMonthSalary(int hours) {
        return this.salaryPerH * hours;
    }

}