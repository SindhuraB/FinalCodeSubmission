import java.net.*;
import java.io.*;

public class QueryServer implements Runnable{
	
	protected String sql = ""; // Received sql query
	protected int serverPort = 80;
	protected ServerSocket serverSocket = null;
    protected boolean isStopped = false;
    protected Thread runningThread = null; // Thread for server
    // Input / output streams for data sent / received
    DataInputStream input = null;
	DataOutputStream output = null;
    
    public QueryServer(int port)
    {
    	this.serverPort = port;
    }
    // Run server
    public void run()
    {
    	synchronized(this) 
    	{this.runningThread = Thread.currentThread();}
    	openServerSocket();
    	// run until server stop command is sent
    	while(!isStopped())
    	{
    		Socket clientSocket = null;
    		try
    		{
    			System.out.println("Waiting for connection...");
    			clientSocket = this.serverSocket.accept();
    			System.out.println("Just connected to "
    	                  + clientSocket.getRemoteSocketAddress());
    		}
    		catch(IOException e)
    		{
    			if(isStopped())
    			{
    				System.out.println("Server Stopped");
    				return;
    			}
    			throw new RuntimeException("Error accepting client connection", e);
    		}
    		try
    		{
    			processQueryRequest(clientSocket);
    		}
    		catch(Exception e)
    		{
    			System.out.println("Log: " + e);
    		}
    	}
    	
    	System.out.println("Server Stopped");
    }
    
    // Receive input and process, the nreturn results
    private void processQueryRequest(Socket clientSocket) throws Exception
    {
    	input = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
		output = new DataOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));
		sql = input.readUTF();
		System.out.println(sql);
		
		stop(); // Check for stop command
    	
		String outputLine;
    	QueryingProtocol QP = new QueryingProtocol();
	    
	    outputLine = QP.processInput(sql);
		output.writeUTF(outputLine);
		output.flush();
		
		output.close();
		input.close();
		System.out.println("Request processed");
    }
    
    private synchronized boolean isStopped()
    {
    	return this.isStopped;
    }
    // Check for server shutdown command, if received then close serve socket to shutdown
    public synchronized void stop()
    {
    	System.out.println("Checking for server shutdown command");
    	if(sql.equals("Shutdown"))
	    {
    		this.isStopped = true;
        	try
        	{
        		this.serverSocket.close();
        	}
        	catch(IOException e)
        	{
        		throw new RuntimeException("Error closing server", e);
        	}
        	System.out.println("Server shutdown");
	    }
    }
    // Open server socket for client connections
    private void openServerSocket()
    {
    	try
    	{
    		this.serverSocket  = new ServerSocket(this.serverPort);
    	}
    	catch(IOException e)
    	{
    		throw new RuntimeException("Cannot open port 80", e);
    	}
    }
    // Start server thread
	public static void main(String[] args)
	{
		QueryServer server = new QueryServer(80);
		new Thread(server).start();
	}
}
