

//Partners: Varika & Labeeba


 
public class Login extends User {

	  public static void login (){

		    System.out.print("Enter your email");
		    
		    String email = input.next();

		    System.out.print("Enter your password");
		    
		    String pass= input.next();

		    if ( pass == password.get(email) ) {

		    	System.out.print("Login successful");
		    }

		    else

		      System.out.print("Unable to find your account");

		  }
}
