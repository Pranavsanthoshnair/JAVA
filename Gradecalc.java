/*
 * Name - Pranav S Nair
 * Date - 11/07/2025
 * Purpose - To check a grades remarks
 */

import java.util.Scanner;
public class Gradecalc {
	public static void main(String[] argd) {
		String grade;
		System.out.println("Enter Grade");
		Scanner inp = new Scanner(System.in);
		grade = inp.nextLine();
		
		String result = switch (grade) {
		case "S" -> "Outstanding Performance";
		case "A+" -> "Excellent Performance";
		case "A" -> "Very Good Performance";
		case "B+" -> "Good Performance";
		case "B" -> " Above Average Performance";
		case "C" -> "Average Performance";
		case "P" -> "Pass";
		case "F" -> "Fail";
		default -> "Invalid Grade";
		};
		
		System.out.println(result);
		inp.close();
	}
}
