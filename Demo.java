package psn;
class AreaCalculator{
	public void area(double r) {
		double area = 3.14f * r * r;
		System.out.println("Area of circle : "+area);
	}
	public void area(double l, double b) {
		double area = l*b;
		System.out.println("Area of rectangle : "+area);
	}
	public void area(float b,float h) {
		double area = 0.5*b*h;
		System.out.println("Area of triangle : "+area);
	}
	public void area(int a) {
		double area = a*a;
		System.out.println("Area of square : "+area);
	}
}
public class Demo {
	public static void main(String[] args) {
		AreaCalculator ar = new AreaCalculator();
		ar.area(4.00);
		ar.area(4.00, 6.00);
		ar.area(3.0f, 5.0f);
		ar.area(5);
		
	}

}
