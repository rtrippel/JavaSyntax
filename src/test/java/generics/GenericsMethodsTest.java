package generics;


import org.junit.*;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static generics.GenericMethods.printStringOrInteger;

public class GenericsMethodsTest {
    private static GenericMethods.Util util;
    private static List<String> list;
    private static File file = new File(File.separator + "logFile.txt");
    private static PrintStream pw;
    private static PrintStream consoleStream;

    @BeforeClass
    public static void systemOutIntLogFile () throws FileNotFoundException {
        consoleStream = System.out;
        pw = new PrintStream(new FileOutputStream(file));
        System.setOut(pw);
    }
    @Before
    public void addList(){
        list = Arrays.asList("Author", "Book");
    }
    @Test
    public void utilShouldBeWork() throws IOException {
        printStringOrInteger(list);
        System.setOut(consoleStream);
        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
        Set<String> data = new HashSet<>();
        String line ;
        while ((line = in.readLine()) != null) {
            data.add(line.split("-")[1].trim());
        }
        list.forEach(x-> Assert.assertTrue(data.contains(x)));

    }

    @AfterClass
    public static void deleteLogFile() {
        pw.close();
        file.delete();

    }
}
