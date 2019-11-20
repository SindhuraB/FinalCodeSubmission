

//Partners: Varika & Labeeba


 
public class Login extends Product {

	  public static void login (){

		    System.out.print("To login, enter your email");
		    
		    String email = input.next();
		    
		    if (!database.containsKey(email)) 
		    	System.out.println("Sorry, we were unable to find an account with that email");
		    
		    else 
		    {

		    	System.out.print("Enter your password to login");
		    
		    	String pass= input.next();

		    			if ( pass.equals(password.get(email)) ) {

		    					System.out.println("Login successful");
		    					
		    					System.out.println("Your registered products are:");
		    					Product.DisplayItems(email);
		    					
		    			}
		    			
		    			while (!pass.equals(password.get(email))) {

		    			      System.out.print("Password is incorrect. Please try entering it again.");
		    			      
		    			       pass= input.next();
		    			}
		    	
		    }
		    

		   

		  }
}
