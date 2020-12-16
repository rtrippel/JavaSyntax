package lambdas.java_predetermined_functions;

import java.util.ArrayList;
import java.util.List;

/**
 * Supplier (Поставщик) - используется для создание объектов , метод get() на вход параметров не принимает
 */
public class Supplier {

    public static void main(String[] args) {
        java.util.function.Supplier<String> supplier = () -> "Тестовое сообщение";
        System.out.println(supplier.get());

        java.util.function.Supplier<ArrayList<String>> supArray = ArrayList::new;
        List<String> list = supArray.get();
        list.add("Тестовое");
        System.out.println(list);
    }

}
