package pranav;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row, col;
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        
        System.out.print("Enter the number of columns: ");
        col = sc.nextInt();
        
        int[][] matrix = new int[row][col];
        int[][] transpose = new int[col][row];
        
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Transpose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
