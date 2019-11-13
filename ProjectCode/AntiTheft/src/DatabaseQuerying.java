import java.sql.*;

// Coded by: Chris Guerra and Labeeba Rana
// This class creates a connection and queries the database

public class DatabaseQuerying {
	Connection con;
	
	public DatabaseQuerying() {
		try {
		//load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//create the connection object
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/orclpdb", "TAGCOMPDBA", "minigrr1");
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
	
	public static void CreateUser()
	{
		try
		{
		int newAccountID = 0;
		String result;
		// Create object for connection
		DatabaseQuerying dbq = new DatabaseQuerying();
		//create the statement object 
		Statement stmt = dbq.con.createStatement();
		//execute query; Select last entered account ID number
		ResultSet rs = stmt.executeQuery("select * from ACCOUNTS where AcID=(select max(AcID) from ACCOUNTS)");
		result = rs.toString(); // Make rs into string that can be parsed
		if(newAccountID != 0) // If there are existing accounts then add 1 to last entry for new account
			newAccountID = Integer.parseInt(result) + 1;
		dbq.con.close();
		}
		catch (Exception e)
		{
			System.out.print(e);
		}
	}
	
	public static void selectProducts()
	{
		try
		{
		// Create object for connection
		DatabaseQuerying dbq = new DatabaseQuerying();
		//create the statement object 
		Statement stmt = dbq.con.createStatement();
		//execute query; update the '1' to variable input from GUI
		ResultSet rs = stmt.executeQuery("select * from USER_TAGS where ACCOUNTID = '1'");
		}
		catch (Exception e)
		{
			System.out.print(e);
		}
	}
}