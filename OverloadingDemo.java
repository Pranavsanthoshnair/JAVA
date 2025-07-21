package psn;
class Shape{
	public void area(float radius) {
		float area =3.14f*radius*radius;
		System.out.println("Area(circle) = "+area);
	}
	public void area(int l, int b) {
		int area = l*b;
		System.out.println("Area(rectangle) = "+area);
	}
	public void area(int a) {
		int area =a*a;
		System.out.println("Area(square) = "+area);
	}
}
public class OverloadingDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area(10.5f);
		shape.area(10);
		shape.area(7, 10);
	}

}
