package lambdas.java_predetermined_functions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * UnaryOperator - является потомком Function, но для одинакового принимаемого и возвращаемого типа.
 * Указывать тип дженерика нужно только 1 раз для Unary и Binary оператора
 */

public class UnaryBinaryOperator {

    public static void main(String[] args) {
        UnaryOperator<StringBuilder> reversStringBuilder = x -> x.reverse();
//    UnaryOperator<StringBuilder> reversStringBuilder = StringBuilder::reverse;
        System.out.println(reversStringBuilder.apply(new StringBuilder("Мама мыла Раму")));

        BinaryOperator<StringBuilder> stringBuilderConcat = (x, y) -> x.append(y);
//        BinaryOperator<StringBuilder> stringBuilderConcat = StringBuilder::append;
        System.out.println(stringBuilderConcat.apply(new StringBuilder("Мама"), new StringBuilder(" Раму")));

        //Использование метода andThen
        BinaryOperator<Integer> binaryOperator = (x, y) -> x+y;
//    BinaryOperator<Integer> binaryOperator = Integer::sum;
        BiFunction<Integer, Integer, Integer> multi = binaryOperator.andThen(z -> z*10);
        System.out.println(multi.apply(3, 2));

        System.out.println(binaryOperator.andThen(r -> r * 20).andThen(x -> x + 1).apply(1, 2));

    }



}
