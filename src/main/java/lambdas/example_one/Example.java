package lambdas.example_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Example {

    public static void main(String[] args) {
        List<Car> list = new ArrayList();
        list.addAll(Arrays.asList(new Car("Audi", 10), new Car("BMW",20)));

        for(Car car : list) {
            printTest(car, x -> Objects.equals(x.getBrand(),"BMW") && x.getDate() == 20);
        }
    }

    private static void printTest(Car car, CheckCar chek) {
        System.out.println(car + (chek.test(car) ? " - Да это искомая машина" : " - Нет, это не та машина!"));
    }
}
