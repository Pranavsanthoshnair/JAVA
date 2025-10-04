
import java.awt.*;
import javax.swing.*;
public class LoginForm {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Sign up Form");
		frame.setSize(500, 500);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(6,2,10,10));
		
		JLabel nameLabel = new JLabel("    Name:");
		JTextField nameText = new JTextField();
		
		JLabel emailLabel = new JLabel("    Email:");
		JTextField emailText = new JTextField();
		
		JLabel genderLabel = new JLabel("    Gender:");
		JRadioButton male = new JRadioButton("male");
		JRadioButton female = new JRadioButton("female");
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
	
		JPanel genderPanel = new JPanel();
		genderPanel.setLayout(new FlowLayout());
		genderPanel.add(male);
		genderPanel.add(female);
		
		JLabel countryLabel = new JLabel("    Country:");
		String [] countries = {"India","China","USA"};
		JComboBox<String> countryBox = new JComboBox<>(countries);
		
		JLabel addressLabel = new JLabel("    Address:");
		JTextArea address = new JTextArea(3,6);
		
		JLabel empty = new JLabel();
		JButton submit = new JButton("Submit");
		
		mainPanel.add(nameLabel);
		mainPanel.add(nameText);
		
		mainPanel.add(emailLabel);
		mainPanel.add(emailText);
		
		mainPanel.add(genderLabel);
		mainPanel.add(genderPanel);
		
		mainPanel.add(countryLabel);
		mainPanel.add(countryBox);
		
		mainPanel.add(addressLabel);
		mainPanel.add(address);
		
		mainPanel.add(empty);
		mainPanel.add(submit);
		
		frame.add(mainPanel);
		frame.setVisible(true);
	}

}
