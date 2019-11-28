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
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JButton button;
	private JTextField textField;
	private JButton btnSignUp;
	private JLabel lblSighnUp;
	private JTextField suffixTextBox;
	private JLabel lblSuffix;

	/**
	 * Launch the application.
	 */
	public void openSignUpPage() {
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
		frame.setBounds(1001, 600, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		firstNameTextbox = new JTextField();
		firstNameTextbox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		firstNameTextbox.setBounds(79, 205, 171, 32);
		frame.getContentPane().add(firstNameTextbox);
		firstNameTextbox.setColumns(10);
		
		phoneTextbox = new JTextField();
		phoneTextbox.setBounds(279, 405, 171, 32);
		frame.getContentPane().add(phoneTextbox);
		phoneTextbox.setColumns(10);
		
		JLabel firstNameLabel = new JLabel("First name");
		firstNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		firstNameLabel.setForeground(SystemColor.text);
		firstNameLabel.setBounds(79, 238, 171, 23);
		frame.getContentPane().add(firstNameLabel);
		
		JLabel emailLabel = new JLabel("Email");

		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		emailLabel.setForeground(SystemColor.text);
		emailLabel.setBounds(79, 436, 171, 23);
		frame.getContentPane().add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordLabel.setForeground(SystemColor.text);
		passwordLabel.setBounds(279, 525, 171, 23);
		frame.getContentPane().add(passwordLabel);
		
		JLabel phoneLabel = new JLabel("Phone");
		phoneLabel.setHorizontalAlignment(SwingConstants.LEFT);
		phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		phoneLabel.setForeground(SystemColor.text);
		phoneLabel.setBounds(279, 436, 171, 23);
		frame.getContentPane().add(phoneLabel);
		
		JLabel lastNameLabel = new JLabel("Last name");
		lastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lastNameLabel.setForeground(SystemColor.text);
		lastNameLabel.setBounds(339, 238, 171, 23);
		frame.getContentPane().add(lastNameLabel);
		
		lastNameTextbox = new JTextField();
		lastNameTextbox.setColumns(10);
		lastNameTextbox.setBounds(339, 205, 171, 32);
		frame.getContentPane().add(lastNameTextbox);
		
		txtA = new JTextField();
		txtA.setColumns(10);
		txtA.setBounds(279, 205, 30, 32);
		frame.getContentPane().add(txtA);
		
		JLabel middleInitialLabel = new JLabel("Mi");
		middleInitialLabel.setHorizontalAlignment(SwingConstants.LEFT);
		middleInitialLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		middleInitialLabel.setForeground(SystemColor.text);
		middleInitialLabel.setBounds(279, 238, 30, 23);
		frame.getContentPane().add(middleInitialLabel);
		
		emailTextbox = new JTextField();
		emailTextbox.setColumns(10);
		emailTextbox.setBounds(79, 405, 171, 32);
		frame.getContentPane().add(emailTextbox);
		
		streetAddressTexBox = new JTextField();
		streetAddressTexBox.setColumns(10);
		streetAddressTexBox.setBounds(79, 310, 171, 32);
		frame.getContentPane().add(streetAddressTexBox);
		
		JLabel streetAddressLabel = new JLabel("Street Address");

		streetAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		streetAddressLabel.setHorizontalAlignment(SwingConstants.LEFT);
		streetAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		streetAddressLabel.setForeground(SystemColor.text);
		streetAddressLabel.setBounds(79, 341, 171, 23);
		frame.getContentPane().add(streetAddressLabel);
		
		JLabel cityLabel = new JLabel("City");
		cityLabel.setHorizontalAlignment(SwingConstants.LEFT);
		cityLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cityLabel.setForeground(SystemColor.text);
		cityLabel.setBounds(279, 341, 161, 23);
		frame.getContentPane().add(cityLabel);
		
		cityTextbox = new JTextField();
		cityTextbox.setColumns(10);
		cityTextbox.setBounds(279, 310, 171, 32);
		frame.getContentPane().add(cityTextbox);
		
		JLabel stateLabel = new JLabel("State");
		stateLabel.setHorizontalAlignment(SwingConstants.LEFT);
		stateLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		stateLabel.setForeground(SystemColor.text);
		stateLabel.setBounds(475, 341, 85, 23);
		frame.getContentPane().add(stateLabel);
		
		stateTextbox = new JTextField();
		stateTextbox.setColumns(10);
		stateTextbox.setBounds(475, 310, 85, 32);
		frame.getContentPane().add(stateTextbox);
		
		JLabel zipCodeLabel = new JLabel("Zip Code");
		zipCodeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		zipCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		zipCodeLabel.setForeground(SystemColor.text);
		zipCodeLabel.setBounds(582, 341, 85, 23);
		frame.getContentPane().add(zipCodeLabel);
		
		zipCodeTextbox = new JTextField();
		zipCodeTextbox.setColumns(10);
		zipCodeTextbox.setBounds(582, 310, 85, 32);
		frame.getContentPane().add(zipCodeTextbox);
		
		JLabel extentionLabel = new JLabel("Extension");
		extentionLabel.setHorizontalAlignment(SwingConstants.LEFT);
		extentionLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		extentionLabel.setForeground(SystemColor.text);
		extentionLabel.setBounds(475, 436, 171, 23);
		frame.getContentPane().add(extentionLabel);
		
		extensionTextbox = new JTextField();
		extensionTextbox.setColumns(10);
		extensionTextbox.setBounds(475, 405, 126, 32);
		frame.getContentPane().add(extensionTextbox);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		usernameLabel.setForeground(SystemColor.text);
		usernameLabel.setBounds(79, 525, 171, 23);
		frame.getContentPane().add(usernameLabel);
		
		JLabel confirmPasswordLabel = new JLabel("Re-type Password");
		confirmPasswordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		confirmPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		confirmPasswordLabel.setForeground(SystemColor.text);
		confirmPasswordLabel.setBounds(475, 524, 171, 23);
		frame.getContentPane().add(confirmPasswordLabel);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(279, 496, 171, 32);
		frame.getContentPane().add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(475, 496, 171, 32);
		frame.getContentPane().add(passwordField_2);
		
		button = new JButton("Back");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBackground(Color.WHITE);
		button.setBounds(10, 668, 100, 32);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(79, 496, 171, 32);
		frame.getContentPane().add(textField);
		
		btnSignUp = new JButton("Sign up");
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setBounds(874, 668, 100, 32);
		frame.getContentPane().add(btnSignUp);
		
		lblSighnUp = new JLabel("Sign Up");
		lblSighnUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSighnUp.setForeground(Color.WHITE);
		lblSighnUp.setFont(new Font("Impact", Font.PLAIN, 50));
		lblSighnUp.setBounds(394, 45, 189, 56);
		frame.getContentPane().add(lblSighnUp);
		
		suffixTextBox = new JTextField();
		suffixTextBox.setColumns(10);
		suffixTextBox.setBounds(536, 205, 131, 32);
		frame.getContentPane().add(suffixTextBox);
		
		lblSuffix = new JLabel("Suffix");
		lblSuffix.setHorizontalAlignment(SwingConstants.LEFT);
		lblSuffix.setForeground(Color.WHITE);
		lblSuffix.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSuffix.setBounds(536, 238, 131, 23);
		frame.getContentPane().add(lblSuffix);
	}
}
