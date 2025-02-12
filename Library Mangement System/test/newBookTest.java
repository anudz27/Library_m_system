/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NewBookTest {
    
    public NewBookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class newBook.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewBook.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getBookID method, of class newBook.
     */
    @Test
    public void testGetBookID() {
        System.out.println("getBookID");
        NewBook instance = new NewBook();
        String expResult = "";
        String result = instance.getBookID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class newBook.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        NewBook instance = new NewBook();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAuthor method, of class newBook.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        NewBook instance = new NewBook();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getPublishedYear method, of class newBook.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        NewBook instance = new NewBook();
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getPrice method, of class newBook.
     */
  
    
    
}