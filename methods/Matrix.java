import java.util.Scanner;

public class Matrix {

    
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); 
            }
        }
        return matrix;
    }

    
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

   
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    
    public static void displayMatrix(int[][] matrix, String label) {
        System.out.println(label);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of rows for Matrix A and B: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A and B: ");
        int cols = sc.nextInt();

        
        System.out.print("Enter number of columns for Matrix B (for multiplication): ");
        int colsB = sc.nextInt();

        int[][] A = createRandomMatrix(rows, cols);
        int[][] B = createRandomMatrix(rows, cols);
        int[][] B_mult = createRandomMatrix(cols, colsB);  

        
        displayMatrix(A, "Matrix A:");
        displayMatrix(B, "Matrix B:");
        displayMatrix(B_mult, "Matrix B for Multiplication:");

        
        int[][] sum = addMatrices(A, B);
        int[][] diff = subtractMatrices(A, B);
        int[][] product = multiplyMatrices(A, B_mult);

        
        displayMatrix(sum, "Matrix Addition (A + B):");
        displayMatrix(diff, "Matrix Subtraction (A - B):");
        displayMatrix(product, "Matrix Multiplication (A x B_mult):");

        sc.close();
    }
}
