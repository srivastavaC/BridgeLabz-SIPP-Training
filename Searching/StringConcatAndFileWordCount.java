import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class StringConcatAndFileWordCount {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hello", "world", "java");

        // StringBuilder performance
        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            for (String s : strings) {
                sb.append(s);
            }
        }
        long endSB = System.nanoTime();
        long durationSB = (endSB - startSB) / 1_000_000;
        System.out.println("Time taken by StringBuilder: " + durationSB + " ms");

        // StringBuffer performance
        long startSBuf = System.nanoTime();
        StringBuffer sBuf = new StringBuffer();
        for (int i = 0; i < 1_000_000; i++) {
            for (String s : strings) {
                sBuf.append(s);
            }
        }
        long endSBuf = System.nanoTime();
        long durationSBuf = (endSBuf - startSBuf) / 1_000_000;
        System.out.println("Time taken by StringBuffer: " + durationSBuf + " ms");

        // Reading large file and counting words
        String filePath = "largefile.txt"; // Use an actual 100MB file
        long wordCount = 0;

        // Using FileReader
        long startFR = System.nanoTime();
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endFR = System.nanoTime();
        System.out.println("Word count using FileReader: " + wordCount);
        System.out.println("Time taken by FileReader: " + (endFR - startFR) / 1_000_000 + " ms");

        // Reset word count for InputStreamReader
        wordCount = 0;

        // Using InputStreamReader
        long startISR = System.nanoTime();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
            br.close();
            isr.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endISR = System.nanoTime();
        System.out.println("Word count using InputStreamReader: " + wordCount);
        System.out.println("Time taken by InputStreamReader: " + (endISR - startISR) / 1_000_000 + " ms");
    }
}
