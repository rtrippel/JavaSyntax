package arrays;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {
        int[] myArray = new int [10]; //- объявление

        System.out.println(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[0]);

        //инициализация
        myArray[0] = 110;
        System.out.println(myArray[0]);
        myArray[0] = 99;
        System.out.println(myArray[0]);
        myArray[0] = 0;

        int[] myArray1 = new int[] {1,2,3};
        Arrays.stream(myArray1).forEach(x -> System.out.print(x));
        Arrays.stream(myArray1).forEach(System.out::print);
        for (int number : myArray1) {
            System.out.println(number);
        }

        int[] myArray2 = {5,6,7};
        Arrays.stream(myArray2).forEach(System.out::print);

        int[][] myArray3 = {{2,3}, {4,5}};
        for (int[] arr : myArray3) {
            System.out.println();
            for (int a : arr) {
                System.out.print(a);
            }
        }

        System.out.printf("\n!!!! %S",myArray2[0]);
        new Example().changeArray(myArray2);
        System.out.printf("\n!!!! тот же массив %S",myArray2[0]);

        new Example().dontChangeArray(myArray2);
        System.out.printf("\n!!!! все тот же массив %S",myArray2[0]);

        int[] copyArray = Arrays.copyOf(myArray2, 1);
        System.out.println("\nДлинна массива - " + copyArray.length);
        System.out.println("\nПервый элемент массива - " + copyArray[0]);

    }

    void changeArray(int[] array) {
        array[0] = 9999;
    }

    void dontChangeArray(int[] array) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        copyArray[0] = 777;
        System.out.println();
        for (int arr : copyArray) System.out.println(arr);
    }


}