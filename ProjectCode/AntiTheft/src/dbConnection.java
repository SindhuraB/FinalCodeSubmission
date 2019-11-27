import java.sql.*;
import javax.swing.*;

public class dbConnection {
	Connection conn=null;
		public static Connection dbConnector() 
		{
			try {
				Class.forName("org.sqlite.JDBC");
				Connection conn=DriverManager.getConnection("jbdc:sqlite:C:\\Users\\thelo\\Desktop\\My Database\\myDataBase.db.sqlite");
				JOptionPane.showMessageDialog(null,  "Connection to database successful");
				return conn;
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,  e);
				return null;
			}
		}
}
