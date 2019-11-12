import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class AntiTheftGU {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblMi;
	private JTextField textField_2;
	private JLabel lblPhone;
	private JTextField textField_3;
	private JLabel lblExtension;
	private JTextField textField_4;
	private JLabel lblAddress;
	private JTextField textField_5;
	private JLabel lblCity;
	private JTextField textField_6;
	private JLabel lblState;
	private JTextField textField_7;
	private JLabel lblZipCode;
	private JTextField textField_8;
	private JLabel lblEmail;
	private JTextField textField_9;
	private JButton btnBack;
	private JButton btnNext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AntiTheftGUI window = new AntiTheftGUI();
					window.frame.setVisible(true);
					window.frame.setName("Personal Information");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AntiTheftGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(400, 400, 700, 215);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][grow][][grow][][][grow][grow][][][][][][][][][]", "[][][][][][][][][][][][]"));

		JLabel lblName = new JLabel("First Name");
		frame.getContentPane().add(lblName, "cell 0 1");

		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 1 1,growx");
		textField.setColumns(20);

		JLabel lblLastName = new JLabel("Last Name");
		frame.getContentPane().add(lblLastName, "cell 2 1,alignx trailing");

		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 3 1,growx");
		textField_1.setColumns(20);

		lblMi = new JLabel("MI");
		frame.getContentPane().add(lblMi, "cell 4 1,alignx trailing");

		textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 5 1,alignx left");
		textField_2.setColumns(1);

		lblPhone = new JLabel("Phone");
		frame.getContentPane().add(lblPhone, "cell 0 3,alignx trailing");

		textField_3 = new JTextField();
		frame.getContentPane().add(textField_3, "cell 1 3,growx");
		textField_3.setColumns(10);

		lblExtension = new JLabel("Extension");
		frame.getContentPane().add(lblExtension, "cell 2 3,alignx trailing");

		textField_4 = new JTextField();
		frame.getContentPane().add(textField_4, "cell 3 3,alignx left");
		textField_4.setColumns(3);

		lblEmail = new JLabel("Email");
		frame.getContentPane().add(lblEmail, "cell 0 5,alignx trailing");

		textField_9 = new JTextField();
		frame.getContentPane().add(textField_9, "cell 1 5,growx");
		textField_9.setColumns(20);

		lblAddress = new JLabel("Street");
		frame.getContentPane().add(lblAddress, "cell 0 7,alignx trailing");

		textField_5 = new JTextField();
		frame.getContentPane().add(textField_5, "cell 1 7,growx");
		textField_5.setColumns(20);

		lblCity = new JLabel("City");
		frame.getContentPane().add(lblCity, "cell 2 7,alignx trailing");

		textField_6 = new JTextField();
		frame.getContentPane().add(textField_6, "cell 3 7,growx");
		textField_6.setColumns(10);

		lblState = new JLabel("State");
		frame.getContentPane().add(lblState, "cell 4 7,alignx trailing");

		textField_7 = new JTextField();
		frame.getContentPane().add(textField_7, "cell 5 7,alignx left");
		textField_7.setColumns(2);

		lblZipCode = new JLabel("Zip Code");
		frame.getContentPane().add(lblZipCode, "cell 0 9,alignx trailing");

		textField_8 = new JTextField();
		frame.getContentPane().add(textField_8, "cell 1 9,alignx left");
		textField_8.setColumns(9);

		btnBack = new JButton("Back");
		frame.getContentPane().add(btnBack, "cell 0 11");

		btnNext = new JButton("Next");
		frame.getContentPane().add(btnNext, "cell 5 11");
	}

}
