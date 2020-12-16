package generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {
    public static class Util { //класс с перегруженным методо getValue
        public static <T> T getValue(Object obj, Class<T> clazz) {
            return (T) obj;
        }
        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }
public static void printStringOrInteger (List list) {
    for (Object element : list) {
        if (element instanceof Integer){
            System.out.println("Util.getValue(element, Integer.class) - " + Util.getValue(element, Integer.class));
            System.out.println("Util.<Integer>getValue(element) - " + Util.<Integer>getValue(element));
        }
        else {
            System.out.println("Util.getValue(element, String.class) - " + Util.getValue(element, String.class));
            System.out.println("Util.<String>getValue(element) - " + Util.<String>getValue(element));
        }
    }
}
    public static void main(String []args) {
        List list = Arrays.asList("Author", "Book", 2, 3);
        printStringOrInteger(list);

    }
}
