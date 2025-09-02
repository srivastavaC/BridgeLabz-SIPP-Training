public class TransformNames {
    public static void main(String[] args) {
        List<String> customers = Arrays.asList("alice", "bob", "charlie", "david");

        customers.stream()
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    }
}
