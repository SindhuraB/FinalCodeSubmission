import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
		frame.setBounds(1001, 600, 913, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton loginButton = new JButton("Log In");
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usernameTextbox.getText() == "user") {
					JOptionPane.showMessageDialog(frame,"Log in successful");
				}
			}
		});
		loginButton.setBounds(600, 325, 116, 43);
		frame.getContentPane().add(loginButton);
		
		usernameTextbox = new JTextField();
		usernameTextbox.setFont(new Font("Tahoma", Font.PLAIN, 21));
		usernameTextbox.setBounds(450, 150, 189, 37);
		frame.getContentPane().add(usernameTextbox);
		usernameTextbox.setColumns(10);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setBackground(new Color(255, 255, 255));
		usernameLabel.setBounds(289, 150, 158, 37);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setBounds(289, 225, 158, 37);
		frame.getContentPane().add(passwordLabel);
		
		JButton backButton = new JButton("Back");
		backButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		backButton.setBounds(178, 325, 116, 43);
		frame.getContentPane().add(backButton);
		
		JLabel loginLabel = new JLabel("Log In");
		loginLabel.setFont(new Font("Impact", Font.PLAIN, 41));
		loginLabel.setForeground(SystemColor.text);
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setBounds(350, 0, 158, 56);
		frame.getContentPane().add(loginLabel);
		
		passwordTextbox = new JPasswordField();
		passwordTextbox.setFont(new Font("Tahoma", Font.PLAIN, 21));
		passwordTextbox.setBounds(450, 225, 189, 32);
		frame.getContentPane().add(passwordTextbox);
	}
}
