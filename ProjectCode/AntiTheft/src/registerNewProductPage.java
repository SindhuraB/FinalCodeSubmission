import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;

public class registerNewProductPage {

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
					registerNewProductPage window = new registerNewProductPage();
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
	public registerNewProductPage() {
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
		list.setBounds(337, 97, 226, 138);
		frame.getContentPane().add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(Color.DARK_GRAY);
		scrollBar.setForeground(new Color(153, 255, 102));
		scrollBar.setBounds(563, 97, 17, 138);
		frame.getContentPane().add(scrollBar);
		
		textField = new JTextField();
		textField.setBounds(113, 97, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblManufacturer = new JLabel("Manufacturer");
		lblManufacturer.setForeground(new Color(255, 255, 255));
		lblManufacturer.setBackground(new Color(255, 255, 255));
		lblManufacturer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblManufacturer.setBounds(10, 97, 102, 17);
		frame.getContentPane().add(lblManufacturer);
		
		JLabel lblRegisterNewProducts = new JLabel("Register New Products");
		lblRegisterNewProducts.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRegisterNewProducts.setForeground(new Color(255, 255, 255));
		lblRegisterNewProducts.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterNewProducts.setBounds(150, 11, 320, 43);
		frame.getContentPane().add(lblRegisterNewProducts);
		
		JLabel lblItemName = new JLabel("Item ");
		lblItemName.setForeground(Color.WHITE);
		lblItemName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblItemName.setBackground(Color.WHITE);
		lblItemName.setBounds(10, 140, 102, 17);
		frame.getContentPane().add(lblItemName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 140, 140, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblItemDescription = new JLabel("Item Description:");
		lblItemDescription.setForeground(Color.WHITE);
		lblItemDescription.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblItemDescription.setBackground(Color.WHITE);
		lblItemDescription.setBounds(10, 205, 158, 17);
		frame.getContentPane().add(lblItemDescription);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 233, 243, 55);
		frame.getContentPane().add(editorPane);
		frame.setBounds(100, 100, 645, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
