import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class signUpPage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		frame.setBounds(1001, 600, 419, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setText("Name: ");
		txtpnName.setBounds(82, 54, 100, 20);
		frame.getContentPane().add(txtpnName);
		
		JTextPane txtpnEmailId = new JTextPane();
		txtpnEmailId.setText("Email ID: ");
		txtpnEmailId.setBounds(82, 85, 100, 20);
		frame.getContentPane().add(txtpnEmailId);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password: ");
		txtpnPassword.setBounds(82, 116, 100, 20);
		frame.getContentPane().add(txtpnPassword);
		
		JTextPane txtpnPhoneNumber = new JTextPane();
		txtpnPhoneNumber.setText("Phone Number:");
		txtpnPhoneNumber.setBounds(82, 147, 100, 20);
		frame.getContentPane().add(txtpnPhoneNumber);
		
		textField = new JTextField();
		textField.setBounds(214, 53, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(214, 85, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(214, 116, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(214, 147, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(157, 203, 89, 23);
		frame.getContentPane().add(btnSignUp);
	}
}
