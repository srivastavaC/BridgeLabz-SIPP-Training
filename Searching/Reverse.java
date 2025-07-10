public class Reverse {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
