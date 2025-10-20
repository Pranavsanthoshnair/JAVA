import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class plsPracticeJava extends JFrame implements ActionListener {
    JTextField textField;
    JLabel label;
    JButton button;

    SwingEventDemo() {
        label = new JLabel("Welcome!");
        textField = new JTextField(15);
        button = new JButton("Press Me");
        button.addActionListener(this);
        setLayout(new FlowLayout());
        add(label);
        add(textField);
        add(button);
        setTitle("Event Handling Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        textField.setText("Plz practice Java");
        label.setText("Hellooo");
    }

    public static void main(String[] args) {
        new SwingEventDemo();
    }
}
