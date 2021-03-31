package collections.set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet основан на TreeMap:
 * Ключ - значение TreeSet
 * Значение - заглушка
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
        TreeSet<Dog> dogSet = new TreeSet<>();
        dogSet.add(new Dog(11, "Пуделяха"));
        dogSet.add(new Dog(10, "Рэм"));
        dogSet.add(new Dog(11, "Пуделяха"));

        System.out.println(dogSet);


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

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

    }

    static class Dog extends Cat implements Comparable<Dog>{

        public Dog(int age, String name) {
            super(age, name);
        }

        @Override
        public int compareTo(Dog o) {
            return Integer.compare(this.getAge(), o.getAge());
        }
//
//        @Override
//        public int compareTo(Dog o) {
//            return 1;
//        }
    }


}
