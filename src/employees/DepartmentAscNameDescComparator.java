package employees;

import java.util.Comparator;

public class DepartmentAscNameDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
      if(o1.getDepartment().compareTo(o2.getDepartment())>0){
          return 1;
      }
      else if( o1.getDepartment().compareTo(o2.getDepartment())<0){
          return -1;
      }
      else return o2.getName().compareTo(o1.getName());
      }
    }

