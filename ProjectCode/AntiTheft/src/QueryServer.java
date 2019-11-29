import java.net.*;
import java.io.*;

public class QueryServer implements Runnable{
	
	protected String sql = "";
	protected int serverPort = 5000;
	protected ServerSocket serverSocket = null;
    protected boolean isStopped = false;
    protected Thread runningThread = null;
    
    DataInputStream input = null;
	DataOutputStream output = null;
    
    public QueryServer(int port)
    {
    	this.serverPort = port;
    }
    
    public void run()
    {
    	synchronized(this) 
    	{this.runningThread = Thread.currentThread();}
    	openServerSocket();
    	
    	while(!isStopped())
    	{
    		Socket clientSocket = null;
    		try
    		{
    			System.out.println("Waiting for connection...");
    			clientSocket = this.serverSocket.accept();
    			
    			input = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
        		output = new DataOutputStream(clientSocket.getOutputStream());
        		sql = input.readUTF();
        		System.out.println(sql);
        		stop();
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
    
    private void processQueryRequest(Socket clientSocket) throws Exception
    {
		String outputLine;
    	QueryingProtocol QP = new QueryingProtocol();
	    
	    outputLine = QP.processInput(sql);
		output.writeUTF(outputLine);
		
		output.close();
		input.close();
    }
    
    private synchronized boolean isStopped()
    {
    	return this.isStopped;
    }
    
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
    
    private void openServerSocket()
    {
    	try
    	{
    		this.serverSocket  = new ServerSocket(this.serverPort);
    	}
    	catch(IOException e)
    	{
    		throw new RuntimeException("Cannot open port 5000", e);
    	}
    }
	public static void main(String[] args)
	{
		QueryServer server = new QueryServer(5000);
		new Thread(server).start();
		
		try
		{
			Thread.sleep(10*1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		/*
		ServerSocket server;
		DataInputStream input;
		DataOutputStream output;
		try
		{	
			server = new ServerSocket(5000);
			System.out.println("Server started");
			System.out.println("Waiting for client connection...");
			Socket socket = server.accept();
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
		*/
	}

}