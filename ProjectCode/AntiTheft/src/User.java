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
	static int count = 1000;
	static Scanner input = new Scanner (System.in);
	HashMap<String, Integer> database = new HashMap<>();
	HashMap<String, String> password = new HashMap <>();
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
	
	//Partners: Varika & Labeeba
	  
	public void createAccount() {

		        System.out.print("Enter your name");

		        String name = input.next();

		        System.out.print("Enter a password");

		        String password = input.next();

		        //user account
		        password.put(email, password);

		        //user ID
		        database.put(email, count);

		        System.out.print("Your number is" + count);

		        count++;
		  }
	}

	
	
	public static int getUserID() {
		
		if database.containsKey(email)
			return database.get(email);
		
	}	
	
	

}



class UserAccount {
	
	
}

class VerifyUserAccount {
	
}


