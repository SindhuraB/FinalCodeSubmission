//Partners: Varika & Junior

import java.util.*;

public class Product extends User{

	
	static HashMap< Integer, String > products = new HashMap<>();

	 
		static public String CreateProduct (Integer id, String brand, String descrip) {
			
			
					products.put(id, (brand + " - " + descrip));
					System.out.println("Product created");
					//user.numOfProdOwned++;
					
					String display = products.get(id);
			
			return display;
			
		}
	
		
		public static void DisplayItems(Integer id) {
			
		
			System.out.println(products.get(id));
			
			
		}
		
		
		
		
		
}
