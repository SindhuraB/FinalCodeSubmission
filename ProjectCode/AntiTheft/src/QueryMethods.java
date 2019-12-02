
public class QueryMethods extends DatabaseQuerying{
	
	public static String makeRequest(String requestSQL)
	{
		DatabaseQuerying queryMaker = new DatabaseQuerying();
		String results = queryMaker.run(requestSQL);
		return results;
	}
	
	public static String getNewID()
	{
		String newID = makeRequest("4");
		return newID;
	}
	
	public static String shutdownServer()
	{
		String request = "Shutdown";
		String shutdown = makeRequest(request);
		return shutdown;
	}
	
	public static String login(String email, String pass)
	{
		String request = "select a.AcID from ACCOUNTS a where a.Email = '" + email
				+ "' and a.Password = '" + pass + "'0";
		String validity = makeRequest(request);
		return validity;
	}
	
	public static String selectProducts(String accID)
	{
		String request = "select u.Brand, u.ItemDesc from USER_TAGS u where u.AccountID = " + accID + "1";
		String products = makeRequest(request);
		products = products.replace("|", "\n");
		return products;
	}
	
	public static String[] getUserInfo(String accID)
	{
		String request = "select * from USER_INFO u where u.AccountID = " + accID + 
				"|" + "select * from ACCOUNTS a where a.AcID = " + accID + "2";
		String infoString = makeRequest(request);
		System.out.println("Length: " + infoString.length() + "\n" + infoString);
		String userInfo[] = new String[11];
		int previousSubstringEnd = 0;
		int count = 0;
		for(int i = 0; i < infoString.length(); i++)
		{
			if(infoString.charAt(i) == '|')
			{
				userInfo[count] = infoString.substring(previousSubstringEnd, i);
				previousSubstringEnd = i + 1;
				count++;
			}
		}
		
		return userInfo;
	}
	
	public static String createUser(String email, String pass, String fName, String mInit, String lName, String street,
			String city, String state, String zipCode, String phone, String extension)
	{
		String newID = getNewID();
		// Create database querying object
		String columns = "Fname, Minit, Lname, Streetname, City, State, ZipCode, Phone, Extension, AccountID";
		String request = "select a.AcID from ACCOUNTS a where a.Email = '" + email
				+ "' and a.Password = '" + pass + "'" + "|"
				+ "insert into ACCOUNT (AcID, Email, Password) "
				+ "values ('" + newID + "', '" + email + "', '" + pass + "')" + "|"
				+"insert into TAGUSER ("+ columns + ") "
				+ "values ('" + fName + "', '" + mInit + "', '" + lName + "', '" + street + "', '" + city 
				+ "', '" + state + "', '" + zipCode + "', '" + phone + "', '" + extension + "', '" + newID + "')3";
		String results = makeRequest(request);
		return results;
	}
	
	public static String addProduct(String accID, String brand, String desc)
	{
		String request = "insert into TAGS (AccountNum, Brand, ItemDesc) "
				+ "values ('" + accID + "', '" + brand + "', '" + desc + "')5";
		String results = makeRequest(request);
		return results;
	}
	
	/*
	// Example stuff, comment out if hooking up to methods
	public static void main(String[] args) {
		// Get new account ID number
		String newID = getNewID();
		System.out.println(newID);
		// Example return of valid login
		String validLogin = login("Cool@cool.com", "Cool123");
		System.out.println("Valid login: " + validLogin);
		// Example return of invalid login
		String invalidLogin = login("Cool@cool.com", "Cool12");
		System.out.println("Invalid login: " + invalidLogin);
		// Get all user products
		String products = selectProducts("1");
		System.out.println("Products: \n" + products);
		// Get all user info
		String[] userInfo = new String[11];
		userInfo = getUserInfo("1");
		for(int i = 0; i < userInfo.length; i++)
			System.out.print(userInfo[i] + " ");
		System.out.println("");
		// Create methods will return number of database rows updated
		// The input strings for the create methods will be replaced with input from GUI
		// Example return if trying to create and user sign-in info is already taken
		String takenInfo = createUser("Cool@cool.com", "Cool123", "Chris", "J", "Guerra", "123 Cool Street", 
				"CoolTown", "TX", "123456", "1234567890", "1");
		System.out.println(takenInfo);
		
		System.out.println(createUser("vpinnam@gmail.com", "vp7273", "Varika", "R", "Pinnam", "2200 Waterview", 
				"Richardson", "TX", "75080", "1234567890", "1"));
		
		// If both items of the user sign-in info are unique then the user will be created
		// Shutdown server
		//String shut = shutdownServer();
		//System.out.println("Server shutdown: " + shut);
	}
	*/
}
