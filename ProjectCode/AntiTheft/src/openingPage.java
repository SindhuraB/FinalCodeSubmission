import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class openingPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
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
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(1001, 600, 913, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//Creates the SignIn button
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBackground(SystemColor.window);
		btnSignIn.setFont(new Font("Calibri", Font.PLAIN, 28));
		btnSignIn.setBounds(385, 150, 139, 48);
		frame.getContentPane().add(btnSignIn);
		
		//If Sign In button is clicked then take the user to sign in page
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				signIn signInScreen = new signIn();
				signInScreen.openSignInPage();
			}
		});
		
		//Creates the SignUp button
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBackground(SystemColor.window);
		btnSignUp.setFont(new Font("Calibri", Font.PLAIN, 28));
		btnSignUp.setBounds(385, 221, 139, 48);
		frame.getContentPane().add(btnSignUp);
		
		//If Sign Up button is clicked then take the user to sign in page
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				signUpPage signUpScreen = new signUpPage();
				signUpScreen.openSignUpPage();
			}
		});
		
		//Creates the Welcome Sign
		JLabel welcomeLabel = new JLabel("Welcome");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Impact", Font.PLAIN, 35));
		welcomeLabel.setForeground(SystemColor.text);
		welcomeLabel.setBounds(385, 21, 139, 48);
		frame.getContentPane().add(welcomeLabel);
	}
}
