import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author { String name(); }

@Author(name="John Doe")
class Book {}

public class AnnotationTest {
    public static void main(String[] args) {
        Annotation[] annotations = Book.class.getAnnotations();
        for (Annotation a : annotations) System.out.println(a);
    }
}
