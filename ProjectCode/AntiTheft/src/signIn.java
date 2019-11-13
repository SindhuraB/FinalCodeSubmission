import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;

public class signIn {

	private JFrame frame;
	private JTextField txtEnterUsernameHere;
	private JTextField txtEnterPassword;

	/**
	 * Launch the application.
	 */
	public static void openSignInPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signIn window = new signIn();
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
	public signIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 100, 0));
		frame.setBounds(1001, 600, 546, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(201, 224, 129, 23);
		frame.getContentPane().add(btnLogIn);
		
		txtEnterUsernameHere = new JTextField();
		txtEnterUsernameHere.setText("Enter Username Here");
		txtEnterUsernameHere.setBounds(233, 76, 143, 23);
		frame.getContentPane().add(txtEnterUsernameHere);
		txtEnterUsernameHere.setColumns(10);
		
		txtEnterPassword = new JTextField();
		txtEnterPassword.setText("Enter Password");
		txtEnterPassword.setBounds(233, 128, 143, 23);
		frame.getContentPane().add(txtEnterPassword);
		txtEnterPassword.setColumns(10);
		
		JLabel getUserLabel = new JLabel("Username");
		getUserLabel.setBounds(130, 75, 92, 26);
		frame.getContentPane().add(getUserLabel);
		
		JLabel getPasswordLabel = new JLabel("Password");
		getPasswordLabel.setBounds(130, 127, 92, 26);
		frame.getContentPane().add(getPasswordLabel);
	}
}
