/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chris H
 */
public class StorageTest {
    
    public StorageTest() {
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
     * Test of checkAvailableDepot method, of class Storage.
     */
    @Test
    public void testCheckAvailableDepot() {
        
        
        System.out.println("checkAvailableDepot");
        Container container = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);
        Storage instance = new Storage();
        int expResult = 0;
        int result = instance.checkAvailableDepot(container);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of storeContainer method, of class Storage.
     */
    @Test
    public void testStoreContainer() {
        System.out.println("storeContainer");
        Container container = null;
        int depotRow = 0;
        Storage instance = new Storage();
        int[] expResult = null;
        int[] result = instance.storeContainer(container, depotRow);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pickUpContainer method, of class Storage.
     */
    @Test
    public void testPickUpContainer() {
        System.out.println("pickUpContainer");
        Storage instance = new Storage();
        int[] expResult = null;
        int[] result = instance.pickUpContainer();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}