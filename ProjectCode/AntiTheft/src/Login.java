

//Partners: Varika & Labeeba


 
public class Login extends User {

	  public static boolean login (String emailtest, String passtest){

		
			User one = User("pinnam@utdallas.edu", "pinnampass");
			
			String pass = "pinnampass";
			String email = "pinnam@utdallas.edu";
	
	if (database.containsKey(email)) {
		
	

		 if ( pass.equals(password.get(email)) ) {

		    	System.out.println("Login successful");
		        return true;
		    					
		    }
		    			
		 else (!pass.equals(password.get(email))) {

			 System.out.print("Login is incorrect.");
		    			      
		     return false;
		   }
		    	
		 
		   
	}
	
	else
		throw NoSuchElementException;

		   

 		}


}
