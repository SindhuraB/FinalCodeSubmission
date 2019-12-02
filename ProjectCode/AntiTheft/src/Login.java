//Partners: Varika & Labeeba


 
public class Login extends User {

	  public static boolean login (String email, String pass){

		
	
	
	if (database.containsKey(email)) {
		
	

		 if ( pass.equals(password.get(email)) ) {

		    	System.out.println("Login successful");
		        return true;
		    					
		    }
		    			
		 else  {

			 System.out.print("Login is incorrect.");
		    			      
		     return false;
		   }
		    	
		 
		   
	}
	
	else
		return false;
		   

 		}


}