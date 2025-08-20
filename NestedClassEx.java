class Outer{
	private int outer_x = 100;
	void test() {
		System.out.println("Outer_x = "+outer_x);
	}
	class Nested{
		void display() {
			// Inner class can access pvt variable of outer
			System.out.println("From Nested class: Outer_x = "+outer_x);
		}
	}
}
public class NestedClassEx {
	public static void main(String[] args) {
		Outer outerObj = new Outer();
		outerObj.test();
		Outer.Nested nestedObj = outerObj.new Nested();
		nestedObj.display();
	}
}
