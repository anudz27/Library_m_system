import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sithumwejesinghe
 */
public class loginTest {
    
    private login loginForm;

    public loginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // This will run once before any of the tests start
    }
    
    @AfterClass
    public static void tearDownClass() {
        // This will run once after all the tests have completed
    }
    
    @Before
    public void setUp() {
        // This will run before each test method
        loginForm = new login();  // Initialize the login form
    }
    
    @After
    public void tearDown() {
        // This will run after each test method
        loginForm = null;  // Clean up the login form after each test
    }
    
    @Test
    public void testSuccessfulLogin() {
        // Simulate successful login
        loginForm.performLogin("admin", "1234");
        
        // Assert that the login form is not visible after a successful login
        assertFalse("Login form should not be visible after successful login", loginForm.isVisible());
    }
    
    @Test
    public void testFailedLogin() {
        // Simulate failed login
        loginForm.performLogin("wrongUser", "wrongPassword");
        
        // Assert that the login form is still visible after a failed login
        assertTrue("Login form should remain visible after failed login", loginForm.isVisible());
    }
}

