package multithreading;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Field;

public class VolatileTest {
    private PrintStream consoleStream;
    private Volatile v;
    private ByteArrayOutputStream outputStream;
    private PrintStream stream;

    @Before
    public void createAndOutSave() {
        consoleStream = System.out;
        v = new Volatile();
        outputStream = new ByteArrayOutputStream();
        stream = new PrintStream(outputStream);
    }

    @Test
    public void threadShouldBeEnd () throws InterruptedException, IllegalAccessException {


        System.setOut(stream); // перенаправили поток вывода в консоль в буффер

        Thread.sleep(1000); // ждем когда отработает поток созданный при сознаии объекта Volatile
        String result = outputStream.toString(); //записали поток в строку

        System.setOut(consoleStream); // вернули поток в консоль
        Field field = Volatile.class.getDeclaredFields()[0]; //используя рефлексию  получили список полей
        field.setAccessible(true); // получаем доступ к приватным полям
        // если переменная закешируется, то поток(нить) не завершится и не выведет в консоль сообщение.
        Assert.assertEquals(result.trim(), field.get(v)); //сравниваем поток консоли с приватным полем Volatile
        //trim  используем т.к. присутсвует перенос строки

    }
}
