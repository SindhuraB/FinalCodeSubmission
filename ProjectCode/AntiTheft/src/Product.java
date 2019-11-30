//Partners: Varika & Junior

import java.util.*;

public class Product extends User{

	
	static HashMap< Integer, String > products = new HashMap<>();

	 
		static public void CreateProduct (User user) {
			
			System.out.println("To register a new product, enter your unique user ID");
		
			Integer id = input.nextInt();
			
			
			if (database.get(user.getemail()).intValue() == id.intValue())
				{
			
					input.nextLine();
					System.out.println("Enter the brand for the product you are registering");
			
					String brand = input.nextLine();
					
					System.out.println("Enter a short description for the product you are registering");
					String descrip = input.nextLine();
			
					products.put(id, (brand + " - " + descrip));
					user.numOfProdOwned++;
			
			}
			
			else
				System.out.println("Your id is incorrect. Please try again");
			
			
		}
	
		
		public static void DisplayItems(User user) {
			
			System.out.println("To view your complete list of products, enter your unique user ID");

			Integer id = input.nextInt();
			
			if (database.get(user.getemail()).intValue() == id.intValue())
				System.out.println(products.get(id));
			else
				System.out.println("Your id is incorrect. Please try again");
			
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
