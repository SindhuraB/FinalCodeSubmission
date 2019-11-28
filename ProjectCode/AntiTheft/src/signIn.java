import java.awt.EventQueue;
import javax.swing.*;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.*;

public class signIn {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void openSignInPage() {
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
	//Connection connection=null; 
	
	/**
	 * Create the application.
	 */
	
	public signIn() {
		initialize();
		//connection=192.168.1.24(); 
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(1001, 600, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea passwordText = new JTextArea();
		passwordText.setForeground(Color.BLACK);
		passwordText.setBackground(Color.WHITE);
		passwordText.setBounds(548, 422, 194, 32);
		frame.getContentPane().add(passwordText);
		
		JTextArea usernameText = new JTextArea();
		usernameText.setBounds(210, 428, 194, 32);
		frame.getContentPane().add(usernameText);
		
		JLabel usernameLabel = new JLabel("Username");		
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setBackground(new Color(255, 255, 255));
		usernameLabel.setBounds(210, 465, 194, 37);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");		
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setBounds(548, 465, 194, 37);
		frame.getContentPane().add(passwordLabel);	
		
		JLabel loginLabel = new JLabel("Log In");
		loginLabel.setFont(new Font("Impact", Font.PLAIN, 50));
		loginLabel.setForeground(SystemColor.text);
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setBounds(380, 257, 189, 56);
		frame.getContentPane().add(loginLabel);
		
		JButton backButton = new JButton("Back");		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backButton.setBackground(Color.WHITE);
		backButton.setForeground(new Color(0, 0, 0));
		backButton.setFont(new Font("Tahoma", Font.BOLD, 15));		
		backButton.setBounds(10, 678, 100, 32);
		frame.getContentPane().add(backButton);
		
		JButton loginButton = new JButton("log in");	
		loginButton.setBackground(Color.WHITE);
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		loginButton.setBounds(884, 678, 100, 32);
		frame.getContentPane().add(loginButton);
		
		
		//Checks info from user input against the database value
		
		/*loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
			
				try {
					String query="select * from getUserinfo where username=? and password=?"; //checks if value in database is the same
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(0,passwordText.getText());
					pst.setString(1,usernameText.getText());
					
					ResultSet rs=pst.executeQuery();
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				{
		*/
			
	}	
}
		
			
	
		
		
	
		
	

