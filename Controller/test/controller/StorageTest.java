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
        Container container = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "zeeschip", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);
        Storage instance = new Storage();
        int expResult = 6;
        int result = instance.checkAvailableDepot(container);
        assertEquals(expResult, result);
        System.out.println(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of storeContainer method, of class Storage.
     */
    @Test
    public void testStoreContainer() {
        System.out.println("storeContainer");
        Container container = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "zeeschip", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);
        int depotRow = 6;
        Storage instance = new Storage();
        int[] expResult = {0, 0, 0};
        int[] result = instance.storeContainer(container, depotRow);
        assertArrayEquals(expResult, result);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pickUpContainer method, of class Storage.
     */
    @Test
    public void testPickUpContainer() {
        Container container = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "8-12-2014", "9-12-2004", "zeeschip", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 7, 5, 2013);
        Container container2 = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "9-12-2014", "9-12-2002", "zeeschip", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 5, 5, 2013);
        System.out.println("pickUpContainer");
        Storage instance = new Storage();
        instance.containerDepots.get(6).containerCluster[2][2][5] = container;
        instance.containerDepots.get(6).containerCluster[1][2][5] = container2;
        int[] expResult = {1, 2, 5};
        int[] result = instance.pickUpContainer();
        assertArrayEquals(expResult, result);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}