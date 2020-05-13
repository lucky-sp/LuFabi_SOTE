

// Employee has a fix salary per month and an additional bonus payment

public class EmployeeTypC implements employee {

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