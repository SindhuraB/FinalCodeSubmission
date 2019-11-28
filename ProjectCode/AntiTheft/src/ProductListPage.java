import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ProductListPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductListPage window = new ProductListPage();
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
	public ProductListPage() {
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
		list.setBounds(60, 162, 583, 171);
		frame.getContentPane().add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(643, 162, 17, 171);
		frame.getContentPane().add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("Item Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(64, 136, 130, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblItemDescription = new JLabel("Item Description");
		lblItemDescription.setForeground(Color.WHITE);
		lblItemDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblItemDescription.setBounds(254, 136, 130, 26);
		frame.getContentPane().add(lblItemDescription);
		
		JLabel lblProductList = new JLabel("Product List");
		lblProductList.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductList.setForeground(Color.WHITE);
		lblProductList.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblProductList.setBounds(192, 11, 320, 43);
		frame.getContentPane().add(lblProductList);
		frame.setBounds(100, 100, 718, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
