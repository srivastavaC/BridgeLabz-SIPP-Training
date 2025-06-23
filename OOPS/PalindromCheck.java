public class PalindromCheck {
    String text;
    public PalindromCheck(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }
    public void display() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}
