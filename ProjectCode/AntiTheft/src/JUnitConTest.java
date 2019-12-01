import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.Socket;

import org.junit.jupiter.api.Test;

class JUnitConTest {
	private Socket socket = null;
	@Test
	void test() {
		try
		{
			// Connect to database server and setup input/output streams
			System.out.println("Connecting to: serverConnection.dynu.net");
			socket = new Socket("serverConnection.dynu.net", 80);
			assertNull(socket.getRemoteSocketAddress());	
		}
		catch(IOException i)
		{
			System.out.println(i);
		}	
	}

}
