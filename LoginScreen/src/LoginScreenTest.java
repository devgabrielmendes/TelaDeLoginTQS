import static org.junit.Assert.*;
import org.junit.Test;

public class LoginScreenTest {
	@Test
	public void testSuccessLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.login("jhon", "password123"));
	}
	
	@Test
	public void testFailedLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertFalse(loginScreen.login("jhon", "wrongpassword"));
	}
	
	@Test
	public void testAddUser() {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.addUser("testuser", "testpassword");
		assertTrue(loginScreen.login("testuser", "testpassword"));
	}

}
