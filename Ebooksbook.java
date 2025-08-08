/*
 * Author - Pranav S Nair
 * Date - 08/08/2025
 * Purpose - "To print details of Ebook And Printed Book respectively."
 */
class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		 this.author=author;
		this.price = price;
	}
	public void displayDetails() {
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
	}
}

class Ebook extends Book{
	double filesizeMB;
	Ebook(String title,String author,double price,double filesizeMB){
		super(title,author,price);
		this.filesizeMB=filesizeMB;
	}
	public void displayDetails() {
		System.out.println("(((((Details of Ebook)))))");
		super.displayDetails();
		System.out.println("File Size MB : "+ filesizeMB + "MB\n");
		
	}
}
class PrintedBook extends Book{
	int noofPages;
	PrintedBook(String title,String author,double price,int noofPages){
		super(title,author,price);
		this.noofPages = noofPages;
	}
	public void displayDetails() {
		System.out.println("----------------------------------------------------");
		System.out.println("(((((Details of Printed Book)))))");
		super.displayDetails();
		System.out.println("No of Pages : "+ noofPages);
	}
}
public class Ebooksbook {
	public static void main(String[] args) {
		
		Ebook ebook = new Ebook("Somebody","Something",0.00,50.00);
		ebook.displayDetails();
		PrintedBook printbook = new PrintedBook("Nobody","Nothing",199.00,160);
		printbook.displayDetails();
	}

}
