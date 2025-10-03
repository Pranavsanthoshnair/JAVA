package experiment1;
import java.awt.FlowLayout;
import javax.swing.*;

public class JframeDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo");
        frame.setSize(500, 500);
        frame.setVisible(true);
        JPanel panel =new JPanel();
        panel.setLayout(new FlowLayout());
        JTextField textField = new JTextField(20);
        panel.add(textField);
        JButton button =new JButton("submit");
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}
