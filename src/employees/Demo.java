package employees;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Employee jan = new Employee(1, "jan", "affe", 50.0);
        Employee chris = new Employee(2, "jan", "affe", 7.0);
        Employee karin = new Employee(3, "jan", "affe", 550.0);
        Employee vera = new Employee(4, "jan", "affe", 50.7);
        Employee elma = new Employee(5, "jan", "affe", 50.9);


        Employee[] array = {elma, vera, karin, chris, jan};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
