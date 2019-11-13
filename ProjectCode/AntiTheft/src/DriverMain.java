// This is the class for setting up entire application
// Coded by: Christopher Guerra, Varika Pinnam
//Test comment by: Sindhura Boppudi
// >>>>>>> 623c8dea3783e2084652f0f577a4307fdb260c87

public class DriverMain {

		public static void main (String[] args) {
		
		//log person in
		Login.login();
		int id = User.getUserID();
		//show their items
		Product.DisplayItems(id);
		System.out.println("Test");
		
		//allow them to add item
		
		//or track
		
		
		

	}
}
