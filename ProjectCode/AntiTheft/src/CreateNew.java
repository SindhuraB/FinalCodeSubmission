import javax.swing.JOptionPane;

public class CreateNew extends User {
	
	
	
	public static void main (String[] args) {
		// User
		System.out.println("");		
		String input1 = JOptionPane.showInputDialog("Last Name"); 
			lastName = input1;
		String input2 = JOptionPane.showInputDialog("First Name");
			firstName = input2;
		String input3 = JOptionPane.showInputDialog("Middle Name");
			middleName = input3;
		String input4 = JOptionPane.showInputDialog("User Address");
			userAddress = input4;
			
		
			
		//userPassword = input2;
		
	
	}
	
}// End of Class
