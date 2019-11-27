//Partners: Varika & Junior

import java.util.*;

public class Product extends User{

	
	static HashMap< Integer, String > products = new HashMap<>();

	 
		static public void CreateProduct (String email) {
			
			System.out.println("To register a new product, enter your unique user ID");
		
			Integer id = input.nextInt();
			
			
			if (database.get(email).intValue() == id.intValue())
				{
			
					input.nextLine();
					System.out.println("Enter the brand for the product you are registering");
			
					String brand = input.nextLine();
					
					System.out.println("Enter a short description for the product you are registering");
					String descrip = input.nextLine();
			
					products.put(id, (brand + " - " + descrip));
			
			}
			
			else
				System.out.println("Your id is incorrect. Please try again");
			
			
		}
	
		
		public static void DisplayItems(String email) {
			
			System.out.println("To view your complete list of products, enter your unique user ID");

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
