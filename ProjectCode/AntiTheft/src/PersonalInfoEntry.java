//Import statements that allow for proper gui abilities 
import java.awt.EventQueue;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PersonalInfoEntry {

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
					PersonalInfoEntry window = new PersonalInfoEntry();
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
	public PersonalInfoEntry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 102, 102));
		frame.setResizable(false);
		frame.setBounds(400, 400, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblName = new JLabel("First Name");
		lblName.setForeground(new Color(245, 255, 250));
		lblName.setBounds(7, 15, 53, 14);
		frame.getContentPane().add(lblName);

		textField = new JTextField();
		textField.setBounds(182, 425, 169, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(20);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(239, 15, 51, 14);
		lblLastName.setForeground(new Color(245, 255, 250));
		frame.getContentPane().add(lblLastName);

		textField_1 = new JTextField();
		textField_1.setBounds(417, 372, 169, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(20);

		JLabel lblMi = new JLabel("MI");
		lblMi.setForeground(new Color(245, 255, 250));
		lblMi.setBounds(481, 15, 12, 14);
		frame.getContentPane().add(lblMi);

		textField_2 = new JTextField();
		textField_2.setBounds(497, 12, 15, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(1);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(new Color(245, 255, 250));
		lblPhone.setBounds(32, 44, 30, 14);
		frame.getContentPane().add(lblPhone);

		textField_3 = new JTextField();
		textField_3.setBounds(182, 484, 169, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblExtension = new JLabel("Extension");
		lblExtension.setForeground(new Color(245, 255, 250));
		lblExtension.setBounds(243, 44, 47, 14);
		frame.getContentPane().add(lblExtension);

		textField_4 = new JTextField();
		textField_4.setBounds(294, 41, 33, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(3);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(245, 255, 250));
		lblEmail.setBounds(35, 73, 27, 14);
		frame.getContentPane().add(lblEmail);

		textField_9 = new JTextField();
		textField_9.setBounds(167, 542, 169, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(20);

		JLabel lblAddress = new JLabel("Street");
		lblAddress.setForeground(new Color(245, 255, 250));
		lblAddress.setBounds(32, 101, 30, 14);
		frame.getContentPane().add(lblAddress);

		textField_5 = new JTextField();
		textField_5.setBounds(167, 621, 169, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(20);

		JLabel lblCity = new JLabel("City");
		lblCity.setForeground(new Color(245, 255, 250));
		lblCity.setBounds(271, 101, 19, 14);
		frame.getContentPane().add(lblCity);

		textField_6 = new JTextField();
		textField_6.setBounds(442, 467, 169, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel lblState = new JLabel("State");
		lblState.setForeground(new Color(245, 255, 250));
		lblState.setBounds(467, 101, 26, 14);
		frame.getContentPane().add(lblState);

		textField_7 = new JTextField();
		textField_7.setBounds(756, 169, 24, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(2);

		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setForeground(new Color(245, 255, 250));
		lblZipCode.setBounds(19, 130, 43, 14);
		frame.getContentPane().add(lblZipCode);

		textField_8 = new JTextField();
		textField_8.setBounds(264, 210, 87, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(9);
		
		JButton button = new JButton("Back");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBackground(Color.WHITE);
		button.setBounds(7, 691, 68, 19);
		frame.getContentPane().add(button);
	}
}
