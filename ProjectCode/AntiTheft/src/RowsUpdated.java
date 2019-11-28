import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RowsUpdated {

	@Test
	void test() {
		DatabaseQuerying dbqTest = new DatabaseQuerying("5");
		int rows = dbqTest.accColChanged;
		assertEquals(3, rows);
	}

}
