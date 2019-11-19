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

public class signIn {

	private JFrame frame;
	private JTextField usernameTextbox;
	private JTextField passwordTextbox;

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
			}
		});
		loginButton.setBounds(201, 224, 129, 23);
		frame.getContentPane().add(loginButton);
		
		usernameTextbox = new JTextField();
		usernameTextbox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		usernameTextbox.setText("Enter Username ");
		usernameTextbox.setBounds(233, 76, 143, 23);
		frame.getContentPane().add(usernameTextbox);
		usernameTextbox.setColumns(10);
		
		passwordTextbox = new JTextField();
		passwordTextbox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordTextbox.setText("Enter Password");
		passwordTextbox.setBounds(233, 128, 143, 23);
		frame.getContentPane().add(passwordTextbox);
		passwordTextbox.setColumns(10);
		
		JLabel getUserLabel = new JLabel("Username");
		getUserLabel.setForeground(new Color(255, 255, 255));
		getUserLabel.setBackground(new Color(255, 255, 255));
		getUserLabel.setBounds(130, 75, 92, 26);
		frame.getContentPane().add(getUserLabel);
		
		JLabel getPasswordLabel = new JLabel("Password");
		getPasswordLabel.setForeground(new Color(255, 255, 255));
		getPasswordLabel.setBounds(130, 127, 92, 26);
		frame.getContentPane().add(getPasswordLabel);
	}
}
