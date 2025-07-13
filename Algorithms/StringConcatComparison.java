
public class StringConcatComparison {
    public static String concatWithString(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "a";
        }
        return result;
    }

    public static String concatWithStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    public static String concatWithStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }
}
