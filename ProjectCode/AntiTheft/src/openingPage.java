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
		frame.setBounds(1001, 600, 546, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBackground(SystemColor.window);
		btnSignIn.setFont(new Font("Calibri", Font.PLAIN, 23));

		//If Sign In button is clicked then take the user to sign in page
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				signIn signInScreen = new signIn();
				signInScreen.openSignInPage();
			}
		});
		btnSignIn.setBounds(184, 105, 139, 30);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				signUpPage signUpScreen = new signUpPage();
				signUpScreen.openSignUpPage();
			}
		});
		btnSignUp.setBackground(SystemColor.window);
		btnSignUp.setFont(new Font("Calibri", Font.PLAIN, 23));
		btnSignUp.setBounds(184, 155, 139, 30);
		frame.getContentPane().add(btnSignUp);
		
		JLabel welcomeLabel = new JLabel("Welcome");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Impact", Font.PLAIN, 28));
		welcomeLabel.setForeground(SystemColor.text);
		welcomeLabel.setBounds(184, 21, 139, 26);
		frame.getContentPane().add(welcomeLabel);
	}
}
