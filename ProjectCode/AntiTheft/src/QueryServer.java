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
	private ObjectOutputStream output = null;
	private Connection con;

	public QueryServer(int port) throws IOException
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
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection made to PDB");
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		try
		{	
			server = new ServerSocket(port);
			System.out.println("Server started");
			server.setSoTimeout(100000);
			System.out.println("Waiting for client connection...");
			
			socket = server.accept();
			System.out.println("Client connection accepted");
			System.out.println("Closing connection");
			
			// Take input from client socket
			input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			String sql = "";
			
			// Reads from client until end is sent
			while(!sql.equals("End"))
			{
				try
				{
					sql = input.readUTF();
					System.out.println("Querying:");
					System.out.println(sql);
				}
				catch(IOException i)
				{
					System.out.println(i);
				}
				try
				{
					//create the statement object
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					System.out.println("Query Executed");
					output.writeObject(rs);
					System.out.println("Sending results");
					con.close();
				}
				catch(Exception e)
				{
					System.out.println();
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
	
	public static void main(String[] args) 
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
