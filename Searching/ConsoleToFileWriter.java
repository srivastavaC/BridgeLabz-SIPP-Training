import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFileWriter {
    public static void main(String[] args) {
        String filePath = "user_input.txt";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(filePath);

            String input;
            System.out.println("Enter text (type 'exit' to finish):");

            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(input + System.lineSeparator());
            }

            fw.close();
            br.close();
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
