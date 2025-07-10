// Name - Pranav S Nair
// Date - 10/07/25
// Purpose - Eligible For Voting or not.
package demo;
import java.util.Scanner;
public class Voting {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter Number");
		Scanner input = new Scanner(System.in);
		age = input.nextInt();
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
		input.close();
	}
}
