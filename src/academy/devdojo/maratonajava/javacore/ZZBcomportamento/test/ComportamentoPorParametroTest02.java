package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.predicate.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
   static List<Car> cars = new ArrayList<>(List.of(new Car("white",2001),new Car("yellow",2018),new Car("black",2022)));

    static void main() {
        filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getYear() < 2018;
            }
        });

    }

    static public List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filteredCars.add(car);
            }
        }

return filteredCars;
    }

}
