import java.net.*;
import java.io.*;

// Coded by: Chris Guerra and Labeeba Rana
// This class creates a connection and queries the database

public class DatabaseQuerying{
	// Initialize client socket and input/output streams
	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream output = null;
	
	public String run(String requestInfo)
	{
		String result = "";
		try
		{
			// Connect to database server and setup input/output streams
			System.out.println("Connecting to: serverConnection.dynu.net");
			socket = new Socket("serverConnection.dynu.net", 5000);
			socket.setSoTimeout(10000);
			System.out.println("Connected");
			input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
			System.out.println("Sending request: " + requestInfo);
			
			// Send request to server
			try
			{
				// Write sql string for query to output
				output.writeUTF(requestInfo);
				output.flush();
				System.out.println("Request sent");
			}
			catch(IOException i)
			{
				System.out.println(i);
			}
			result = input.readUTF();
			System.out.println("Results received");
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
}