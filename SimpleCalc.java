/*
 * Name - Pranav S Nair
 * Date - 21/07/25
 * Purpose - Function to add between data types
 */
package psn;
class Calculator{
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println("Sum of 2 = "+sum);
	}
	public void add(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println("Sum of 3 = "+sum);
	}
	public void add(double a, double b) {
		double sum=a+b;
		System.out.println("Sum of double 2= "+sum);
	}
	public void add(String str, int a) {
		String sum=str+a;
		System.out.println("Concatenate = "+sum);
	}
}
public class SimpleCalc {
	public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.add(6, 7);
	cal.add(6, 7, 5);
	cal.add(3.14, 9.87);
	cal.add("Thomas ", 71);
}
}
