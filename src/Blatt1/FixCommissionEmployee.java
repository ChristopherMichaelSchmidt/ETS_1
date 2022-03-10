package Blatt1;

public class FixCommissionEmployee extends Employee {


    private double additionalComission;

    public FixCommissionEmployee(String lastName, String firstName, String department, double baseSalary, double additionalComission) {
        super(lastName, firstName, department, baseSalary);
        this.additionalComission = additionalComission;
    }

    @Override
    public double getFullSalary() {
        return baseSalary + additionalComission;
    }
}
