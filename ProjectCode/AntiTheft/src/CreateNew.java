import javax.swing.JOptionPane;

public class CreateNew {
	
	static String lastName;
	static String firstName;
	static String middleName;
	static String userAdress;
	static String userID;
	
	public static void main (String[] args) {
		// User
		System.out.println("");		
		String input1 = JOptionPane.showInputDialog("Last Name"); 
			lastName = input1;
		String input2 = JOptionPane.showInputDialog("First Name");
			firstName = input2;
		String input3 = JOptionPane.showInputDialog("Middle Name");
			middleName = input3;
		String input4 = JOptionPane.showInputDialog("User Adress");
			middleName = input4;
			
		
			
		//userPassword = input2;
		
	
	}
	
}// End of Class
