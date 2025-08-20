
public class StringDem {
	public static void main(String[] args) {
		// With New Keyword
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1==s2); // false
		// Normal
		String s3 = "Java";
		String s4 = "Java";
		System.out.println(s3==s4); // true
	}
}
