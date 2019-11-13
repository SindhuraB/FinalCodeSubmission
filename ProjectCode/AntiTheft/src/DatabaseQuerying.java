import java.sql.*;

public class DatabaseQuerying {

	public static void main(String args[]) {
		try {
			//load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//create the connection object
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/orclpdb", "TAGCOMPDBA", "minigrr1");
			//create the statement object 
			Statement stmt = con.createStatement();
			//execute query; update the '1' to variable input from GUI
			ResultSet rs = stmt.executeQuery("select * from USER_TAGS where ACCOUNTID = '1'");
			//close the connection object
			con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
}
