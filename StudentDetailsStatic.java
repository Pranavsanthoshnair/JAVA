/*
 * Name - Pranav S Nair
 * Date - 1/8/25
 * Purpose - To print student details and print total no of students.
 */
class Student{
	String name;
	int rollNumber;
	static int studentCount;
	Student(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		studentCount++;
	}
	public static void displayStudentCount() {
		System.out.println("Total No of Students: "+studentCount+"\n");
	}
	public void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollNumber);
	}
}
public class StudentDetailsStatic {
	public static void main(String[] args) {
	Student s1 = new Student("John Doe",16);
	s1.displayInfo();
	Student.displayStudentCount();
	
	Student s2 = new Student("Jose Tom",23);
	s2.displayInfo();
	Student.displayStudentCount();
	
	Student s3 = new Student("Rifan S",62);
	s3.displayInfo();
	Student.displayStudentCount();
	}
}
