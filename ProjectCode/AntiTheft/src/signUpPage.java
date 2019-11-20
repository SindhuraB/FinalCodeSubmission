import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class signUpPage {

	private JFrame frame;
	private JTextField getNameTextbox;
	private JTextField txtEmailAddress;
	private JTextField txtAtLeast;
	private JTextField txtXxxxxxxxx;
	private JTextField txtLastName;

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
		
		getNameTextbox = new JTextField();
		getNameTextbox.setText("Noman");
		getNameTextbox.setBounds(128, 24, 186, 26);
		frame.getContentPane().add(getNameTextbox);
		getNameTextbox.setColumns(10);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setText("noman@gmail.com");
		txtEmailAddress.setBounds(128, 65, 186, 26);
		frame.getContentPane().add(txtEmailAddress);
		txtEmailAddress.setColumns(10);
		
		txtAtLeast = new JTextField();
		txtAtLeast.setText("At least 8 characters");
		txtAtLeast.setBounds(128, 104, 186, 20);
		frame.getContentPane().add(txtAtLeast);
		txtAtLeast.setColumns(10);
		
		txtXxxxxxxxx = new JTextField();
		txtXxxxxxxxx.setText("XXX-XXX-XXX");
		txtXxxxxxxxx.setBounds(214, 147, 158, 20);
		frame.getContentPane().add(txtXxxxxxxxx);
		txtXxxxxxxxx.setColumns(10);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(162, 278, 126, 23);
		frame.getContentPane().add(btnSignUp);
		
		JLabel lblName = new JLabel("First name");
		lblName.setBounds(33, 21, 92, 26);
		frame.getContentPane().add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(33, 68, 92, 27);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(33, 101, 92, 26);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(43, 144, 92, 26);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(301, 21, 92, 26);
		frame.getContentPane().add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setText("Syed");
		txtLastName.setColumns(10);
		txtLastName.setBounds(389, 24, 168, 20);
		frame.getContentPane().add(txtLastName);
		
		JLabel lblMi = new JLabel("MI");
		lblMi.setBounds(578, 21, 92, 26);
		frame.getContentPane().add(lblMi);
	}
}
