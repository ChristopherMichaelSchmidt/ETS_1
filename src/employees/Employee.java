package employees;

import java.util.Objects;

public class Employee implements  Comparable<Employee>{
    private int empNumber;
    private String name;
    private String department;
    private double salary;

    public Employee(int empNumber, String name, String department, double salary) {
        this.empNumber = empNumber;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber);
    }


    @Override
    public int compareTo(Employee o) {
        if(empNumber>o.empNumber){
            return 1;
        }
        if(empNumber<o.empNumber){
            return -1;
        }
        return 0;
    }
}