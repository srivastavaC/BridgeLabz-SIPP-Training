import java.lang.reflect.*;

class Task {
    public void process() throws InterruptedException { Thread.sleep(200); }
}

public class MethodTiming {
    public static void main(String[] args) throws Exception {
        Task t = new Task();
        Method m = Task.class.getMethod("process");
        long start = System.nanoTime();
        m.invoke(t);
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start)/1_000_000 + " ms");
    }
}
