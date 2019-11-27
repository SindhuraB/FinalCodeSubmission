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
	private JTextField usernameTextBox;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

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
		frame.setBounds(1001, 600, 913, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		firstNameTextbox = new JTextField();
		firstNameTextbox.setFont(new Font("Tahoma", Font.PLAIN, 22));
		firstNameTextbox.setBounds(250, 24, 171, 32);
		frame.getContentPane().add(firstNameTextbox);
		firstNameTextbox.setColumns(10);
		
		phoneTextbox = new JTextField();
		phoneTextbox.setBounds(250, 257, 171, 32);
		frame.getContentPane().add(phoneTextbox);
		phoneTextbox.setColumns(10);
		
		JButton signUpButton = new JButton("Sign Up");
		signUpButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		signUpButton.setBounds(398, 422, 126, 23);
		frame.getContentPane().add(signUpButton);
		
		JLabel firstNameLabel = new JLabel("First name");
		firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		firstNameLabel.setForeground(SystemColor.text);
		firstNameLabel.setBounds(128, 21, 114, 39);
		frame.getContentPane().add(firstNameLabel);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		emailLabel.setForeground(SystemColor.text);
		emailLabel.setBounds(128, 96, 59, 29);
		frame.getContentPane().add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordLabel.setForeground(SystemColor.text);
		passwordLabel.setBounds(128, 374, 92, 26);
		frame.getContentPane().add(passwordLabel);
		
		JLabel phoneLabel = new JLabel("Phone");
		phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		phoneLabel.setForeground(SystemColor.text);
		phoneLabel.setBounds(128, 260, 92, 26);
		frame.getContentPane().add(phoneLabel);
		
		JLabel lastNameLabel = new JLabel("Last name");
		lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lastNameLabel.setForeground(SystemColor.text);
		lastNameLabel.setBounds(482, 22, 114, 39);
		frame.getContentPane().add(lastNameLabel);
		
		lastNameTextbox = new JTextField();
		lastNameTextbox.setColumns(10);
		lastNameTextbox.setBounds(600, 24, 171, 32);
		frame.getContentPane().add(lastNameTextbox);
		
		txtA = new JTextField();
		txtA.setColumns(10);
		txtA.setBounds(825, 24, 30, 32);
		frame.getContentPane().add(txtA);
		
		JLabel middleInitialLabel = new JLabel("MI");
		middleInitialLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		middleInitialLabel.setForeground(SystemColor.text);
		middleInitialLabel.setBounds(795, 20, 30, 29);
		frame.getContentPane().add(middleInitialLabel);
		
		emailTextbox = new JTextField();
		emailTextbox.setColumns(10);
		emailTextbox.setBounds(600, 142, 171, 32);
		frame.getContentPane().add(emailTextbox);
		
		streetAddressTexBox = new JTextField();
		streetAddressTexBox.setColumns(10);
		streetAddressTexBox.setBounds(250, 195, 171, 32);
		frame.getContentPane().add(streetAddressTexBox);
		
		JLabel streetAddressLabel = new JLabel("Street Address");
		streetAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		streetAddressLabel.setForeground(SystemColor.text);
		streetAddressLabel.setBounds(128, 144, 114, 29);
		frame.getContentPane().add(streetAddressLabel);
		
		JLabel cityLabel = new JLabel("City");
		cityLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cityLabel.setForeground(SystemColor.text);
		cityLabel.setBounds(482, 144, 92, 29);
		frame.getContentPane().add(cityLabel);
		
		cityTextbox = new JTextField();
		cityTextbox.setColumns(10);
		cityTextbox.setBounds(250, 93, 171, 32);
		frame.getContentPane().add(cityTextbox);
		
		JLabel stateLabel = new JLabel("State");
		stateLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		stateLabel.setForeground(SystemColor.text);
		stateLabel.setBounds(128, 197, 92, 29);
		frame.getContentPane().add(stateLabel);
		
		stateTextbox = new JTextField();
		stateTextbox.setColumns(10);
		stateTextbox.setBounds(250, 142, 171, 32);
		frame.getContentPane().add(stateTextbox);
		
		JLabel zipCodeLabel = new JLabel("Zip Code");
		zipCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		zipCodeLabel.setForeground(SystemColor.text);
		zipCodeLabel.setBounds(482, 197, 92, 29);
		frame.getContentPane().add(zipCodeLabel);
		
		zipCodeTextbox = new JTextField();
		zipCodeTextbox.setColumns(10);
		zipCodeTextbox.setBounds(600, 195, 171, 32);
		frame.getContentPane().add(zipCodeTextbox);
		
		JLabel extentionLabel = new JLabel("Extension");
		extentionLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		extentionLabel.setForeground(SystemColor.text);
		extentionLabel.setBounds(482, 260, 92, 26);
		frame.getContentPane().add(extentionLabel);
		
		extensionTextbox = new JTextField();
		extensionTextbox.setColumns(10);
		extensionTextbox.setBounds(600, 257, 171, 32);
		frame.getContentPane().add(extensionTextbox);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		usernameLabel.setForeground(SystemColor.text);
		usernameLabel.setBounds(128, 324, 92, 26);
		frame.getContentPane().add(usernameLabel);
		
		usernameTextBox = new JTextField();
		usernameTextBox.setColumns(10);
		usernameTextBox.setBounds(250, 310, 171, 32);
		frame.getContentPane().add(usernameTextBox);
		
		JLabel confirmPasswordLabel = new JLabel("Re-type Password");
		confirmPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		confirmPasswordLabel.setForeground(SystemColor.text);
		confirmPasswordLabel.setBounds(482, 374, 114, 26);
		frame.getContentPane().add(confirmPasswordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(250, 371, 171, 32);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(600, 371, 171, 32);
		frame.getContentPane().add(passwordField_1);
	}
}
