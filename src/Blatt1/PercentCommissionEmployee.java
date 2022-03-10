package Blatt1;

public class PercentCommissionEmployee extends Employee {


    private double percentCommission;

    public PercentCommissionEmployee(String lastName, String firstName, String department, double baseSalary, double percentCommission) {
        super(lastName, firstName, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullSalary() {
        return baseSalary +(percentCommission*baseSalary);
    }
}


