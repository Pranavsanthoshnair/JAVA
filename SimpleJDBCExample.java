import java.sql.*;
import java.util.Scanner;

public class SimpleJDBCExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schooldb", "root", "password");
            Statement st = con.createStatement();

            while (true) {
                System.out.println("\n1. Create Table");
                System.out.println("2. Find Topper");
                System.out.println("3. Find Average Marks");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                if (ch == 1) {
                    st.executeUpdate("CREATE TABLE IF NOT EXISTS classA(rollno INT, name VARCHAR(50), sub1 INT, sub2 INT, sub3 INT)");
                    System.out.println("Table created successfully!");
                } else if (ch == 2) {
                    ResultSet rs = st.executeQuery("SELECT * FROM classA");
                    int maxTotal = 0;
                    String topper = "";
                    while (rs.next()) {
                        int total = rs.getInt("sub1") + rs.getInt("sub2") + rs.getInt("sub3");
                        if (total > maxTotal) {
                            maxTotal = total;
                            topper = rs.getString("name");
                        }
                    }
                    System.out.println("Topper: " + topper + " with total marks = " + maxTotal);
                } else if (ch == 3) {
                    System.out.print("Enter subject (sub1/sub2/sub3): ");
                    String sub = sc.next();
                    ResultSet rs = st.executeQuery("SELECT " + sub + " FROM classA");
                    int sum = 0, count = 0;
                    while (rs.next()) {
                        sum += rs.getInt(sub);
                        count++;
                    }
                    if (count > 0)
                        System.out.println("Average marks in " + sub + " = " + (sum / count));
                    else
                        System.out.println("No data available.");
                } else if (ch == 4) {
                    con.close();
                    break;
                } else {
                    System.out.println("Invalid choice!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
