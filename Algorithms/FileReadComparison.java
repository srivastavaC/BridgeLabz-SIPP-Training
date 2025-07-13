
import java.io.*;

public class FileReadComparison {
    public static void readWithFileReader(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        while (fr.read() != -1) {}
        fr.close();
    }

    public static void readWithInputStreamReader(String filename) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filename));
        while (isr.read() != -1) {}
        isr.close();
    }
}
