class Student {
    String name;
    public Student() { this.name = "Default Student"; }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Student");
        Object obj = cls.getDeclaredConstructor().newInstance();
        System.out.println(((Student)obj).name);
    }
}
