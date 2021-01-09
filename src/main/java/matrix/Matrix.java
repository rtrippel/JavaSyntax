package matrix;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * След матрицы
 */

public class Matrix {

    public static void main(String[] args) throws IOException {
        var path = Path.of("src/main/resources/readme.txt");
        createFile(path);

        int sum = 0;
        var list = Files.readAllLines(path);
        for (int i = 0; i < list.size(); i++) {
            String[] array = list.get(i).split(" ");
            sum += Integer.parseInt(array[i]);
        }
        System.out.println("След матрицы - " + sum);

        var arrayInt = readFile(path);
        sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i][i];
        }
        System.out.println("След матрицы - " + sum);

        //вывод содержимого файла
        System.out.println();
        Files.lines(path).forEach(System.out::println);
        System.out.println();
        Files.readAllLines(path).forEach(System.out::println);

        deleteFile(path);
    }

    //создание файла
    static void createFile(Path path) {
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
                Files.writeString(path
                        ,"1 2 3 5\n" +
                                "4 5 6 7\n" +
                                "7 8 9 8\n" +
                                "4 3 2 1"
                        , LinkOption.values());
                System.out.println("Файл успешно создан");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Файл уже создан.");
        }

    }

    //чтение из файла
    static Integer[][] readFile(Path path) {
        try {
            Stream<String> stream = Files.lines(path); //Создали поток из файла
            return stream
                    //проходимся по элементам, создаем новый поток
                    .map(e -> Arrays.stream(e.split(" "))
                            .peek(String::trim)
                            .map(Integer::parseInt)
                            .toArray(Integer[]::new))
                    .toArray(Integer[][]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Integer[][]{};

    }

    //удаление файла
    static void deleteFile(Path path) {
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
