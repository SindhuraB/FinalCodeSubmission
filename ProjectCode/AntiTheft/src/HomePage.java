

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

	public class HomePage {

		private JFrame frame;
		private JTextField textField;
		private JTextField textField_1;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
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
		 * Create the application.
		 */
		public HomePage() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(47, 79, 79));
			frame.getContentPane().setLayout(null);
			
			JList list = new JList();
			list.setBounds(280, 145, 447, 171);
			frame.getContentPane().add(list);
			
			JScrollBar scrollBar = new JScrollBar();
			scrollBar.setBounds(726, 145, 17, 171);
			frame.getContentPane().add(scrollBar);
			
			JLabel lblNewLabel = new JLabel("Item Name");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(280, 108, 130, 26);
			frame.getContentPane().add(lblNewLabel);
			
			JLabel lblItemDescription = new JLabel("Item Description");
			lblItemDescription.setHorizontalAlignment(SwingConstants.RIGHT);
			lblItemDescription.setForeground(Color.WHITE);
			lblItemDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblItemDescription.setBounds(597, 108, 130, 26);
			frame.getContentPane().add(lblItemDescription);
			
			JLabel lblProductList = new JLabel("Product List");
			lblProductList.setHorizontalAlignment(SwingConstants.LEFT);
			lblProductList.setForeground(Color.WHITE);
			lblProductList.setFont(new Font("Impact", Font.PLAIN, 30));
			lblProductList.setBounds(412, 11, 168, 43);
			frame.getContentPane().add(lblProductList);
			
			JLabel label = new JLabel("Register New Products");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Impact", Font.PLAIN, 30));
			label.setBounds(359, 378, 320, 43);
			frame.getContentPane().add(label);
			
			JList list_1 = new JList();
			list_1.setBounds(453, 485, 274, 138);
			frame.getContentPane().add(list_1);
			
			JLabel label_1 = new JLabel("Manufacturer");
			label_1.setForeground(Color.WHITE);
			label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_1.setBackground(Color.WHITE);
			label_1.setBounds(280, 569, 102, 17);
			frame.getContentPane().add(label_1);
			
			JLabel label_2 = new JLabel("Item ");
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_2.setBackground(Color.WHITE);
			label_2.setBounds(280, 463, 102, 17);
			frame.getContentPane().add(label_2);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(280, 485, 140, 26);
			frame.getContentPane().add(textField);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(280, 597, 140, 26);
			frame.getContentPane().add(textField_1);
			
			JScrollBar scrollBar_1 = new JScrollBar();
			scrollBar_1.setForeground(new Color(153, 255, 102));
			scrollBar_1.setBackground(Color.DARK_GRAY);
			scrollBar_1.setBounds(726, 485, 17, 138);
			frame.getContentPane().add(scrollBar_1);
			
			JLabel lblItemDescription_1 = new JLabel("Item Description");
			lblItemDescription_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblItemDescription_1.setForeground(Color.WHITE);
			lblItemDescription_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblItemDescription_1.setBackground(Color.WHITE);
			lblItemDescription_1.setBounds(569, 457, 158, 17);
			frame.getContentPane().add(lblItemDescription_1);
			
			JButton btnSignOut = new JButton("Sign out");
			btnSignOut.setForeground(Color.BLACK);
			btnSignOut.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnSignOut.setBackground(Color.WHITE);
			btnSignOut.setBounds(10, 694, 100, 32);
			frame.getContentPane().add(btnSignOut);
			frame.setBounds(100, 100, 1056, 776);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}


