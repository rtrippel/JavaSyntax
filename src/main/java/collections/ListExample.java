package collections;

import java.util.ArrayList;
import java.util.List;

/**
 Основной реализацией интерфейса List является ArrayList & LinkedList

 ArrayList: под капотом имеет массив, изначально из 10 элементов и далее в случае нехватки места когда
 добавляется 11 элемент расширяется (n * 3) / 2 + 1,. Либо можно изначально задать размер Arraylist.


 Время:
 Доступ к произвольному элементу за константное время.
 Вставка в конец за константу
 Удаление последнего за константу

 В середину - проблема т.к. нужно переносить все данные справа.
 */

public class ListExample {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Вася");
        arrayList.add("Petya");
        arrayList.add("Evgeniy");
        arrayList.add(0,"firstName"); // затратная операция т.к. происходит копирование копирование/перенос элементов
        arrayList.add(null);

        System.out.println(arrayList.remove(3)); // при удалении по номеру элемента возвращает удаляемый объекь
        System.out.println(arrayList.remove("Petya")) ; // при удалении передавая значение булево значение
        System.out.println(arrayList.remove("ущцв")); // в данном случае false

        System.out.println(arrayList.indexOf("Вася")); // возвращает индекс найденого значения
        System.out.println(arrayList.get(1)); // возвращает значение по индексу

        arrayList.set(1, "ВасяНев");
        System.out.println(arrayList.get(1));

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Petya"));


    }

}
