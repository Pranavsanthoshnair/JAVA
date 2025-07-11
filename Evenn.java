/*
 * Name - Pranav S Nair
 * Date - 11/07/2025
 * Purpose - To print even numbers upto n 
 */
import java.util.Scanner;
public class Evenn {
public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	num = sc.nextInt();
	for(int i = 2;i<num;i=i+2) {
		System.out.println(i);
		
	}
}
}
