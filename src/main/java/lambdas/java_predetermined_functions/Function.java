package lambdas.java_predetermined_functions;

import java.util.function.BiFunction;

/**
 * Function (Функция) - используется для преобразования параметров, всегда возвращает что-то метод apply.
 * BiFunction - принимает два параметра
 */
public class Function {
    public static void main(String[] args) {
        java.util.function.Function<String, Integer> sizeSting = x -> x.length();
        System.out.println(sizeSting.apply("Барбариска"));

        BiFunction<String, String, String> concatString = (x, y) -> x + " " + y.toUpperCase();
        BiFunction<String, String, String> concatString1 = (x, y) -> String.format("Имя: %s, Фамилия: %S.", x, y);
        System.out.println(concatString.apply("Вася", "пупкин"));
        System.out.println(concatString1.apply("Вася", "пупкин"));
    }
}
