/*
 * Name - Pranav S Nair
 * Date - 19/08/2025
 * Purpose - To print largest number of array.
 */
package pranav;
import java.util.Scanner;
public class ArrayS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Input the size : ");
		size = sc.nextInt();
		int [] array = new int[size];
		System.out.println("Enter the elements");
		for(int i =0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("The array is : \n");
		for(int i =0;i<size;i++) {
			System.out.print(array[i]+"\t");
		}
		int largest = array[0];
		for(int i =0;i<size;i++) {
			if(array[i]>largest) {
				largest = array[i];
			}
		}System.out.println("\n\nThe largest element is : " +  largest);
		sc.close();
	}
}
