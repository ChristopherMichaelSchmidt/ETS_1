package Blatt1;

public class Employee implements Comparable<Employee>{
    protected String lastName;
    protected String firstName;
    protected String department;
    protected  double  baseSalary;

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

    public Employee(String lastName, String firstName, String department, double baseSalary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary(){
        return baseSalary;

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDepartment() {
        return department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public int compareTo(Employee o) {
        //-1 kleiner , 0 ident, 1 größer
        if(baseSalary> o.baseSalary){
            return 1;

        }
        if (baseSalary<o.baseSalary){
            return -1;
        }
        return 0;
    }
}
