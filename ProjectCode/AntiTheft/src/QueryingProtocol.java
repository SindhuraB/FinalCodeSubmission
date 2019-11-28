import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryingProtocol {

	public static int waiting = 0;
	public static int query = 1;
	
	public String newNumSQL = "0";
	public String productsSQL = "1";
	public String userInfoSQL = "2";
	public String accInfoSQL = "3";
	public String loginSQL = "4";
	public String createUserSQL = "5";
	
	public static int state = waiting;
	
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
		System.out.println("Querying:");
		System.out.println(sql);
		Connection con = dbCon();
		String resultString = "";
		
		if(sql.equals("Shutdown"))
		{
			resultString = "Shutdown";
			state = waiting;
		}
		else if(sql.equals(newNumSQL))
		{
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
				System.out.println();
			}
			state = waiting;
			sql = "";
		}
		else if(sql.equals(productsSQL))
		{
			
		}
		else if(sql.equals(userInfoSQL))
		{
			
		}
		else if(sql.equals(accInfoSQL))
		{
			
		}
		else if(sql.equals(createUserSQL))
		{
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
				System.out.println();
			}
		}
		System.out.println("Returning results");
		return resultString;
	}
}
