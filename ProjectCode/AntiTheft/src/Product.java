//Partners: Varika & Junior

import java.util.*;

public class Product extends User{

	
	static HashMap< Integer, String > products = new HashMap<>();

	 
		public void CreateProduct (Integer id) {
			
			System.out.println("Enter the name or title of the product you are registering");
			
			String product = input.next();
			
			products.put(id, product);
			
			
		}
	
		
		public static void DisplayItems(Integer id) {
			
			
			System.out.println("test display");
			products.get(id);
		}
		
		
		public static void RemoveProduct (Integer id, String product) {
			
			products.remove(id,product);
			
		}
		
		
		
}
