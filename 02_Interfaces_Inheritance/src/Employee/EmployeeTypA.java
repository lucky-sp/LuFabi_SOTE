package Employee;

// Employee has a fix salary per month

<<<<<<< HEAD:02_Interfaces_Inheritance/src/Employee/EmployeeTypA.java
import Employee.employee;

public class EmployeeTypA implements employee {
=======
public class EmployeeTypA implements Iemployee {
>>>>>>> 11dc4efca5b6d54db973a66d4bfedfbf9342089f:02_Interfaces_Inheritance/src/EmployeeTypA.java

    private int salaryPerM;
    private String name;

    public EmployeeTypA(String name, int salaryPerM){
        this.salaryPerM = salaryPerM;
        this.name = name;
    }

    @Override
    public String getInputInformation(){
        return  "Bitte bestätige mit 1, dass " + this.name + " im vergangenen Monat gearbeitet hat"; 
    }

    @Override
    public int thisMonthSalary(int confirmation) {
        return this.salaryPerM;
    }

}