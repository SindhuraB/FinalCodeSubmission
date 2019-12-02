import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*Description: The Sign up GUI page for new users 
* Class: Fall - SE 3354.502 
* Assignment: Group Project
* Title: Anti-Theft Project
* Date: 11/28/2019
*@authors Gentry Jenkins / Sindhura Boppudi / Norman Syed /Junior
*@version 2.2.0
*/ 
public class signUpPage extends User {

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
	private JTextField passwordTextbox1;
	private JButton button;
	private JButton btnSignUp;
	private JLabel lblSighnUp;

	/**
	 * Launches the application.
	 * @param args as String[]
	 * @return void
	 * @throws not implemented
	 */
	public void setVisible(boolean b){
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
	 * Launches the application.
	 * @param args as String[]
	 * @return void
	 * @throws not implemented
	 */
	/**
	 * Create the application.
	 */
	public signUpPage() {
		initialize();
	}
	/**
	 * Launches the application.
	 * @param args as String[]
	 * @return void
	 * @throws not implemented
	 */
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();

		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(1001, 600, 1000, 750);

		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(1000, 600, 1000, 750);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		firstNameTextbox = new JTextField();
		firstNameTextbox.setBounds(196, 205, 171, 32);
		firstNameTextbox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		firstNameTextbox.setColumns(10);
		
		phoneTextbox = new JTextField();
		phoneTextbox.setBounds(396, 399, 171, 32);
		phoneTextbox.setColumns(10);
		
		JLabel firstNameLabel = new JLabel("First name");
		firstNameLabel.setBounds(196, 238, 171, 23);
		firstNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		firstNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		firstNameLabel.setForeground(SystemColor.text);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(196, 430, 171, 23);

		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		emailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		emailLabel.setForeground(SystemColor.text);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(592, 430, 171, 23);
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordLabel.setForeground(SystemColor.text);
		
		JLabel phoneLabel = new JLabel("Phone");
		phoneLabel.setBounds(396, 430, 171, 23);
		phoneLabel.setHorizontalAlignment(SwingConstants.LEFT);
		phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		phoneLabel.setForeground(SystemColor.text);
		
		JLabel lastNameLabel = new JLabel("Last name");
		lastNameLabel.setBounds(452, 238, 171, 23);
		lastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lastNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lastNameLabel.setForeground(SystemColor.text);
		
		lastNameTextbox = new JTextField();
		lastNameTextbox.setBounds(452, 205, 171, 32);
		lastNameTextbox.setColumns(10);
		
		txtA = new JTextField();
		txtA.setBounds(394, 205, 30, 32);
		txtA.setColumns(10);
		
		JLabel middleInitialLabel = new JLabel("Mi");
		middleInitialLabel.setBounds(394, 238, 30, 23);
		middleInitialLabel.setHorizontalAlignment(SwingConstants.LEFT);
		middleInitialLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		middleInitialLabel.setForeground(SystemColor.text);
		
		emailTextbox = new JTextField();
		emailTextbox.setBounds(196, 399, 171, 32);
		emailTextbox.setColumns(10);
		
		streetAddressTexBox = new JTextField();
		streetAddressTexBox.setBounds(196, 303, 171, 32);
		streetAddressTexBox.setColumns(10);
		
		JLabel streetAddressLabel = new JLabel("Street Address");
		streetAddressLabel.setBounds(196, 334, 171, 23);

		streetAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		streetAddressLabel.setHorizontalAlignment(SwingConstants.LEFT);
		streetAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

		streetAddressLabel.setForeground(SystemColor.text);
		
		JLabel cityLabel = new JLabel("City");
		cityLabel.setBounds(396, 334, 161, 23);
		cityLabel.setHorizontalAlignment(SwingConstants.LEFT);
		cityLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		cityLabel.setForeground(SystemColor.text);
		
		cityTextbox = new JTextField();
		cityTextbox.setBounds(396, 303, 171, 32);
		cityTextbox.setColumns(10);
		
		JLabel stateLabel = new JLabel("State");
		stateLabel.setBounds(592, 334, 85, 23);
		stateLabel.setHorizontalAlignment(SwingConstants.LEFT);
		stateLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		stateLabel.setForeground(SystemColor.text);
		
		stateTextbox = new JTextField();
		stateTextbox.setBounds(592, 303, 85, 32);
		stateTextbox.setColumns(10);
		
		JLabel zipCodeLabel = new JLabel("Zip Code");
		zipCodeLabel.setBounds(699, 334, 85, 23);
		zipCodeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		zipCodeLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		zipCodeLabel.setForeground(SystemColor.text);
		
		zipCodeTextbox = new JTextField();
		zipCodeTextbox.setBounds(699, 303, 85, 32);
		zipCodeTextbox.setColumns(10);
		
		passwordTextbox1 = new JTextField();
		passwordTextbox1.setBounds(592, 399, 171, 32);
		
		button = new JButton("Back");
		button.setBounds(383, 587, 100, 32);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				openingPage openingScreen=new openingPage();
				openingScreen.setVisible(true);	
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBackground(Color.WHITE);
		
		btnSignUp = new JButton("Sign up");
		btnSignUp.setBounds(513, 587, 100, 32);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//getting info out of boxes
				String first = firstNameTextbox.getText();
				String mid = txtA.getText();
				String last = lastNameTextbox.getText();
				String phone = phoneTextbox.getText();
				String email = emailTextbox.getText();
				String street = streetAddressTexBox.getText();
				String city = cityTextbox.getText();
				String state = stateTextbox.getText();
				String zip = zipCodeTextbox.getText();
				String pass = passwordTextbox1.getText();
				

				
			
			
			
				//sending information to test create new account
				String check = QueryMethods.createUser(email, pass, first, mid, last, street, city, state, zip, phone, phone);
				if (check == null) {
					JOptionPane.showMessageDialog(null,"Fill in all blanks");	
				
				}
				else
			{	
					frame.dispose();
					signIn homeScreen=new signIn();
					homeScreen.setVisible(true);
					JOptionPane.showMessageDialog(null, "Sign in to your new account");
			}
			
				
				
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSignUp.setBackground(Color.WHITE);
		
		lblSighnUp = new JLabel("Sign Up");
		lblSighnUp.setBounds(394, 45, 189, 56);
		lblSighnUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSighnUp.setForeground(Color.WHITE);
		lblSighnUp.setFont(new Font("Impact", Font.PLAIN, 50));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(firstNameTextbox);
		frame.getContentPane().add(phoneTextbox);
		frame.getContentPane().add(firstNameLabel);
		frame.getContentPane().add(emailLabel);
		frame.getContentPane().add(passwordLabel);
		frame.getContentPane().add(phoneLabel);
		frame.getContentPane().add(lastNameLabel);
		frame.getContentPane().add(lastNameTextbox);
		frame.getContentPane().add(txtA);
		frame.getContentPane().add(middleInitialLabel);
		frame.getContentPane().add(emailTextbox);
		frame.getContentPane().add(streetAddressTexBox);
		frame.getContentPane().add(streetAddressLabel);
		frame.getContentPane().add(cityLabel);
		frame.getContentPane().add(cityTextbox);
		frame.getContentPane().add(stateLabel);
		frame.getContentPane().add(stateTextbox);
		frame.getContentPane().add(zipCodeLabel);
		frame.getContentPane().add(zipCodeTextbox);
		frame.getContentPane().add(passwordTextbox1);
		frame.getContentPane().add(button);
		frame.getContentPane().add(btnSignUp);
		frame.getContentPane().add(lblSighnUp);
	}
}
