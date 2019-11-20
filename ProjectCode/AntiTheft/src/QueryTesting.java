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
	}

}
