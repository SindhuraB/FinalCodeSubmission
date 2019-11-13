import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class signIn extends DatabaseQuerying {

	private JFrame frame;
	private JTextField txtEnterUsernameHere;
	private JTextField txtEnterPassword;
	private final Action Login = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		frame.setBounds(100, 100, 404, 287);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(152, 172, 89, 23);
		frame.getContentPane().add(btnLogIn);
		
		txtEnterUsernameHere = new JTextField();
		txtEnterUsernameHere.setText("Enter Username Here");
		txtEnterUsernameHere.setBounds(175, 76, 143, 23);
		frame.getContentPane().add(txtEnterUsernameHere);
		txtEnterUsernameHere.setColumns(10);
		
		txtEnterPassword = new JTextField();
		txtEnterPassword.setText("Enter Password");
		txtEnterPassword.setBounds(175, 107, 143, 23);
		frame.getContentPane().add(txtEnterPassword);
		txtEnterPassword.setColumns(10);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setText("Username: ");
		txtpnUsername.setBounds(69, 76, 81, 23);
		frame.getContentPane().add(txtpnUsername);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(69, 110, 81, 20);
		frame.getContentPane().add(txtpnPassword);
		
		btnLogIn.addActionListener(this);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "LoginAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
