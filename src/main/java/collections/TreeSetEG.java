package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet основан на TreeMap:
 * Ключ - значение TreeSet
 * Значение - залушка
 *
 * Необходимо передать Компаратор в конструктор TreeSet.
 */

public class TreeSetEG {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.addAll(Arrays.asList(5,3,4,6,11));

        System.out.println(treeSet); //[3, 4, 5, 6, 11]
        System.out.println(treeSet.first()); //3
        System.out.println(treeSet.last()); //11
        System.out.println(treeSet.headSet(5)); //[3, 4]
        System.out.println(treeSet.tailSet(5)); //[5, 6, 11]
        System.out.println(treeSet.subSet(4, 6)); //[4, 5]


        // Компоратор передан в конструктор TreeSet, стравнивает объекты по полю age.
        TreeSet<Cat> catSet = new TreeSet<>(Comparator.comparingInt(Cat::getAge));

        catSet.add(new Cat(5, "Вася"));
        catSet.add(new Cat(2, "Муся"));
        catSet.add(new Cat(21, "Старуся"));

        System.out.println(catSet);


    }

    static class Cat {
        private int age;
        private String name = "";

        public Cat(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }


    }


}
