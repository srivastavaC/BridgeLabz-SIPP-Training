import java.lang.reflect.*;

class Product {
    String name = "Phone";
    double price = 699.99;
}

public class JsonGenerator {
    public static void main(String[] args) throws Exception {
        Product p = new Product();
        StringBuilder sb = new StringBuilder("{");
        for (Field f : Product.class.getDeclaredFields()) {
            f.setAccessible(true);
            sb.append("\"").append(f.getName()).append("\":\"").append(f.get(p)).append("\",");
        }
        sb.deleteCharAt(sb.length()-1).append("}");
        System.out.println(sb.toString());
    }
}
