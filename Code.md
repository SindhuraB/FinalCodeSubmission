

/**
*Description: This branch will ask the user for a password

*Date: 11-10-19

*@authors Georpi Oslond Junior / Gentry Jenkins 

*@version 1.0.0

*@authors Varika Pinnam  / Labeeba Rana

*@version 1.1.0

*@authors Christopher Guerra / Gentry Jenkins 

*@version 1.2.0

*/ 


public class User{ //start of class

  Vector <Integer> numbers = new Vector(); //assigning the value of number

  HashMap<String, Integer> database = new HashMap<>(); //sorting future inputs of object with a hashmap called database

  HashMap<String, String> password = new HashMap <>(); //sorting future inputs of password with a hashmap called database

  Scanner input = new Scanner(System.in); // ask user for for input 

  int count = 1; //puts the count at 1

    
   /**
   
   * @param String as args		
   
   * @return Returns the users name and assighned number
   
   * @throws Nothing is implemented
   
   */
  
   public static void assign (){ //start of enter name method

   System.out.print("Enter your name"); //Ask user for their name

   String name = input.next(); //stores input

   System.out.print("Enter a password"); //ask user for password

   String password = input.next(); // stores password

   password.put(password, name); //Stores password and name as an object

   database.put(name, numbers.add(count)); //Places that object in the database

   System.out.print("Your number is" + account); //prints out the info and their number to the user

   count++; //Increases the count for the next entry
  }

  /**
  
  * @param String as args	
  
  * @return values found in password, or error if not valid
  
  * @throws Nothing is implemented
  
  */

 public static void find (String name){ //start of method

  System.out.print("Enter your password"); //Ask for password

   String password= input.next // stores password

   if (password.containsKey(name) && password = password.get(name)){ // checks for password valid

   if (database.containsKey(name)) // Checks more conditions for password

   System.out.println(  System.out.print("Login successful. Your number is: " + database.get(name)); //Prints out user info if valid
   }

   else

   System.out.print("Unable to find your account"); // else prints out error message

  }


}
