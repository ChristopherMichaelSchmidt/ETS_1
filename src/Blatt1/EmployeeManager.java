package Blatt1;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

    private ArrayList<Employee> liste;

    public EmployeeManager() {
        liste = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        liste.add(e);

    }

    public double calcTotalSalary(){
        double hilf = 0.0;
        for(Employee employee: liste){
            hilf = hilf + employee.getFullSalary();

        }
        return hilf;


    }
    public HashMap<String, Double> getSalaryByDepartment(){
        HashMap<String, Double> hilf = new HashMap<>();

        for(Employee employee: liste){
            if(hilf.containsKey(employee.department)){
                double temp = hilf.get(employee.department) + employee.getFullSalary();
                hilf.put(employee.department, temp);
            }
            else hilf.put(employee.department, employee.getFullSalary());


        }
        return hilf;
    }

}
