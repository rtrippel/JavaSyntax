package lambdas.with_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Example {

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Car("Audi", 10), new Car("BMW",20)));

        for(Car car : list) {
            printDetails(car, x -> Objects.equals(x.getBrand(),"BMW") ? x : x.getBrand());
        }

        printDetails(list.get(0), x -> x.getBrand());
        printDetails(list.get(0), x -> x.getAge());
    }

    private static void printDetails(Car car, GetInformation information) {
        System.out.println(information.get(car));
    }
}
