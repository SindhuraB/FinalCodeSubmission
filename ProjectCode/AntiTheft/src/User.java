import javax.swing.JOptionPane;
import java.util.*;

/*
 *	This class create a new user profile 
 */

public class User {
	
	static String userName;
	static String lastName;
	static String firstName;
	static String middleName;
	static String userAdress;
	static String userID;
	static String userPassword;
	static String productList[];
	static String userEmail;
	static int numOfProdOwned;
	//String array
	
	public static void main (String[] args) {
		
		// User
		System.out.println("");		
		String input1 = JOptionPane.showInputDialog("Username:"); 
			userName = input1;
		String input2 = JOptionPane.showInputDialog("userPassword");
		userPassword = input2;
		
		JOptionPane.showMessageDialog(null, "Welcome");
		
			//JOptionPane.showMessageDialog(null, userName);
	}
	  
	public void getUserID() {
	}	
	public void getUserEmail() {
	}
	public void getNumOfProdOwned() {
	}
	public void getProductREference() {
	}

}

class Product {
	
}

class Login	{
	
}

class UserAccount {
	
	
}

class VerifyUserAccount {
	
}



