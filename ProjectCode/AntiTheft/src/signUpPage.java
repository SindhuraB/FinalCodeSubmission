import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class signUpPage {

	private JFrame frame;
	private JTextField firstNameTextbox;
	private JTextField phoneTextbox;
	private JTextField lastNameTextbox;
	private JTextField txtA;
	private JTextField emailTextbox;
	private JTextField streetAddressTexBox;
	private JTextField cityTextbox;
	private JTextField stateTextbox;
	private JTextField zipCodeTextbox;
	private JTextField extensionTextbox;
	private JTextField usernameTextBox;
	private JTextField passwordTextbox;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void openSignUpPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUpPage window = new signUpPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signUpPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(1001, 600, 701, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		firstNameTextbox = new JTextField();
		firstNameTextbox.setText("Noman");
		firstNameTextbox.setBounds(128, 24, 171, 20);
		frame.getContentPane().add(firstNameTextbox);
		firstNameTextbox.setColumns(10);
		
		phoneTextbox = new JTextField();
		phoneTextbox.setText("XXX-XXX-XXX");
		phoneTextbox.setBounds(128, 188, 171, 20);
		frame.getContentPane().add(phoneTextbox);
		phoneTextbox.setColumns(10);
		
		JButton signUpButton = new JButton("Sign Up");
		signUpButton.setBounds(278, 303, 126, 23);
		frame.getContentPane().add(signUpButton);
		
		JLabel firstNameLabel = new JLabel("First name");
		firstNameLabel.setForeground(SystemColor.text);
		firstNameLabel.setBounds(33, 21, 92, 29);
		frame.getContentPane().add(firstNameLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setForeground(SystemColor.text);
		emailLabel.setBounds(33, 62, 92, 27);
		frame.getContentPane().add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(SystemColor.text);
		passwordLabel.setBounds(33, 264, 92, 26);
		frame.getContentPane().add(passwordLabel);
		
		JLabel phoneLabel = new JLabel("Phone");
		phoneLabel.setForeground(SystemColor.text);
		phoneLabel.setBounds(33, 185, 92, 26);
		frame.getContentPane().add(phoneLabel);
		
		JLabel lastNameLabel = new JLabel("Last name");
		lastNameLabel.setForeground(SystemColor.text);
		lastNameLabel.setBounds(312, 18, 92, 29);
		frame.getContentPane().add(lastNameLabel);
		
		lastNameTextbox = new JTextField();
		lastNameTextbox.setText("Syed");
		lastNameTextbox.setColumns(10);
		lastNameTextbox.setBounds(408, 24, 171, 20);
		frame.getContentPane().add(lastNameTextbox);
		
		txtA = new JTextField();
		txtA.setText("A");
		txtA.setColumns(10);
		txtA.setBounds(613, 24, 30, 20);
		frame.getContentPane().add(txtA);
		
		JLabel lblMi_1 = new JLabel("MI");
		lblMi_1.setBounds(584, 20, 30, 29);
		frame.getContentPane().add(lblMi_1);
		
		emailTextbox = new JTextField();
		emailTextbox.setText("Noman");
		emailTextbox.setColumns(10);
		emailTextbox.setBounds(128, 65, 171, 20);
		frame.getContentPane().add(emailTextbox);
		
		streetAddressTexBox = new JTextField();
		streetAddressTexBox.setText("Noman");
		streetAddressTexBox.setColumns(10);
		streetAddressTexBox.setBounds(128, 106, 171, 20);
		frame.getContentPane().add(streetAddressTexBox);
		
		JLabel streetAddressLabel = new JLabel("Street Address");
		streetAddressLabel.setForeground(SystemColor.text);
		streetAddressLabel.setBounds(33, 103, 92, 29);
		frame.getContentPane().add(streetAddressLabel);
		
		JLabel cityLabel = new JLabel("City");
		cityLabel.setForeground(SystemColor.text);
		cityLabel.setBounds(312, 103, 92, 29);
		frame.getContentPane().add(cityLabel);
		
		cityTextbox = new JTextField();
		cityTextbox.setText("Richardson");
		cityTextbox.setColumns(10);
		cityTextbox.setBounds(408, 106, 171, 20);
		frame.getContentPane().add(cityTextbox);
		
		JLabel stateLabel = new JLabel("State");
		stateLabel.setForeground(SystemColor.text);
		stateLabel.setBounds(33, 145, 92, 29);
		frame.getContentPane().add(stateLabel);
		
		stateTextbox = new JTextField();
		stateTextbox.setText("Texas");
		stateTextbox.setColumns(10);
		stateTextbox.setBounds(128, 147, 171, 20);
		frame.getContentPane().add(stateTextbox);
		
		JLabel zipCodeLabel = new JLabel("Zip Code");
		zipCodeLabel.setForeground(SystemColor.text);
		zipCodeLabel.setBounds(312, 143, 92, 29);
		frame.getContentPane().add(zipCodeLabel);
		
		zipCodeTextbox = new JTextField();
		zipCodeTextbox.setText("75088");
		zipCodeTextbox.setColumns(10);
		zipCodeTextbox.setBounds(408, 147, 171, 20);
		frame.getContentPane().add(zipCodeTextbox);
		
		JLabel extentionLabel = new JLabel("Extension");
		extentionLabel.setForeground(SystemColor.text);
		extentionLabel.setBounds(312, 185, 92, 26);
		frame.getContentPane().add(extentionLabel);
		
		extensionTextbox = new JTextField();
		extensionTextbox.setColumns(10);
		extensionTextbox.setBounds(408, 188, 171, 20);
		frame.getContentPane().add(extensionTextbox);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setForeground(SystemColor.text);
		usernameLabel.setBounds(33, 227, 92, 26);
		frame.getContentPane().add(usernameLabel);
		
		usernameTextBox = new JTextField();
		usernameTextBox.setText("Texas");
		usernameTextBox.setColumns(10);
		usernameTextBox.setBounds(128, 229, 171, 20);
		frame.getContentPane().add(usernameTextBox);
		
		passwordTextbox = new JTextField();
		passwordTextbox.setText("Texas");
		passwordTextbox.setColumns(10);
		passwordTextbox.setBounds(128, 267, 171, 20);
		frame.getContentPane().add(passwordTextbox);
		
		JLabel confirmPasswordLabel = new JLabel("Confirm Password");
		confirmPasswordLabel.setForeground(SystemColor.text);
		confirmPasswordLabel.setBounds(312, 264, 92, 26);
		frame.getContentPane().add(confirmPasswordLabel);
		
		textField_4 = new JTextField();
		textField_4.setText("Texas");
		textField_4.setColumns(10);
		textField_4.setBounds(408, 267, 171, 20);
		frame.getContentPane().add(textField_4);
	}
}
