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
		
		/*
		public static void RemoveProduct (User user) {
			
			System.out.println("To remove a product from your account, enter your unique user ID");
			
			Integer id = input.nextInt();
			
			if (products.containsKey(id)) {
				//logically, user would click on the item in the GUI but for back-end, it's like entering it/choosing it?
				
			
			}
			
			if (!(products.get(id).equals(product))) {
	            throw new NoSuchElementException();
	        }
			else
				products.remove(id,product);
			
		}
		*/
		
		
		
}
