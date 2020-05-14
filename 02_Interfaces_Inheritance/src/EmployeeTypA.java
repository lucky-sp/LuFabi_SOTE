

// Employee has a fix salary per month

public class EmployeeTypA implements Iemployee {

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