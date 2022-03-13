package employees;

import java.util.Comparator;

public class SalaryDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o2.getSalary() > o1.getSalary()){
            return 1;
        }
        else  if(o2.getSalary()<o1.getSalary()){
            return -1;
        }
        return 0;

       // return Double.compare(o2.getSalary(), o1.getSalary());
    }
}
