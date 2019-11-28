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
	private JButton button;

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
		firstNameTextbox.setFont(new Font("Tahoma", Font.PLAIN, 22));
		firstNameTextbox.setBounds(79, 195, 171, 32);
		frame.getContentPane().add(firstNameTextbox);
		firstNameTextbox.setColumns(10);
		
		phoneTextbox = new JTextField();
		phoneTextbox.setBounds(260, 429, 171, 32);
		frame.getContentPane().add(phoneTextbox);
		phoneTextbox.setColumns(10);
		
		JButton signUpButton = new JButton("Sign Up");
		signUpButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		signUpButton.setBounds(772, 75, 126, 23);
		frame.getContentPane().add(signUpButton);
		
		JLabel firstNameLabel = new JLabel("First name");
		firstNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		firstNameLabel.setForeground(SystemColor.text);
		firstNameLabel.setBounds(79, 238, 171, 39);
		frame.getContentPane().add(firstNameLabel);
		
		JLabel emailLabel = new JLabel("Email");

		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));

		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		emailLabel.setForeground(SystemColor.text);
		emailLabel.setBounds(79, 472, 171, 39);
		frame.getContentPane().add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordLabel.setForeground(SystemColor.text);
		passwordLabel.setBounds(260, 610, 171, 39);
		frame.getContentPane().add(passwordLabel);
		
		JLabel phoneLabel = new JLabel("Phone");
		phoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
		phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		phoneLabel.setForeground(SystemColor.text);
		phoneLabel.setBounds(260, 478, 171, 39);
		frame.getContentPane().add(phoneLabel);
		
		JLabel lastNameLabel = new JLabel("Last name");
		lastNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lastNameLabel.setForeground(SystemColor.text);
		lastNameLabel.setBounds(330, 238, 171, 39);
		frame.getContentPane().add(lastNameLabel);
		
		lastNameTextbox = new JTextField();
		lastNameTextbox.setColumns(10);
		lastNameTextbox.setBounds(330, 195, 171, 32);
		frame.getContentPane().add(lastNameTextbox);
		
		txtA = new JTextField();
		txtA.setColumns(10);
		txtA.setBounds(278, 195, 30, 32);
		frame.getContentPane().add(txtA);
		
		JLabel middleInitialLabel = new JLabel("MI");
		middleInitialLabel.setHorizontalAlignment(SwingConstants.CENTER);
		middleInitialLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		middleInitialLabel.setForeground(SystemColor.text);
		middleInitialLabel.setBounds(270, 238, 30, 39);
		frame.getContentPane().add(middleInitialLabel);
		
		emailTextbox = new JTextField();
		emailTextbox.setColumns(10);
		emailTextbox.setBounds(79, 429, 171, 32);
		frame.getContentPane().add(emailTextbox);
		
		streetAddressTexBox = new JTextField();
		streetAddressTexBox.setColumns(10);
		streetAddressTexBox.setBounds(79, 310, 171, 32);
		frame.getContentPane().add(streetAddressTexBox);
		
		JLabel streetAddressLabel = new JLabel("Street Address");
<<<<<<< HEAD
		streetAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
=======
		streetAddressLabel.setHorizontalAlignment(SwingConstants.CENTER);
		streetAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
>>>>>>> branch 'GUI' of https://github.com/SindhuraB/Anti-Theft-Project.git
		streetAddressLabel.setForeground(SystemColor.text);
		streetAddressLabel.setBounds(79, 353, 171, 39);
		frame.getContentPane().add(streetAddressLabel);
		
		JLabel cityLabel = new JLabel("City");
		cityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cityLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cityLabel.setForeground(SystemColor.text);
		cityLabel.setBounds(270, 353, 161, 39);
		frame.getContentPane().add(cityLabel);
		
		cityTextbox = new JTextField();
		cityTextbox.setColumns(10);
		cityTextbox.setBounds(282, 310, 171, 32);
		frame.getContentPane().add(cityTextbox);
		
		JLabel stateLabel = new JLabel("State");
		stateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		stateLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		stateLabel.setForeground(SystemColor.text);
		stateLabel.setBounds(441, 353, 171, 39);
		frame.getContentPane().add(stateLabel);
		
		stateTextbox = new JTextField();
		stateTextbox.setColumns(10);
		stateTextbox.setBounds(490, 310, 171, 32);
		frame.getContentPane().add(stateTextbox);
		
		JLabel zipCodeLabel = new JLabel("Zip Code");
		zipCodeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		zipCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		zipCodeLabel.setForeground(SystemColor.text);
		zipCodeLabel.setBounds(712, 353, 171, 39);
		frame.getContentPane().add(zipCodeLabel);
		
		zipCodeTextbox = new JTextField();
		zipCodeTextbox.setColumns(10);
		zipCodeTextbox.setBounds(712, 310, 171, 32);
		frame.getContentPane().add(zipCodeTextbox);
		
		JLabel extentionLabel = new JLabel("Extension");
		extentionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		extentionLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		extentionLabel.setForeground(SystemColor.text);
		extentionLabel.setBounds(712, 472, 171, 39);
		frame.getContentPane().add(extentionLabel);
		
		extensionTextbox = new JTextField();
		extensionTextbox.setColumns(10);
		extensionTextbox.setBounds(712, 429, 171, 32);
		frame.getContentPane().add(extensionTextbox);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		usernameLabel.setForeground(SystemColor.text);
		usernameLabel.setBounds(712, 238, 171, 39);
		frame.getContentPane().add(usernameLabel);
		
		usernameTextBox = new JTextField();
		usernameTextBox.setColumns(10);
<<<<<<< HEAD
		usernameTextBox.setBounds(250, 321, 171, 32);
=======
		usernameTextBox.setBounds(593, 200, 171, 32);
>>>>>>> branch 'GUI' of https://github.com/SindhuraB/Anti-Theft-Project.git
		frame.getContentPane().add(usernameTextBox);
		
		JLabel confirmPasswordLabel = new JLabel("Re-type Password");
		confirmPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		confirmPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		confirmPasswordLabel.setForeground(SystemColor.text);
		confirmPasswordLabel.setBounds(622, 610, 171, 39);
		frame.getContentPane().add(confirmPasswordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(260, 563, 171, 32);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(622, 563, 171, 32);
		frame.getContentPane().add(passwordField_1);
		
		button = new JButton("Back");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBackground(Color.WHITE);
		button.setBounds(10, 681, 68, 19);
		frame.getContentPane().add(button);
	}
}
