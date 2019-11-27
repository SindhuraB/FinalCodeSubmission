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
	//Connection connection=null; //Needs to be replaced by the connection class name
	
	/**
	 * Create the application.
	 */
	
	public signIn() {
		initialize();
		//connection=sqliteConnection.dbConnector(); //needs to be replaced by the connection class name
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 19));
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(1001, 600, 913, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea passwordText = new JTextArea();
		passwordText.setBounds(360, 287, 194, 32);
		frame.getContentPane().add(passwordText);
		
		JTextArea usernameText = new JTextArea();
		usernameText.setBounds(360, 196, 194, 32);
		frame.getContentPane().add(usernameText);
		
		JLabel usernameLabel = new JLabel("Username");		
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setBackground(new Color(255, 255, 255));
		usernameLabel.setBounds(360, 131, 171, 37);
		frame.getContentPane().add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");		
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setBounds(360, 239, 180, 37);
		frame.getContentPane().add(passwordLabel);	
		
		JLabel loginLabel = new JLabel("Log In");
		loginLabel.setFont(new Font("Impact", Font.PLAIN, 41));
		loginLabel.setForeground(SystemColor.text);
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setBounds(342, 11, 189, 56);
		frame.getContentPane().add(loginLabel);
		
		JButton backButton = new JButton("Back");		
		backButton.setFont(new Font("Tahoma", Font.BOLD, 20));		
		backButton.setBounds(408, 438, 100, 32);
		frame.getContentPane().add(backButton);
		
		JButton loginButton = new JButton("log in");		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="select * from CHRIS' DATABASE where username=? and password=?"; //checks if value in database is the same, replace CHRIS' DATABASE with name of database
					PreparedStatement pst=connection.prepareStatement(query);//Conection needs to be replaced with name of connection method
					pst.setString(0,passwordText.getText());
					pst.setString(1,usernameText.getText());
					
					ResultSet rs=pst.executeQuery();
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}}
		});
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		loginButton.setBounds(408, 368, 100, 32);
		frame.getContentPane().add(loginButton);
		
	
		
		
	
		
	}
}
