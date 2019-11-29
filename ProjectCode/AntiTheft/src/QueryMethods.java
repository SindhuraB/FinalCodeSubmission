import java.util.ArrayList;

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
		String request = "select a.AcID from ACCOUNTS a where a.Email = " + email
				+ " and a.Password = " + pass + "0";
		String validity = makeRequest(request);
		return validity;
	}
	public static String selectProducts(String accID)
	{
		String request = "select u.Brand, u.ItemDesc from USER_TAGS u where u.AccountID = " + accID + "1";
		String products = makeRequest(request);
		return products;
	}
	public static String getUserInfo(String accID)
	{
		String request = "select * from USER_INFO u where u.AccountID = " + accID + "2";
		String userInfo = makeRequest(request);
		return userInfo;
	}
	public static String createUser(String email, String pass, String fName, String mInit, String lName, String street,
			String city, String state, String zipCode, String phone, String extension)
	{
		String newID = getNewID();
		// Create database querying object
		String columns = "Fname, Minit, Lname, Streetname, City, State, ZipCode, Phone, Extension, AccountID";
		String request = "insert into ACCOUNT (AcID, Email, Password) "
				+ "values ('" + newID + "', '" + email + "', '" + pass + "')|"
				+"insert into TAGUSER ("+ columns + ") "
				+ "values ('" + fName + "', '" + mInit + "', '" + lName + "', '" + street + "', '" + city 
				+ "', '" + state + "', '" + zipCode + "', '" + phone + "', '" + extension + "', '" + newID + "')3";
		String results = makeRequest(request);
		return results;
	}
	public static void main(String[] args) {
		String valid = selectProducts("1");
		System.out.println(valid);
		String shut = shutdownServer();
	}
}
