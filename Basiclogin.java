import java.util.Scanner;

public class BasicLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUser = "admin";
        String correctPass = "1234";
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        if (user.equals(correctUser) && pass.equals(correctPass)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
        sc.close();
    }
}
