import java.lang.reflect.*;
import java.util.*;

class User {
    String name;
    int age;
}

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String,Object> props) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String,Object> e : props.entrySet()) {
            Field f = clazz.getDeclaredField(e.getKey());
            f.setAccessible(true);
            f.set(obj, e.getValue());
        }
        return obj;
    }
    public static void main(String[] args) throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("name","Alice");
        map.put("age",22);
        User u = toObject(User.class,map);
        System.out.println(u.name + " " + u.age);
    }
}
