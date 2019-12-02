
public class QueryMethods extends DatabaseQuerying{
	
	// send request to send chosen sql query to server
	public static String makeRequest(String requestSQL)
	{
		DatabaseQuerying queryMaker = new DatabaseQuerying();
		String results = queryMaker.run(requestSQL);
		return results;
	}
	// send request to get new id
	public static String getNewID()
	{
		String newID = makeRequest("4");
		return newID;
	}
	// send request to shutdown server
	public static String shutdownServer()
	{
		String request = "Shutdown";
		String shutdown = makeRequest(request);
		return shutdown;
	}
	// send request to login
	public static String login(String email, String pass)
	{
		String request = "select a.AcID from ACCOUNTS a where a.Email = '" + email
				+ "' and a.Password = '" + pass + "'0";
		String validity = makeRequest(request);
		return validity;
	}
	// send request to select all user products
	public static String selectProducts(String accID)
	{
		String request = "select u.Brand, u.ItemDesc from USER_TAGS u where u.AccountID = " + accID + "1";
		String products = makeRequest(request);
		products = products.replace("|", "\n");
		return products;
	}
	// send request to get all user info
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
	// send request to create user with unique login info
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
				+ "', '" + state + "', '" + zipCode + "', '" + phone + "', '" + extension + "', '" + newID + "')|3";
		String results = makeRequest(request);
		return results;
	}
	// send request to add new product listing
	public static String addProduct(String accID, String brand, String desc)
	{
		String request = "insert into TAGS (AccountNum, Brand, ItemDesc) "
				+ "values ('" + accID + "', '" + brand + "', '" + desc + "')5";
		String results = makeRequest(request);
		return results;
	}
}
