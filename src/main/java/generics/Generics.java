package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        //1 Без Generics
        List animals = new ArrayList(); //создали список animals
        Animal someAnimal = new Animal(); // создали объект Animal
        int age = 10; // создали переменную age
        //1.1
        // в список мы можем добавить любой тип т.к. List принимает Object
        animals.add("cat"); // добавили в ранее созданный список строку "cat"
        animals.add(age); // ... целочисленную переменную age
        animals.add(someAnimal); // ...ссылочную переменную на объект класса Animal
        //1.2
        // и чтобы достать объект String необходимо сделать Downcast
        String animal = (String) animals.get(0); // т.е. привести объект класса Object к классу String
        //1.3
        //при использовании Generics мы можем конкретезировать что именно будет помещаться внутри List
        List <Animal> animalsWithGenerics = new ArrayList<>(); //создали лист с Дженериком
        animalsWithGenerics.add(someAnimal); //добавили someAnimal т.к. данная сылочная переменная класса Animal
//        animalsWithGenerics.add("cat"); - не можем добавить, выбросится исключение

        //теперь объект хранится в как Animal, а не Object  и его не нужно Downcastить
        System.out.println("... instanceof Animal? - " + (animalsWithGenerics.get(0) instanceof Animal));
        System.out.println(" Class is " + animalsWithGenerics.get(0).getClass().getSimpleName());
        Animal animal1 = animalsWithGenerics.get(0);// объект полученный из листа бе преобразования приравниваем


        //пример использования Generics в методах
        List <Animal> animalList = new ArrayList<>();
        animalList.add(new Cat());
        animalList.add(new Mouse());
        feed(animalList); // в данном случае все хорошо, но метод не сможет обработать список наследников
        List <Cat> catsList = new ArrayList<>(); // создали лист наследников от класа Animal.
        catsList.add(new Cat());
        catsList.add(new Cat());
//        feed(catsList); -  не можем использовать т.к.на вход метод принимает именно илст с Животными и не может
//                           принять объекты наследники класа Animal
        feedAll(catsList); // а вот так работает т.к. в методе мы принимаем List с дженериком наследниками Animal
        feedAll(animalList);


    }
    static void feed(List<Animal> list) {
        list.forEach(Animal::eat);
    } //метод кормить, который принимает на вход Список с Animal.
    static void feedAll(List<? extends Animal> list) { // принимаем на вход список Animal и наследников
        list.forEach(Animal::eat);
    } // принимает всех животных

    // List<? super Animal> - принимает на вход Энимал и его предков , в нашем случае Object
}

class Animal {
    void eat () {
        System.out.println("my favorite num num...");
    }

}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat eating...");;
    }
}
class Mouse extends Animal{
    @Override
    void eat() {
        System.out.println("Mouse eating...");
    }
}