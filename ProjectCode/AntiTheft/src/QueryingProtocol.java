import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryingProtocol {
	
	public char loginSQL = '0';
	public char productsSQL = '1';
	public char userInfoSQL = '2';
	public char createUserSQL = '3';
	public char getNewID = '4';
	
	public Connection dbCon()
	{
		try 
		{
			//load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Create connection url
			String url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
			String user = "TAGCOMPDBA";
			String pass = "minigrr1";
			
			//create the connection object
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection made to PDB");
			return con;
		}
		catch(Exception e)
		{
			System.out.print(e);
			return null;
		}
	}
	public String processInput(String sql)
	{
		Connection con = dbCon();
		String resultString = "";
		char requestCode = sql.charAt(sql.length()-1);
		if(!sql.equals("Shutdown") || requestCode != 4)
		{
			// Remove request code from end of sql string
			sql = sql.substring(0, sql.length() - 1);
		}
		
		if(sql.equals("Shutdown"))
		{
			resultString = "Shutdown";
		}
		else if(requestCode == loginSQL)
		{
			System.out.println("Querying:");
			System.out.println(sql);
			
			// Get ID from account relating to email and password
			try
			{
				//create the statement object
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				System.out.println("Query Executed");
				if(rs.next())
				{
					resultString = rs.getString("AcID");
					System.out.println("Row results: " + resultString);
				}
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(requestCode == productsSQL)
		{
			System.out.println("Querying:");
			System.out.println(sql);
			
			try
			{
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				System.out.println("Query Executed");
				while(rs.next())
				{
					String brand = rs.getString("Brand");
					String desc = rs.getString("ItemDesc");
					String row = brand + ", " + desc + "|";
					resultString = resultString.concat(row);
					System.out.println("Row results: " + row);
				}
				System.out.println("All products: " + resultString);
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(requestCode == userInfoSQL)
		{
			System.out.println("Querying:");
			
			String userInfoSQL = "";
			String accInfoSQL = "";
			for(int i = 0; i < sql.length() - 1; i++)
			{
				if(sql.charAt(i) == '|')
				{
					userInfoSQL = sql.substring(0, i);
					System.out.println(userInfoSQL);
					accInfoSQL = sql.substring(i + 1, sql.length());
					System.out.println(accInfoSQL);
					break;
				}
			}
			
			try
			{
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(userInfoSQL);
				System.out.println("User Query Executed");
				// Initialize result strings
				String fName = "";
				String mInit = "";
				String lName = "";
				String streetName = "";
				String city = ""; 
				String state = "";
				String zipCode = "";
				String phone = "";
				String extension = "";
				String email = "";
				String pass = "";
				if(rs.next())
				{
					fName = rs.getString("Fname");
					mInit = rs.getString("Minit");
					lName = rs.getString("Lname");
					streetName = rs.getString("StreetName");
					city = rs.getString("City");
					state = rs.getString("State");
					zipCode = rs.getString("ZipCode");
					phone = rs.getString("Phone");
					extension = rs.getString("Extension");
				}
				rs = stmt.executeQuery(accInfoSQL);
				System.out.println("Account Query Executed");
				if(rs.next())
				{
					email = rs.getString("Email");
					pass = rs.getString("Password");
				}
				String parseableResults = fName + "|" + mInit + "|" + lName + "|" + streetName + "|" + city + "|" + state
						+ "|" + zipCode + "|" + phone + "|" + extension + "|" + email + "|" + pass + "|";
				resultString = parseableResults;
				System.out.println("All products: " + resultString);
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(requestCode == createUserSQL)
		{
			System.out.println("Querying:");
			
			String userUpdateSQL = "";
			String accUpdateSQL = "";
			for(int i = 0; i < sql.length() - 1; i++)
			{
				if(sql.charAt(i) == '|')
				{
					userUpdateSQL = sql.substring(0, i - 1);
					accUpdateSQL = sql.substring(i + 1, sql.length() - 1);
				}
			}
			System.out.println(userUpdateSQL);
			System.out.println(accUpdateSQL);
			
			// create user
			try
			{
				//create the statement object
				Statement stmt = con.createStatement();
				int rsUser = stmt.executeUpdate(userUpdateSQL);
				int rsAcc = stmt.executeUpdate(accUpdateSQL);
				System.out.println("Query Executed");
				resultString = Integer.toString(rsUser) + "|" + Integer.toString(rsAcc);
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(requestCode == getNewID)
		{
			System.out.println("Querying:");
			System.out.println(sql);
			
			// Get new ID for account creation
			try
			{
				sql = "select * from ACCOUNTS where AcID = (select max(AcID) from ACCOUNTS)";
				//create the statement object
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				System.out.println("Query Executed");
				if(rs.next())
				{
					resultString = rs.getString("AcID");
					System.out.println("Row results: " + resultString);
				}
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Returning results");
		return resultString;
	}
}
