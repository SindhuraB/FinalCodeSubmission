//Partners: Varika & Junior

import java.util.*;

public class Product extends User{

	
	static HashMap< Integer, String > products = new HashMap<>();

	 
		static public void CreateProduct (String email) {
			
			System.out.println("To register a new product, enter your unique user ID");
			
			//N2S varika fix scanner input with full line of input for product description
			Integer id = input.nextInt();
			
			
			if (database.get(email).intValue() == id.intValue())
				{
			
					System.out.println("Enter a name for the product you are registering");
			
					String product = input.next();
			
					products.put(id, product);
			
			}
			
			else
				System.out.println("Your id is incorrect. Please try again");
			
			
		}
	
		
		public static void DisplayItems(String email) {
			
			System.out.println("To view your complete list of products, enter your unique user ID");
			
//N2S - varika fix scanner input with full line of input for product description
			Integer id = input.nextInt();
			
			if (database.get(email).intValue() == id.intValue())
				System.out.println(products.get(id));
			else
				System.out.println("Your id is incorrect. Please try again");
			
		}
		
		
		public static void RemoveProduct (Integer id, String product) {
			
			products.remove(id,product);
			
		}
		
		
		
}
