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

/**
 *
 * @author sithumwejesinghe
 */
public class newBookTest {
    
    public newBookTest() {
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
        newBook.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getBookID method, of class newBook.
     */
    @Test
    public void testGetBookID() {
        System.out.println("getBookID");
        newBook instance = new newBook();
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
        newBook instance = new newBook();
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
        newBook instance = new newBook();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getPublishedYear method, of class newBook.
     */
    @Test
    public void testGetPublishedYear() {
        System.out.println("getPublishedYear");
        newBook instance = new newBook();
        String expResult = "";
        String result = instance.getPublishedYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getPrice method, of class newBook.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        newBook instance = new newBook();
        String expResult = "";
        String result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
