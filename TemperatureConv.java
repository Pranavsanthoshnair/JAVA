import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConv extends JFrame implements ActionListener {
    private JTextField inputField, resultField;
    private JButton toCelsiusBtn, toFahrenheitBtn, clearBtn;

    TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(550, 220);
        setLayout(new BorderLayout(10, 10));

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel inputLabel = new JLabel("Enter Temperature:");
        inputField = new JTextField();
        JLabel resultLabel = new JLabel("Converted Value:");
        resultField = new JTextField();
        resultField.setEditable(false);
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(resultLabel);
        inputPanel.add(resultField);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        toCelsiusBtn = new JButton("Convert to Celsius");
        toFahrenheitBtn = new JButton("Convert to Fahrenheit");
        clearBtn = new JButton("Clear");
        toCelsiusBtn.addActionListener(this);
        toFahrenheitBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        buttonPanel.add(toCelsiusBtn);
        buttonPanel.add(toFahrenheitBtn);
        buttonPanel.add(clearBtn);

        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double input = Double.parseDouble(inputField.getText());
            if (e.getSource() == toCelsiusBtn) {
                double celsius = (input - 32) * 5 / 9;
                resultField.setText(String.format("%.2f °C", celsius));
            } else if (e.getSource() == toFahrenheitBtn) {
                double fahrenheit = (input * 9 / 5) + 32;
                resultField.setText(String.format("%.2f °F", fahrenheit));
            } else if (e.getSource() == clearBtn) {
                inputField.setText("");
                resultField.setText("");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
