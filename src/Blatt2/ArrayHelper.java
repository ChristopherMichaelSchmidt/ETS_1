package Blatt2;

import java.util.Arrays;
import java.util.SortedMap;

public class ArrayHelper {
    public static void main(String[] args) {

        int[] array = {8,9,4,2,3,5,3,1};
        arrangeOrder(array);
        System.out.println(Arrays.toString(array));

        Car c = new Car("BMW", 2010, 10000);
        Car c1 = new Car("BMW", 2012, 10000);
        Car c2 = new Car("BMW", 2015, 10000);
        Car c3 = new Car("BMW", 2005, 10000);
        Car c4 = new Car("BMW", 2001, 10000);
        Car c5 = new Car("BMW", 2019, 10000);

        Car[] cararray ={c5, c1, c4, c2, c,c3};
        arrangeOrdercar(cararray);
        System.out.println(Arrays.toString(cararray));

    }
    public static void arrangeOrder(int[] numbers){
        for(int i =0; i <numbers.length-1;i++){
            for(int j = i+1;j< numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    public static void arrangeOrdercar(Car[] cars){
        for(int i =0; i < cars.length-1;i++){
            for(int j=i+1;j< cars.length;j++){
                if(cars[j].getProductionYear()<cars[i].getProductionYear()){
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }

}
