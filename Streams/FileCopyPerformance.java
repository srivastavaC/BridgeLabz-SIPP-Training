import java.io.*;

public class FileCopyPerformance {

    private static final int BUFFER_SIZE = 4096;
    private static final String SOURCE_FILE = "largefile.txt";
    private static final String DEST_FILE_BUFFERED = "copied_buffered.txt";
    private static final String DEST_FILE_UNBUFFERED = "copied_unbuffered.txt";

    public static void main(String[] args) {
        long timeBuffered = copyUsingBufferedStream(SOURCE_FILE, DEST_FILE_BUFFERED);
        long timeUnbuffered = copyUsingUnbufferedStream(SOURCE_FILE, DEST_FILE_UNBUFFERED);

        System.out.println("Time taken with Buffered Streams:   " + timeBuffered + " ns");
        System.out.println("Time taken with Unbuffered Streams: " + timeUnbuffered + " ns");
    }

    public static long copyUsingBufferedStream(String source, String dest) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Buffered Stream Error: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }

    public static long copyUsingUnbufferedStream(String source, String dest) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Unbuffered Stream Error: " + e.getMessage());
        }

        return System.nanoTime() - startTime;
    }
}
