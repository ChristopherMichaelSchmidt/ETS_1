package Blatt1;

public class Employee {
    protected String lastName;
    protected String firstName;
    protected String department;
    protected  double  baseSalary;


    public Employee(String lastName, String firstName, String department, double baseSalary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary(){
        return baseSalary;

    }

}
