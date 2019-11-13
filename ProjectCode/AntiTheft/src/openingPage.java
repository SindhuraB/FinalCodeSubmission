import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

// opening page class
public class openingPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	// main method
		EventQueue.invokeLater(new Runnable() {
			public void run() {	// run opening page
				try {
					openingPage window = new openingPage();
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
	public openingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// creates window frame
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Sign in button
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(163, 92, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		// Sign up button
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(163, 128, 89, 23);
		frame.getContentPane().add(btnSignUp);
	}

}
