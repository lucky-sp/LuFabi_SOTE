


// Employee has a fix salary per hour, salary per month depends on working hours

public class EmployeeTypB implements Iemployee {

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