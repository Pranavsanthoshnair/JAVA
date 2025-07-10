/*
Name - Pranav S Nair
Date - 10/07/2025
Purpose - "Grading System"
*/
package demo;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
		int marks;
		System.out.println("Enter Number");
		Scanner inp = new Scanner(System.in);
		marks = inp.nextInt();
		if(marks >=90) {
			System.out.println("Grade A");
		} else if (marks >= 75) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade C");
		}
	}
}