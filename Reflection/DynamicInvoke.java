import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicInvoke {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Scanner sc = new Scanner(System.in);
        String methodName = sc.next();
        Method m = MathOperations.class.getMethod(methodName, int.class, int.class);
        System.out.println(m.invoke(obj, 5, 3));
    }
}
