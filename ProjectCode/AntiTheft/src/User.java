import javax.swing.JOptionPane;

import java.util.*;

/*
 *	This class create a new user profile 
 */


public class User {
	
	String lastName;
	String firstName;
	String middle;
	String street;
	String city;
	String state;
	String zip;
	String phone;
	Integer userID;
	String userPassword;
    String userEmail;
    int numOfProdOwned;
	static int count = 1000;
	static Scanner input = new Scanner (System.in);
	 static HashMap<String, Integer> database = new HashMap<>();
     static HashMap<String, String> password = new HashMap <>();
     
     
     //constructor for User for Junit testing
     
     //defining default constructor
     User (){
    	 
    	 
     }
     
     //mini constructor to test things
     User (String email, String pass){
    	 
    	 
    	 userEmail= email;
    	 userPassword = pass;
    	 userID = count;
    	 
    	  password.put(email,pass);
    	  database.put(email, count);
    	 count++;
    	 
    			
     }
	
	
	//Partners: Varika & Labeeba
	 
     //constructor creating new account based on linking to signin page
     User (String first, String last, String mid, String streetad, String cityname, String zipcode, String phonenum, String pass, String email, String statename) {
    	 
    	 lastName = last;
    	 firstName = first;
    	 middle = mid;
    	 street = streetad;
    	 city = cityname;
    	 state = statename;
    	 zip = zipcode;
    	 phone = phonenum;
    	 userID = count;
    	 userPassword = pass;
    	 userEmail = email;
    	 
    	 //user account
	        password.put(userEmail, userPassword);

	        //user ID
	        database.put(userEmail, userID);

	        System.out.println("Account creation successful. Your unique ID number is " + count);
	        

	        count++;

		     
		        
		       /* if (database.containsKey(userEmail)) {
		        	
		           	 System.out.println("You already have an account! Please try logging in.");
		           	 Login.login();
		        }
		        */	
		       
		       
		       
		     /* 
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
		          
		        */
		        
		      
		        
		      /*
		        boolean valid = User.valid(userPassword);
		        
		        while(!valid) {
		        	
		        	  System.out.print("Please enter a stronger password containing at least one lowercase letter, one uppercase letter, and one number");

		        	  userPassword = input.next();
				      valid = User.valid(userPassword);
		        }
		       	
*/
		       
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
		
			return firstName + " " + middle + ". " + lastName;
		
	}	
	
	public String getemail() {
		
		return userEmail;
		
	}	
	
	public String getAddress() {
		
		return street + " " + city + ", " + state + " " + zip.toString();
	}
	
	//validation for password - contains number, upper case, lower case, no spaces
	
	/*
	public static boolean valid (String pass){
		
		
	String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$)";
	if (pass.matches(pattern))
		return true;
		
	else
		return false;
	}
	
	*/

}






