/* 
 * Name - Pranav S Nair
 * Date - 18/07/25
 * Purpose - To display student details.
 */
class Student{
	String name;
	int rollNumber;
	String dept;
	Student(String name , int rollNumber , String dept){
		this.name = name;
		this.rollNumber = rollNumber;
		this.dept = dept;
	}
	public void printStudentInfo() {
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Department:"+dept);
	}
}
public class Pardem {
	public static void main(String[] args) {
		Student std1 = new Student("John",12,"CSE");
		std1.printStudentInfo();
		Student std2 = new Student("Doe",32,"ECE");
		std2.printStudentInfo();
		
	}
}
