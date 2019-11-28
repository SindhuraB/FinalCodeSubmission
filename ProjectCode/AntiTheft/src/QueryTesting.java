import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueryTesting extends DatabaseQuerying{

	public QueryTesting(String requestInfo) 
	{
		super(requestInfo);
	}

	public static void main(String[] args) {
		// Create database querying object
		String request = "0";
		DatabaseQuerying queryMaker = new DatabaseQuerying(request);
		String results = queryMaker.result;
		System.out.println("Connection ended " + results);
		
		/*
		int newAccNum = -1;
		try 
		{
			newAccNum = rs.getInt("AcID");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		System.out.println(newAccNum);
			
		// Iterate through item descriptions
		ArrayList<String> itemDesc = queryMaker.selectProducts(1);
		for(int i = 0; i < itemDesc.size(); i++)
			System.out.println(itemDesc.get(i));
		// Call method to create new user
		queryMaker.createNewUser("cool@cool.com", "cool123", "Jeff", "J", "Jeffery", 
				"123 Cool St.", "Plano", "TX", 75080, 123456789, 1);
		*/
	}
}
