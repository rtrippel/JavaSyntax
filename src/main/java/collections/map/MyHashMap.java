package collections.map;

import java.util.*;

/**
 * Массив бакетов, по умолчанию 16 и дальше расширяется в два раза и содержимое списков перераспределяется
 * Односвязанный список, в котором есть ссылки только на next node
 * Односвязанный список меняется на красно-черное бинарное дерево при достижении количества его элементов 8
 * (TREEIFY_THRESHOLD = 8) и обратно при уменьшении кол-ва элементов до 6 (UNTREEIFY_THRESHOLD = 6)
 *
 * Нода хранит в себе хеш, ключ, значение и ссылку на следующий элемент.
 *
 */
public class MyHashMap {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Вася");

//        Map<String, Integer> myTreeMap = new TreeMap<>();
        Map<String, Integer> myTreeMap = new TreeMap<>((key1, key2) -> key1.length() < key2.length() ? 1 : -1);
        myTreeMap.put("Юнона", 35);
        myTreeMap.put("Лена", 30);
        myTreeMap.put("Юнона", 36);
        myTreeMap.put("Света", 27);

        for (Map.Entry<String, Integer> e : myTreeMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println(myTreeMap.size());

    }
}
