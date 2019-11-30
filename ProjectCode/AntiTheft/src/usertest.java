import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class usertest {

	@Test
	void test() {
		boolean output = User.valid("pinnampass");
		
		 int val;
		if (output)
			val = 1;
			
		else
			val = 0;
		
		assertEquals(0, val);
		
		
	}

}
