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
/**
*Description: The sign in GUI page for registered users 
* Class: Fall - SE 3354.502 
* Assignment: Group Project
* Title: Anti-Theft Project
* Date: 11/28/2019
*@authors Gentry Jenkins / Sindhura Boppudi / Noman Syed
*@version 2.2.0
*/ 
public class signIn {

	private JFrame frame;
	private JPasswordField passwordField;

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
					signIn window = new signIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Launches the application.
	 * @param args as String[]
	 * @return void
	 * @throws not implemented
	 */
	/**
	 * Create the application.
	 */
	
	public signIn() {
		initialize();
		
		
	}
	/**
	 * Launches the application.
	 * @param args as String[]
	 * @return void
	 * @throws not implemented
	 */
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(1001, 600, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea usernameText = new JTextArea();
		usernameText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		usernameText.setBounds(210, 373, 194, 32);
		frame.getContentPane().add(usernameText);
		
		JLabel usernameLabel = new JLabel("Username");		
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setBackground(new Color(255, 255, 255));
		usernameLabel.setBounds(210, 325, 194, 37);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");		
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setBounds(548, 325, 194, 37);
		frame.getContentPane().add(passwordLabel);	
		
		JLabel loginLabel = new JLabel("Log In");
		loginLabel.setFont(new Font("Impact", Font.PLAIN, 50));
		loginLabel.setForeground(SystemColor.text);
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setBounds(381, 205, 152, 62);
		frame.getContentPane().add(loginLabel);
		
		JButton backButton = new JButton("Back");		
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				openingPage openingScreen=new openingPage();
				openingScreen.setVisible(true);	
			}
		});
		
					
		
		backButton.setBackground(Color.WHITE);
		backButton.setForeground(new Color(0, 0, 0));
		backButton.setFont(new Font("Tahoma", Font.BOLD, 15));		
		backButton.setBounds(430, 538, 81, 32);
		frame.getContentPane().add(backButton);
		
	
			
					
					
		JButton loginButton = new JButton("Log In");	
		loginButton.setBackground(Color.WHITE);
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		loginButton.setBounds(430, 483, 81, 32);
		frame.getContentPane().add(loginButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(548, 373, 194, 32);
		frame.getContentPane().add(passwordField);
		
		
		//Checks info from user input against the database value
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
			
				frame.dispose();
				HomePage homeScreen=new HomePage();
				homeScreen.setVisible(true);
			
				
			/*	try {
					String query="select * from getUserinfo where username=? and password=?"; //checks if value in database is the same
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(0,passwordText.getText());
					pst.setString(1,usernameText.getText());
					
					ResultSet rs=pst.executeQuery();
					int count=0;
					while(rs.next()){
						count=count+1;
						
					}
					if(count==1)
					{
						JOptionPane.showMessageDialog(null, "Username and password is correct");
						frame.dispose();
						HomePage homeScreen=new HomePage();
						homeScreen.setVisible(true);
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and password ");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Username and password is not correct. try again");
					}
					rs.close();
					pst.close();
					
				} catch (Exception e) 
				{
					JOptionPane.showMessageDialog(null, e);
				
				}
			}}
	*/
			}
	});
	}	
}

		
			
	
		
		
	
		
	

