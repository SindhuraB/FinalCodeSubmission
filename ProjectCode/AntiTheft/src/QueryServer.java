import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;

public class QueryServer {
	
	public static void main(String[] args)
	{
		Connection con = null;
		ServerSocket server;
		Socket socket;
		DataInputStream input;
		DataOutputStream output;
		try
		{	
			server = new ServerSocket(5000);
			System.out.println("Server started");
			System.out.println("Waiting for client connection...");
			
			socket = server.accept();
			System.out.println("Client connection accepted");
			input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			output = new DataOutputStream(socket.getOutputStream());
			
			// Input and output strings
			String sql, outputLine;
			
			QueryingProtocol QP = new QueryingProtocol();
		    outputLine = QP.processInput(null);
			
			// Reads from client until end is sent
			while((sql = input.readUTF()) != null)
			{
				outputLine = QP.processInput(sql);
				output.writeUTF(outputLine);
				if(outputLine.equals("Shutdown"))
					break;
			}
			System.out.println("Closing connection");
			
			// close connection
			socket.close();
			input.close();
			output.close();
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}

}
