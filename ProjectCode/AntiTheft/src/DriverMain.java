// This is the class for setting up entire application
// Coded by: Christopher Guerra, Varika Pinnam
//Test comment by: Sindhura Boppudi
// >>>>>>> 623c8dea3783e2084652f0f577a4307fdb260c87


public class DriverMain extends User {
		public static void main (String[] args) {
			
			
			
			//create new user for each person
			User one = new User();
			
			
			
			//making an account
			one.createAccount();
			//test displaying account info
			one.getname();
			one.getAddress();
			
			//log person in
			Login.login();
			
			
			Product.CreateProduct(one.getemail());
			Product.DisplayItems(one.getemail());
			
			
			
			//allow them to add item
			
			//or track
			
			
			
	
		}

}
