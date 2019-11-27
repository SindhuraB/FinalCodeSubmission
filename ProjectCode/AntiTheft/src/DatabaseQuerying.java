import java.sql.*;
import java.util.ArrayList;

// Coded by: Chris Guerra and Labeeba Rana
// This class creates a connection and queries the database

public class DatabaseQuerying {
	static int accRowsChanged;
	static int userRowsChanged;
	
	public DatabaseQuerying() {}
	
	public static Connection openCon ()
	{
		try {
			//load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.1.24:1521/orclpdb";
			String user = "TAGCOMPDBA";
			String pass = "minigrr1";
			
			//create the connection object
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection made to PDB");
			return con;
			}
		catch(Exception e) {
			System.out.print(e);
			return null;
		}
	}
	
	public static int getNewID()
	{
		try
		{
			int newAccountID = 0; // AccountID to be created
			// Open connection
			Connection con = openCon();
			//create the statement object
			Statement stmt = con.createStatement();
			//execute query; Select last entered account ID number
			ResultSet rs = stmt.executeQuery("select * from ACCOUNTS where AcID = (select max(AcID) from ACCOUNTS)");
			rs.next(); // Get selected row
			newAccountID = rs.getInt(1) + 1; // Update account number to next number
			con.close(); // close connection to db
			return newAccountID;
		}
		catch (Exception e)
		{
			System.out.print(e);
			return -1; // Return invalid int signifying error
		}
	}
	
	public static void createNewUser(String email, String pass, String fName, String mInit, String lName, String street,
			String city, String state, int zipCode, int phone, int extension, int newID) 
	{
		try
		{
			// Open connection
			Connection con = openCon();
			//create the statement object
			Statement stmt = con.createStatement();
			//execute insert statement; Create TAGUSER entry
			String columns = "Fname, Minit, Lname, Streetname, City, State, ZipCode, Phone, Extension, AccountID";
			userRowsChanged = stmt.executeUpdate("insert into TAGUSER ("+ columns + ") "
					+ "values ('" + fName + "', '" + mInit + "', '" + lName + "', '" + street + "', '" + city
					+ "', '" + state + "', '" + zipCode + "', '" + phone + "', '" + extension + "', '" + newID + "')");
			//execute insert statement; Create ACCOUNT entry
			accRowsChanged = stmt.executeUpdate("insert into ACCOUNT (AcID, Email, Password) "
					+ "values ('" + newID + "', '" + email + "', '" + pass + "')");
		}
		catch (Exception e)
		{
			System.out.print(e);
			accRowsChanged = -1;
			userRowsChanged = -1;
		}
	}
	
	public static ArrayList<String> selectProducts()
	{
		System.out.println("Method reached");
		try
		{
			// Open connection
			Connection con = openCon();
			//create the statement object
			Statement stmt = con.createStatement();
			//execute query; update the '1' to variable input from GUI
			ResultSet rs = stmt.executeQuery("select ut.Brand, ut.ItemDesc from USER_TAGS ut where ut.AccountID = '1'");
			ArrayList<String> items = new ArrayList<String>();
			while(rs.next()) {
				items.add(rs.getString("Brand") + ", " + rs.getString("ItemDesc"));
			}
			con.close();
			return items;
		}
		catch (Exception e)
		{
			System.out.print(e);
			return null;
		}
	}
}