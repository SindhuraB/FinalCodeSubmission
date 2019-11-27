import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;

public class QueryServer {
	private Socket socket = null;
	private ServerSocket server = null;
	private DataInputStream input = null;
	
	public static Connection openCon ()
	{
		try {
			//load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
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

	public QueryServer(int port) throws IOException
	{
		try
		{
			server = new ServerSocket(1521);
			System.out.println("Server started");
			server.setSoTimeout(10000);
			System.out.println("Waiting for client connection...");
			
			socket = server.accept();
			System.out.println("Client connection accepted");
			// Take input from client socket
			input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			String sql = "";
			
			// Reads from client until end is sent
			while(!sql.equals("End"))
			{
				try
				{
					sql = input.readUTF();
					try
					{
					// Open connection
					Connection con = openCon();
					//create the statement object
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					con.close();
					}
					catch(Exception e)
					{
						System.out.println();
					}
				}
				catch(IOException i)
				{
					System.out.println(i);
				}
				
			}
			System.out.println("Closing connection");
			
			// close connection
			socket.close();
			input.close();
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}
	
	public void main(String[] args) 
	{
		try 
		{
			QueryServer server = new QueryServer(5000);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
