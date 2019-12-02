import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RowsUpdated {

	@Test
	void test() {
		QueryMethods queryTest = new QueryMethods();
		String id = queryTest.getNewID();
		int rows = Integer.parseInt(id);
		assertEquals(2, id);
		//System.out.println(rows);
	}

}
