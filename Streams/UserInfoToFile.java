import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInfoToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name, age, language;

        try {
            System.out.print("Enter your name: ");
            name = reader.readLine();

            System.out.print("Enter your age: ");
            age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            language = reader.readLine();

            FileWriter writer = new FileWriter("userinfo.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            writer.close();

            System.out.println("Information saved to userinfo.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
