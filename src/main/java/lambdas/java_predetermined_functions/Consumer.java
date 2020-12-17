package lambdas.java_predetermined_functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Consumer (Потребитель) - применяется когда нужно применить действие к параметру метода. Используется метод apply
 * который ничего не возвращает, Void.
 * BiConsumer - метод apply принимает два параметра в отличии от Consumer.
 */
public class Consumer {
    public static void main(String[] args) {
        java.util.function.Consumer<String> consumer = x -> System.out.println(x);
//        java.util.function.Consumer<String> consumer = System.out::println;
        consumer.accept("Это машинка моя(с)");

        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer = (x, y) -> map.put(x,y);
//        BiConsumer<Integer, String> biConsumer = map::put;
        biConsumer.accept(1, "Вася");
        System.out.println(map);
    }
}
