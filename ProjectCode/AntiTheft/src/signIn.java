import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

// sign in class
public class signIn {

	// private variables
	private JFrame frame;
	private JTextField txtEnterUsernameHere;
	private JTextField txtEnterPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	// main method
		EventQueue.invokeLater(new Runnable() {
			public void run() {	// run sign in page
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
	public signIn() {	// default constructor
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// create frame
		frame = new JFrame();
		frame.setBounds(100, 100, 404, 287);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// log in button
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(152, 172, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		// enter username field
		txtEnterUsernameHere = new JTextField();
		txtEnterUsernameHere.setText("Enter Username Here");
		txtEnterUsernameHere.setBounds(175, 76, 143, 23);
		frame.getContentPane().add(txtEnterUsernameHere);
		txtEnterUsernameHere.setColumns(10);
		
		// enter password field
		txtEnterPassword = new JTextField();
		txtEnterPassword.setText("Enter Password");
		txtEnterPassword.setBounds(175, 107, 143, 23);
		frame.getContentPane().add(txtEnterPassword);
		txtEnterPassword.setColumns(10);
		
		// username
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setText("Username: ");
		txtpnUsername.setBounds(69, 76, 81, 23);
		frame.getContentPane().add(txtpnUsername);
		
		// password
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(69, 110, 81, 20);
		frame.getContentPane().add(txtpnPassword);
	}
}
