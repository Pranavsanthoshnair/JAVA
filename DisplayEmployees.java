import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class DisplayEmployees extends JFrame {
    JTable table;
    DefaultTableModel model;

    public DisplayEmployees() {
        setTitle("Employee Records");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.BorderLayout());

        model = new DefaultTableModel();
        table = new JTable(model);
        add(new JScrollPane(table), java.awt.BorderLayout.CENTER);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/companydb", "root", "password");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employees");
            ResultSetMetaData meta = rs.getMetaData();
            int cols = meta.getColumnCount();

            for (int i = 1; i <= cols; i++)
                model.addColumn(meta.getColumnName(i));

            while (rs.next()) {
                Object[] row = new Object[cols];
                for (int i = 1; i <= cols; i++)
                    row[i - 1] = rs.getObject(i);
                model.addRow(row);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new DisplayEmployees();
    }
}
