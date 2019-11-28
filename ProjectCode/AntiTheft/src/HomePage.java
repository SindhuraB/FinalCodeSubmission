

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*Description: The home page of the GUI. input or look up products
* Class: Fall - SE 3354.502 
* Assignment: Group Project
* Title: Anti-Theft Project
* Date: 11/28/2019
*@authors Gentry Jenkins / Sindhura Boppudi / Norman Syed
*@version 2.2.0
*/ 

	public class HomePage {

		private JFrame frame;
		private JTextField textField;
		private JTextField textField_1;

		/**
		 * Launches the application.
		 * @param none
		 * @return void
		 * @throws not implemented
		 */
		
		public void setVisible(boolean b) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						HomePage window = new HomePage();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					
					}
				}
			});
		}
		
		/**
		 *  Create the application.
	     * @param none
		 * @return void
		 * @throws not implemented
		 */
	
		public HomePage() {
			initialize();
		}
		
		/**
		 * Initialize the contents of the frame.
		 * @param none
		 * @return void
		 * @throws not implemented
		 */
		
		private void initialize() {
			frame = new JFrame();
<<<<<<< HEAD
			frame.getContentPane().setBackground(new Color(0, 0, 51));
=======
			frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
			frame.getContentPane().setBackground(new Color(47, 79, 79));
>>>>>>> refs/remotes/origin/GUI
			frame.getContentPane().setLayout(null);
			frame.setBounds(1000, 600, 1000, 750);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//Creates a list for Registered item
			JList list = new JList();
			list.setBounds(280, 145, 447, 171);
			frame.getContentPane().add(list);
			
			//Scroll bar for Registered item list
			JScrollBar scrollBar = new JScrollBar();
			scrollBar.setBackground(Color.LIGHT_GRAY);
			scrollBar.setBounds(726, 145, 17, 171);
			frame.getContentPane().add(scrollBar);
			
			//Item name label for Registered products
			JLabel lblNewLabel = new JLabel("Item Name");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(280, 108, 130, 26);
			frame.getContentPane().add(lblNewLabel);
			
			//Item description label for Registered products
			JLabel lblItemDescription = new JLabel("Item Description");
			lblItemDescription.setHorizontalAlignment(SwingConstants.RIGHT);
			lblItemDescription.setForeground(Color.WHITE);
			lblItemDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblItemDescription.setBounds(569, 108, 158, 26);
			frame.getContentPane().add(lblItemDescription);
			
			//Item name label for Registered products
			JLabel lblProductList = new JLabel("Product List");
			lblProductList.setHorizontalAlignment(SwingConstants.LEFT);
			lblProductList.setForeground(Color.WHITE);
			lblProductList.setFont(new Font("Impact", Font.PLAIN, 30));
			lblProductList.setBounds(432, 37, 168, 43);
			frame.getContentPane().add(lblProductList);
			
			//Register new product label
			JLabel label = new JLabel("Register New Products");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Impact", Font.PLAIN, 30));
			label.setBounds(359, 378, 320, 43);
			frame.getContentPane().add(label);
			
			//Creates a place for user input item description 
			JList list_1 = new JList();
			list_1.setBounds(453, 485, 274, 138);
			frame.getContentPane().add(list_1);
			
			//Manufacturer name label
			JLabel label_1 = new JLabel("Manufacturer");
			label_1.setForeground(Color.WHITE);
			label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_1.setBackground(Color.WHITE);
			label_1.setBounds(280, 569, 130, 17);
			frame.getContentPane().add(label_1);
			
			//Item name label for UN-registered products 
			JLabel label_2 = new JLabel("Item ");
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_2.setBackground(Color.WHITE);
			label_2.setBounds(280, 463, 102, 17);
			frame.getContentPane().add(label_2);
			
			//User input field for manufacture 
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(280, 485, 140, 26);
			frame.getContentPane().add(textField);
			
			//User input field for UN-registered products 
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(280, 597, 140, 26);
			frame.getContentPane().add(textField_1);
			
			//Scroll bar for the UN-registered products
			JScrollBar scrollBar_1 = new JScrollBar();
			scrollBar_1.setForeground(new Color(153, 255, 102));
			scrollBar_1.setBackground(Color.LIGHT_GRAY);
			scrollBar_1.setBounds(726, 485, 17, 138);
			frame.getContentPane().add(scrollBar_1);
			
			//Item description label for UN-registered products
			JLabel lblItemDescription_1 = new JLabel("Item Description");
			lblItemDescription_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblItemDescription_1.setForeground(Color.WHITE);
			lblItemDescription_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblItemDescription_1.setBackground(Color.WHITE);
			lblItemDescription_1.setBounds(509, 457, 158, 17);
			frame.getContentPane().add(lblItemDescription_1);
			
			//Creates the Sign out button
			JButton btnSignOut = new JButton("Sign out");
			btnSignOut.setForeground(Color.BLACK);
			btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnSignOut.setBackground(Color.WHITE);
			btnSignOut.setBounds(10, 668, 100, 32);
			frame.getContentPane().add(btnSignOut);
			
			//If Sign out button is clicked then take the user to opening page
			btnSignOut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					openingPage openingScreen=new openingPage();
					openingScreen.setVisible(true);	
				}
			});
<<<<<<< HEAD
			btnSignOut.setForeground(Color.BLACK);
			btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnSignOut.setBackground(Color.WHITE);
			btnSignOut.setBounds(477, 644, 100, 32);
			frame.getContentPane().add(btnSignOut);
			frame.setBounds(100, 100, 1056, 776);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
=======
			
			
>>>>>>> refs/remotes/origin/GUI
		}

	

			
		}
	


