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
	static String userAddress;
	static Integer userID;
	static String userPassword;
	static String productList[];
	static String userEmail;
	static int numOfProdOwned;
	static int count = 1000;
	static Scanner input = new Scanner (System.in);
	static HashMap<String, Integer> database = new HashMap<>();
	static HashMap<String, String> password = new HashMap <>();
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

		        System.out.print("Enter your email");

		        userEmail = input.next();
		        
		        while (database.containsKey(userEmail)) {
		        	
		        	 System.out.println("You already have an account! Please try logging in.");
		        }
		        	

		        System.out.print("Enter a password");

		        userPassword = input.next();
		        
		        boolean valid = User.valid(userPassword);
		        
		        while(!valid) {
		        	
		        	  System.out.print("Please enter a stronger password containing at least one lowercase letter, one uppercase letter, and one number");

		        	  userPassword = input.next();
				      valid = User.valid(userPassword);
		        }
		        	

		        //user account
		        password.put(userEmail, userPassword);

		        //user ID
		        database.put(userEmail, count);

		        System.out.print("Your number is" + count);
		        
		        userID = count;

		        count++;
		  }
	

	
	
	public static Integer getUserID() {
		
		return userID;
		
	}	
	
	public static String getemail() {
		
		return userEmail;
		
	}	
	
	//validation for password - contains number, upper case, lower case, no spaces
	public static boolean valid (String pass){
		
		
	String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$)";
	if (pass.matches(pattern))
		return true;
		
	else
		return false;
	}
	
	

}



class UserAccount {
	
	
}

class VerifyUserAccount {
	
}


