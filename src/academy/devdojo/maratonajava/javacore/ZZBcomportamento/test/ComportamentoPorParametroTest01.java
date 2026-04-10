package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
   static List<Car> cars = new ArrayList<>(List.of(new Car("white",2001),new Car("yellow",2018),new Car("black",2022)));

    static void main() {
        System.out.println(filterByColorCar(cars,"black"));
        System.out.println(filterYearCar(cars,2023));

    }
   static public List<Car> filterByColorCar(List<Car> cars,String color){
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)){
                filterCars.add(car);
            }
        }
    return filterCars;
    }
    static public List<Car> filterYearCar(List<Car> cars,int year){
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < (year)){
                filterCars.add(car);
            }
        }
        return filterCars;
    }

}
