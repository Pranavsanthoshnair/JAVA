/*
 * Name - Pranav S Nair
 * Date - 11/07/2025
 * Purpose - To check if a given number is palindrome or not
 */
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		int num;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a Number");
		num = inp.nextInt();
		int origin = num;
		int rev=0,rem;
		while(num>0) {
			rem = num % 10;
			rev = rev*10+rem;
			num = num/10;
		}
		if(origin==rev) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
	}

}
