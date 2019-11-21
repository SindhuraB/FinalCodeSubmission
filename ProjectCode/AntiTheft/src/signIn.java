import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class signIn {

	private JFrame frame;
	private JTextField usernameTextbox;
	private JPasswordField passwordTextbox;

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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(1001, 600, 546, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton loginButton = new JButton("Log In");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Log in button clicked");
			}
		});
		loginButton.setBounds(347, 251, 92, 23);
		frame.getContentPane().add(loginButton);
		
		usernameTextbox = new JTextField();
		usernameTextbox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		usernameTextbox.setBounds(209, 98, 179, 23);
		frame.getContentPane().add(usernameTextbox);
		usernameTextbox.setColumns(10);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setBackground(new Color(255, 255, 255));
		usernameLabel.setBounds(125, 98, 122, 26);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setBounds(125, 163, 122, 26);
		frame.getContentPane().add(passwordLabel);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		backButton.setBounds(93, 251, 92, 23);
		frame.getContentPane().add(backButton);
		
		JLabel loginLabel = new JLabel("Log In");
		loginLabel.setFont(new Font("Impact", Font.PLAIN, 28));
		loginLabel.setForeground(SystemColor.text);
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setBounds(184, 21, 139, 26);
		frame.getContentPane().add(loginLabel);
		
		passwordTextbox = new JPasswordField();
		passwordTextbox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordTextbox.setBounds(209, 164, 179, 23);
		frame.getContentPane().add(passwordTextbox);
	}
}
