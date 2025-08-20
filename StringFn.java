import java.util.Scanner;
public class StringFn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String [] words = sentence.split(" ");
		for(String word:words) {
			System.out.println(word);
		}
		System.out.println("To char");
		for(String word:words) {
			char [] chars = word.toCharArray();
			for(int i = 0;i<chars.length;i++) {
				System.out.println(chars[i]);
			}
		}
		System.out.println(words.length);   // no of characters or length
		sc.close();
	}

}



