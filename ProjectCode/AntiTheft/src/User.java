import javax.swing.JOptionPane;

import java.util.*;

/*
 *	This class create a new user profile 
 */


public class User {
	
	String lastName;
	String firstName;
	Character middle;
	String street;
	String city;
	String state;
	Integer zip;
	Integer phone;
	Integer userID;
	String userPassword;
	String productList[];
    String userEmail;
    int numOfProdOwned;
	static int count = 1000;
	static Scanner input = new Scanner (System.in);
	 static HashMap<String, Integer> database = new HashMap<>();
     static HashMap<String, String> password = new HashMap <>();
	//String array
	
	/*
	public static void main (String[] args) {
		
		// User
		System.out.println("");		
		String input1 = JOptionPane.showInputDialog("Username:"); 
			userName = input1;
		String input2 = JOptionPane.showInputDialog("userPassword");
		userPassword = input2;
		
		JOptionPane.showMessageDialog(null, "Welcome");
		
			//JOptionPane.showMessageDialog(null, userName);
			 * 
			 * 	System.out.println("");		
		String input1 = JOptionPane.showInputDialog("Last Name"); 
			lastName = input1;
		String input2 = JOptionPane.showInputDialog("First Name");
			firstName = input2;
		String input3 = JOptionPane.showInputDialog("Middle Name");
			middleName = input3;
		String input4 = JOptionPane.showInputDialog("User Address");
			userAddress = input4;
			
		
	}
	
	*/
	//Partners: Varika & Labeeba
	  
     public void createAccount() {
    	 


		        System.out.println("To create an account, enter your email");

		        userEmail = input.next();
		        
		        if (database.containsKey(userEmail)) {
		        	
		           	 System.out.println("You already have an account! Please try logging in.");
		           	 Login.login();
		        }
		        	
		        
		        System.out.println ("Please enter your first name");
		        
		        firstName = input.next();
		        
 
		        System.out.println ("Please enter your last name");
		        
		        lastName = input.next();
		        
		      
		        System.out.println("Please enter your middle initial or the number 0 if you do not have one");
		        
		        middle = input.next().charAt(0);
		        
		        while (!(Character.isLetter(middle) || middle == '0')){
		        	System.out.println("Invalid. Please try again by entering your middle initial or 0 if you don't have one");
		        	middle = input.next().charAt(0);
		        }
		        
		       input.nextLine();
		        System.out.println("Street Address");
		        
		        street = input.nextLine();
		        
		        System.out.println("City");
		        
		       
		        
		        city = input.next();
		        
		        System.out.println("State");
		        
		        state = input.next();
		      
		        System.out.println("Zip");
		        
		        
		        try {
		        	zip = input.nextInt();
		        }
		        catch (Exception e) {
		        	System.out.println("Please enter your zip code using only digits");
		        	input.nextLine();
		        	zip = input.nextInt();
		        }
		        
		        
		        System.out.println("Phone Number");
		        
		        try {
		        	phone = input.nextInt();
		        }
		        catch (Exception e) {
		        	System.out.println("Please enter your number using only digits");
		        	input.nextLine();
		        	phone = input.nextInt();
		        }
		          
		          
		        
		        System.out.print("Enter a password for your account");

		        userPassword = input.next();
		        
		        
		 /*       
		        boolean valid = User.valid(userPassword);
		        
		        while(!valid) {
		        	
		        	  System.out.print("Please enter a stronger password containing at least one lowercase letter, one uppercase letter, and one number");

		        	  userPassword = input.next();
				      valid = User.valid(userPassword);
		        }
		    */    	

		        //user account
		        password.put(userEmail, userPassword);

		        //user ID
		        userID = count;
		        database.put(userEmail, userID);

		        System.out.println("Your unique ID number is " + count);
		        

		        count++;
		  }
	

	
	
	void printHash(){
		
		System.out.println("Printing database of emails and id");
		for (String email : database.keySet()) {
			   System.out.println(email + "The user ID is " + database.get(email));
			 }
		
		System.out.println("Printing database of emails and passwords");
		for (String email : password.keySet()) {
			   System.out.println(email + "The password is" + password.get(email) );
			 }
		
	}
	
	public  Integer getUserID() {
		
		return userID;
		
	}	
	

	public  String getname() {
		
		if (middle == '0')
			return firstName + " " + lastName;
		else
			return firstName + " " + middle + ". " + lastName;
		
	}	
	
	public String getemail() {
		
		return userEmail;
		
	}	
	
	public String getAddress() {
		
		return street + " " + city + ", " + state + " " + zip.toString();
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






