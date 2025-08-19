package pranav;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		int [] array = {1,2,3,4};
		int [] array2 = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.println(array[0]);
		System.out.println(array.length);
		for(int i=0;i<4;i++) {
			System.out.println(array[i]+"\t");
		}
		System.out.println("using enhanced for loop");
		for(int num:array) {
			System.out.println(num+"\t");
		}
	}
}
