
public class Login {

	  public static void login (String email){

		    System.out.print("Enter your password");

		    String password= input.next();

		    if (password.contains(email) && password == password.get(email)){

		    	System.out.print("Login successful");
		    }

		    else

		      System.out.print("Unable to find your account");

		  }
}
