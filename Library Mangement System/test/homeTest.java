
import org.junit.Before;
import org.junit.Test;

import javax.swing.JButton;
import javax.swing.JFrame;
import static org.junit.Assert.*;

public class homeTest {
    
    private home homeFrame;

    @Before
    public void setUp() {
        // Create an instance of the home class and set it to be visible
        homeFrame = new home();
        homeFrame.setVisible(true);
    }

    @Test
    public void testNewStudentButton() {
        JButton newStudentButton = homeFrame.getNewStudentButton();
        assertNotNull("New Student button should not be null", newStudentButton);
        
        // Simulate a button click
        newStudentButton.doClick();
        
        // Add your assertions here to check if the expected outcome occurs
        // Example: Assert that a new window is opened or a variable is changed
    }

    @Test
    public void testNewBookButton() {
        JButton newBookButton = homeFrame.getNewBookButton();
        assertNotNull("New Book button should not be null", newBookButton);
        
        // Simulate a button click
        newBookButton.doClick();
        
        // Add assertions for expected outcomes
    }

    @Test
    public void testStatisticsButton() {
        JButton statisticsButton = homeFrame.getStatisticsButton();
        assertNotNull("Statistics button should not be null", statisticsButton);
        
        // Simulate a button click
        statisticsButton.doClick();
        
        // Add assertions for expected outcomes
    }

    @Test
    public void testIssueBookButton() {
        JButton issueBookButton = homeFrame.getIssueBookButton();
        assertNotNull("Issue Book button should not be null", issueBookButton);
        
        // Simulate a button click
        issueBookButton.doClick();
        
        // Add assertions for expected outcomes
    }

    @Test
    public void testReturnBookButton() {
        JButton returnBookButton = homeFrame.getReturnBookButton();
        assertNotNull("Return Book button should not be null", returnBookButton);
        
        // Simulate a button click
        returnBookButton.doClick();
        
        // Add assertions for expected outcomes
    }

    @Test
    public void testLogoutButton() {
        JButton logoutButton = homeFrame.getLogoutButton();
        assertNotNull("Logout button should not be null", logoutButton);
        
        // Simulate a button click
        logoutButton.doClick();
        
        // Add assertions for expected outcomes
    }
}



