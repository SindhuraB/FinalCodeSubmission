

//Partners: Varika & Labeeba


 
public class Login extends User {

	  public static int login (String email, String pass){

		
	
	if (database.contains(email)) {
		

		 if ( pass.equals(password.get(email)) ) {

		    	System.out.println("Login successful");
		        return 1;
		    					
		    }
		    			
		 else (!pass.equals(password.get(email))) {

			 System.out.print("Login is incorrect.");
		    			      
		     return 0;
		   }
		    	
		 
		   
	}
	
	else
		throw NoSuchElementException;

		   

 		}


}
