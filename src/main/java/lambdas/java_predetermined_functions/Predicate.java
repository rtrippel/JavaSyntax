package lambdas.java_predetermined_functions;

import java.util.Objects;
import java.util.function.BiPredicate;

/**
 * Predicate (Утверждение) - часто используется в фильтрах, метод test(), принимающий параметр и возвращающий boolean
 * BiPredicate - два параметра принимает
 *
 */
public class Predicate {

    public static void main(String[] args) {
        java.util.function.Predicate<String> predicate = s -> s.length() > 5;
        System.out.println(predicate.test("Вася"));
        System.out.println(predicate.test("Вакунда"));

        BiPredicate<String, Integer> biPredicate = (s, i) -> Objects.equals(s, String.valueOf(i));
        System.out.println(biPredicate.test("4", 4));

    }
}
