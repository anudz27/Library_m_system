import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/C:\Users\Shashini anuththara\Downloads\chromedriver_win32");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleTitle() {
        // Open Google
        driver.get("https://www.google.com");

        // Check the title
        String title = driver.getTitle();
        assert title.equals("Google"): "Title should be Google";
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

