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
			
		}
		else if(requestCode == productsSQL)
		{
			System.out.println("Querying:");
			System.out.println(sql);
			
		}
		else if(requestCode == userInfoSQL)
		{
			System.out.println("Querying:");
			System.out.println(sql);
			
		}
		else if(requestCode == createUserSQL)
		{
			System.out.println("Querying:");
			System.out.println(sql);
			
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
