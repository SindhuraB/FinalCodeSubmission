import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


class productjunit {

	@Test
	public void test() {

		
		User one = new User ("pinnam@utdallas.edu", "pinnampass");
		int prodold = one.numOfProdOwned;
		Product.CreateProduct(1, "Mac", "laptop");
		int prodnew = one.numOfProdOwned;
		assertEquals(prodold +1, prodnew);
		
		
		
	
		
		
	}

}
