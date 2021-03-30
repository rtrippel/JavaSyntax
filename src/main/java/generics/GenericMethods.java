package generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static class VariableUtil {
        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }

public static void printStringOrInteger (List<?> list) {
    for (Object element : list) {
        if (element instanceof Integer){
            System.out.println("Util.<Integer>getValue(element) - " + VariableUtil.<Integer>getValue(element));
        }
        else {
            System.out.println("Util.<String>getValue(element) - " + VariableUtil.<String>getValue(element));
        }
    }
}
    public static void main(String []args) {
        List<?> list = Arrays.asList("Author", "Book", 2, 3);
        printStringOrInteger(list);

    }
}
