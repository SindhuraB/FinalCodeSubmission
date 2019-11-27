import java.util.ArrayList;

public class QueryTesting extends DatabaseQuerying{

	public static void main(String[] args) {
		// Create DatabaseQuerying Object
		DatabaseQuerying queryMaker = new DatabaseQuerying();
		// Iterate through item descriptions
		ArrayList<String> itemDesc = queryMaker.selectProducts();
		for(int i = 0; i < itemDesc.size(); i++)
			System.out.println(itemDesc.get(i));
		
		int newAccNum = queryMaker.getNewID();
		System.out.println(newAccNum);
		
		queryMaker.createNewUser("cool@cool.com", "cool123", "Jeff", "J", "Jeffery", 
				"123 Cool St.", "Plano", "TX", 75080, 123456789, 1, newAccNum);
	}
}
