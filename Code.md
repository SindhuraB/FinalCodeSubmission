
public class User{

  Vector <Integer> numbers = new Vector();
  HashMap<String, Integer> database = new HashMap<>();
  Scanner input = new Scanner(System.in);
  int count = 1;

  //creating account in database
    public static void create (){
        System.out.print("Enter your name");
        String name = input.next();
        database.put(name, numbers.add(count));
        count++;
  }

  //retrieving from database
  public static void find (String name){
    if (database.containsKey(name)) {
               System.out.println(database.get(name));
           }
    else
      System.out.print("Unable to find your account");

  }


}
