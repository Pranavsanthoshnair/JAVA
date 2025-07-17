import java.util.Scanner;

public class BillSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total bill amount: ");
        double total = sc.nextDouble();
        System.out.print("Enter number of people: ");
        int people = sc.nextInt();
        double perHead = total / people;
        System.out.println("Each person should pay: ₹" + perHead);
        sc.close();
    }
}
