/* 
 * Name - Pranav S Nair
 * Date - 18/07/25
 * Purpose - To display initialised book details.
 */
class Book{
	String title;
	String author;
	double price;
	Book(){
		this.title = "unknown";
		this.author = "Not Assigned";
		this.price = 0.0;
	}
	public void displayDetails() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		
	}
}
public class BookInit {
	public static void main(String[] args) {
		Book book = new Book();
		book.displayDetails();
	}

}
