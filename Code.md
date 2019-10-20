
public class User{

  Vector <Integer> numbers = new Vector();
  HashMap<String, Integer> database = new HashMap<>();
  HashMap<String, String> password = new HashMap <>();
  Scanner input = new Scanner(System.in);
  int count = 1;

  //assigning account number in database
    public static void assign (){
        System.out.print("Enter your name");
        String name = input.next();
        System.out.print("Enter a password");
        String password = input.next();
        password.put(password, name);
        database.put(name, numbers.add(count));
        System.out.print("Your number is" + account);
        count++;
  }

  //retrieving from database
  public static void find (String name){
    System.out.print("Enter your password");
    String password= input.next();
    if (password.containsKey(name) && password = password.get(name)){
      System.out.print("Login successful");
    }
    if (database.containsKey(name)) {
               System.out.println(database.get(name));
           }
    else
      System.out.print("Unable to find your account");

  }


}
