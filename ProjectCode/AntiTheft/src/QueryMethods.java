import java.util.ArrayList;

public class QueryMethods extends DatabaseQuerying{
	
	public String makeRequest(String requestSQL)
	{
		DatabaseQuerying queryMaker = new DatabaseQuerying();
		String results = queryMaker.run(requestSQL);
		return results;
	}
	public String getNewID()
	{
		String newID = makeRequest("4");
		return newID;
	}
	public String shutdownServer()
	{
		String request = "Shutdown";
		String shutdown = makeRequest(request);
		return shutdown;
	}
	public String login(String email, String pass)
	{
		String request = "select a.AcID from ACCOUNTS a where a.Email = " + email
				+ " and a.Password = " + pass + "0";
		String validity = makeRequest(request);
		return validity;
	}
	public String selectProducts(String accID)
	{
		String request = "select u.Brand, u.ItemDesc from USER_TAGS u ACCOUNTS a where u.AccountID = " + accID + "1";
		String products = makeRequest(request);
		return products;
	}
	public String getUserInfo(String accID)
	{
		String request = "select * from USER_INFO u where u.AccountID = " + accID + "2";
		String userInfo = makeRequest(request);
		return userInfo;
	}
	public String createUser(String email, String pass, String fName, String mInit, String lName, String street,
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
		DatabaseQuerying queryMaker = new DatabaseQuerying();
		
	}
}
