/*
 * Name - Pranav S Nair
 * Date - 19/08/2025
 * Purpose - To print study about functionality of 2d arrays
 */
package pranav;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] matrix = {
				{1,2,3},
				{4,5,6,7},
				{8,9}
		};
		// or
		int [][] matrix1 = new int[3][3];
		System.out.println("No of elements in row 1: "+matrix[0].length); // To get no of elements in respective rows
		System.out.println("No of elements in row 2: "+matrix[1].length);
		System.out.println("No of elements in row 3: "+matrix[2].length);
		System.out.println("Total No of rows: "+matrix.length);    // To get total no of rows
	
	// or
	for(int i = 0;i<matrix.length;i++) { // To print elements in matrix
		for(int j = 0;j<matrix[i].length;j++) {
			System.out.print("Elements are : "+matrix[i][j]+"\t");
		}
	}
	}
}
