import java.sql.*;
import java.util.ArrayList;
import java.net.*;
import java.io.*;

// Coded by: Chris Guerra and Labeeba Rana
// This class creates a connection and queries the database

public class DatabaseQuerying {
	// Initialize client socket and input/output streams
	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream output = null;
	
	static int accRowsChanged;
	static int userRowsChanged;
	
	public DatabaseQuerying()
	{
		try
		{
			socket = new Socket("192.168.1.24", 5000);
			System.out.println("Connected");
			
		}
		catch()
	}
	/*
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
	*/
	public int getNewID()
	{
		try
		{
			int newAccountID = 0; // AccountID to be created
			// Select last entered account ID number
			String sql = "select * from ACCOUNTS where AcID = (select max(AcID) from ACCOUNTS)";
			
			ResultSet rs = ;
			if(rs.next())
				newAccountID = rs.getInt(1) + 1; // Update account number to next number
			return newAccountID;
		}
		catch (Exception e)
		{
			System.out.print(e);
			return -1; // Return invalid int signifying error
		}
	}
	/*
	public void createNewUser(String email, String pass, String fName, String mInit, String lName, String street,
			String city, String state, int zipCode, int phone, int extension) 
	{
		try
		{
			int newID = getNewID();
			// Open connection
			Connection con = openCon();
			//create the statement object
			Statement stmt = con.createStatement();
			//execute insert statement; Create ACCOUNT entry
			accRowsChanged = stmt.executeUpdate("insert into ACCOUNT (AcID, Email, Password) "
					+ "values ('" + newID + "', '" + email + "', '" + pass + "')");
			//execute insert statement; Create TAGUSER entry
			String columns = "Fname, Minit, Lname, Streetname, City, State, ZipCode, Phone, Extension, AccountID";
			userRowsChanged = stmt.executeUpdate("insert into TAGUSER ("+ columns + ") "
					+ "values ('" + fName + "', '" + mInit + "', '" + lName + "', '" + street + "', '" + city
					+ "', '" + state + "', '" + zipCode + "', '" + phone + "', '" + extension + "', '" + newID + "')");
		}
		catch (Exception e)
		{
			System.out.print(e);
			accRowsChanged = -1;
			userRowsChanged = -1;
		}
	}
	
	public ArrayList<String> getUserInfo(int accID)
	{
		try
		{
			// Open connection
			Connection con = openCon();
			//create the statement object
			Statement stmt = con.createStatement();
			//execute query; update the '1' to variable input from GUI
			String sql = "select * from TAGUSER t ACCOUNT a where t.AccountID = " + Integer.toString(accID);
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<String> items = new ArrayList<String>();
			rs.next();
			items.add(rs.getString("Fname"));
			items.add(rs.getString("Minit"));
			items.add(rs.getString("Lname"));
			items.add(rs.getString("StreetName"));
			items.add(rs.getString("City"));
			items.add(rs.getString("State"));
			items.add(rs.getString("ZipCode"));
			items.add(rs.getString("Extension"));
			items.add(rs.getString("AccountID"));
			con.close();
			return items;
		}
		catch (Exception e)
		{
			System.out.print(e);
			return null;
		}
	}
	
	public ArrayList<String> selectProducts(int accID)
	{
		System.out.println("Method reached");
		try
		{
			// Open connection
			Connection con = openCon();
			//create the statement object
			Statement stmt = con.createStatement();
			//execute query; update the '1' to variable input from GUI
			String sql = "select ut.Brand, ut.ItemDesc from USER_TAGS ut where ut.AccountID = " + Integer.toString(accID);
			ResultSet rs = stmt.executeQuery(sql);
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
	*/
}