package collections;

import java.util.*;

public class DeleteElement {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sasha");
        names.add("Vasya");
        names.add("Petya");
        names.add(null);
//        names.removeIf(s -> s.equals("Vasya")); //выкинет ошибку

        for (int i = 0; i < names.size(); i++) {
            if (Objects.equals(names.get(i),"Vasya")) {
                System.out.println("Удален - " + names.remove(i));
                names.add("Noname");
            }
        }

        for (String s : names) System.out.println(s);
    }
}
