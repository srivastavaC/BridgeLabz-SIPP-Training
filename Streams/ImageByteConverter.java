import java.io.*;

public class ImageByteConverter {
    public static void main(String[] args) {
        String sourceImage = "original.jpg";
        String outputImage = "copy.jpg";

        try {
            byte[] imageBytes = imageToByteArray(sourceImage);
            byteArrayToImage(imageBytes, outputImage);
            boolean isIdentical = compareFiles(sourceImage, outputImage);
            System.out.println("Are the files identical? " + isIdentical);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    public static byte[] imageToByteArray(String imagePath) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (FileInputStream fis = new FileInputStream(imagePath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
        }
        return baos.toByteArray();
    }

    public static void byteArrayToImage(byte[] data, String outputPath) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        try (FileOutputStream fos = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static boolean compareFiles(String path1, String path2) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(path1);
             FileInputStream fis2 = new FileInputStream(path2)) {
            int b1, b2;
            do {
                b1 = fis1.read();
                b2 = fis2.read();
                if (b1 != b2) {
                    return false;
                }
            } while (b1 != -1 && b2 != -1);
        }
        return true;
    }
}
