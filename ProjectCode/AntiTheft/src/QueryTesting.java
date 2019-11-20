import java.util.ArrayList;

public class QueryTesting extends DatabaseQuerying{

	public static void main(String[] args) {
		DatabaseQuerying queryMaker = new DatabaseQuerying();
		ArrayList<String> items = queryMaker.selectProducts();
		for(int i = 0; i < items.size(); i++)
			System.out.println(items.get(i));
		int newAccNum = queryMaker.getNewID();
		System.out.println(newAccNum);
	}

}
