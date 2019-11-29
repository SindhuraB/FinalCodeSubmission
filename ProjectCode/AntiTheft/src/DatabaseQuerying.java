import java.util.ArrayList;
import java.net.*;
import java.io.*;

// Coded by: Chris Guerra and Labeeba Rana
// This class creates a connection and queries the database

public class DatabaseQuerying{
	// Initialize client socket and input/output streams
	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream output = null;
	
	static int accColChanged; // Number of columns changed from updating ACCOUNT table
	static int userColChanged; // Number of columns changed from updating TAGUSER table
	
	public String run(String requestInfo)
	{
		String result = "";
		try
		{
			// Connect to database server and setup input/output streams
			socket = new Socket("192.168.1.24", 80);
			System.out.println("Connected");
			input = new DataInputStream(socket.getInputStream());
			output = new DataOutputStream(socket.getOutputStream());
			System.out.println("Sending request: " + requestInfo);
			
			// Send request to server
			try
			{
				System.out.println("Making request");
				// Write sql string for query to output
				output.writeUTF(requestInfo);
			}
			catch(IOException i)
			{
				System.out.println(i);
			}
			result = input.readUTF();
		}
		catch(UnknownHostException u)
		{
			System.out.println(u);
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
		
		System.out.println("Closing server connection.");
		try
		{
			// Close socket connection and input/output streams
			input.close();
			output.close();
			socket.close();
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
		return result;
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
			con.close();
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