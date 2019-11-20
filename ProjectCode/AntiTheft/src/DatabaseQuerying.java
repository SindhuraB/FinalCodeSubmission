import java.sql.*;
import java.util.ArrayList;

// Coded by: Chris Guerra and Labeeba Rana
// This class creates a connection and queries the database

public class DatabaseQuerying {
	
	public DatabaseQuerying() {}
	
	public static Connection openCon ()
	{
		try {
			//load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//create the connection object
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@10.21.79.26:1521/orclpdb", "TAGCOMPDBA", "minigrr1");
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
	
	public static void createNewUser() 
	{
		
	}
	
	public static ArrayList<String> selectProducts()
	{
		System.out.println("Method reached");
		try
		{
			// Open connection
			Connection con = openCon();
			System.out.println("Connection opened");
			//create the statement object 
			Statement stmt = con.createStatement();
			//execute query; update the '1' to variable input from GUI
			ResultSet rs = stmt.executeQuery("select ut.Brand, ut.ItemDesc from USER_TAGS ut where ut.AccountID = '1'");
			System.out.println("Query executed");
			ArrayList<String> items = new ArrayList<String>();
			while(rs.next()) {
				System.out.println("Copying results");
				items.add(rs.getString("Brand") + ", " + rs.getString("ItemDesc"));
			}
			con.close();
			System.out.println("Connection to PDB closed");
			return items;
		}
		catch (Exception e)
		{
			System.out.print(e);
			return null;
		}
	}
}