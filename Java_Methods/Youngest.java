import java.util.Scanner;
public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Heights :");
        int n = sc.nextInt();
        int[] heights = new int[n];
        System.out.println("Enter The Ages:");
            int[] ages = new int[n];
        }
    
        public static int findYoungest(int[] ages, int[] heights) {
            int minAge = Integer.MAX_VALUE;
            for (int age : ages) {
                if (age < minAge) {
                    minAge = age;
                }
            }
            return minAge;
        }
    
        public static int findTallest(int[] heights) {
            int maxHeight = Integer.MIN_VALUE;
            for (int height : heights) {
                if (height > maxHeight) {
                    maxHeight = height;
                }
            }
            return maxHeight;
        }
    }
