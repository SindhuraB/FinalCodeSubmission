import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitQueryMethodsTest {

	@Test
	void test() {
		QueryMethods newID = new QueryMethods();
		assertNotNull(newID.getNewID());
	}

}
