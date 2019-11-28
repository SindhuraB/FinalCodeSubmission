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
/**
*Description: Opening page, decide if user is a new or registered user
* Class: Fall - SE 3354.502 
* Assignment: Group Project
* Title: Anti-Theft Project
* Date: 11/28/2019
*@authors Gentry Jenkins / Sindhura Boppudi / Norman Syed
*@version 2.2.0
*/ 
public class openingPage {

	private JFrame frame;

	/**
	 * Launches the application.
	 * @param args as String[]
	 * @return void
	 * @throws not implemented
	 */
	public void setVisible(boolean b) {
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
	 * @param args as String[]
	 * @return void
	 * @throws not implemented
	 */
	
	public openingPage() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 * @param args as String[]
	 * @return void
	 * @throws not implemented
	 */
	void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(1001, 600, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		//Creates the SignIn button
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBackground(SystemColor.window);
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSignIn.setBounds(532, 363, 139, 48);
		frame.getContentPane().add(btnSignIn);
		
		//If Sign In button is clicked then take the user to sign in page
		btnSignIn.addMouseListener(new MouseAdapter() {		
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				signIn signInScreen = new signIn();
				signInScreen.setVisible(true);
			}
		});
		
		//Creates the SignUp button
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setBackground(SystemColor.window);
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSignUp.setBounds(326, 363, 139, 48);
		frame.getContentPane().add(btnSignUp);
		
		//If Sign Up button is clicked then take the user to sign in page
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				signUpPage signUpScreen = new signUpPage();
				signUpScreen.setVisible(true);
			}
		});
		
		//Creates the Welcome Sign
		JLabel welcomeLabel = new JLabel("Welcome ");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setFont(new Font("Impact", Font.PLAIN, 60));
		welcomeLabel.setForeground(SystemColor.text);
		welcomeLabel.setBounds(350, 188, 321, 89);
		frame.getContentPane().add(welcomeLabel);
	}
}
