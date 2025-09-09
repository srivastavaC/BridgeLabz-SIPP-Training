import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service { void run() { System.out.println("Service running"); } }

class Client {
    @Inject Service service;
    void execute() { service.run(); }
}

public class SimpleDI {
    public static void main(String[] args) throws Exception {
        Client c = new Client();
        for (Field f : Client.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                f.set(c, f.getType().getDeclaredConstructor().newInstance());
            }
        }
        c.execute();
    }
}
