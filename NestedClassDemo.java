
class CPU{
	private String motherboard = "Intel";
	class Processor{
		int speed = 1000;
		public void display() {
			System.out.println(motherboard);
			System.out.println(speed);
			
		}
	}
}
public class NestedClassDemo {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();             // Combines outer class object with inner class object
		processor.display();
	}
}


// static class
/*
class CPU{
	static String motherboard = "Intel";
	static class Processor{
		int speed = 1000;
		public void display() {
			System.out.println(motherboard);
			System.out.println(speed);
			
		}
	}
}
public class Demo{
	public static void main(String[] args) {
		CPU cpu = new CPU();
		CPU.Processor processor = cpu.new Processor();             // Combines outer class object with inner class object
		processor.display();
	}
}
*/

