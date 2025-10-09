import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberFinder extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField text1, text2, text3;
    JButton button;

    public NumberFinder() {
        setTitle("Previous and Next Number Finder");
        setLayout(new GridLayout(4, 2, 10, 10));

        label1 = new JLabel("Enter a Number:");
        label2 = new JLabel("Previous Number:");
        label3 = new JLabel("Next Number:");

        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text2.setEditable(false);
        text3.setEditable(false);

        button = new JButton("Find");
        button.addActionListener(this);

        add(label1); add(text1);
        add(label2); add(text2);
        add(label3); add(text3);
        add(new JLabel("")); add(button);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(text1.getText());
            text2.setText(String.valueOf(num - 1));
            text3.setText(String.valueOf(num + 1));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!",
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new NumberFinder();
    }
}
