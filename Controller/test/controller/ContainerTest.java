/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeroen
 */
public class ContainerTest {
    
    public ContainerTest() {
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
     * Test of getAankomst_datum method, of class Container.
     */
    @Test
    public void testGetAankomst_datum() {
        System.out.println("getAankomst_datum");
        Container instance = new Container("9-12-2004","0.00-0.10" , "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);
        String expResult = "9-12-2004";
        String result = instance.getAankomst_datum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAankomst_tijd method, of class Container.
     */
    @Test
    public void testGetAankomst_tijd() {
        System.out.println("getAankomst_tijd");
        
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "0.00-0.10";
        String result = instance.getAankomst_tijd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAankomst_vervoer method, of class Container.
     */
    @Test
    public void testGetAankomst_vervoer() {
        System.out.println("getAankomst_vervoer");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test2";
        String result = instance.getAankomst_vervoer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAankomst_bedrijf method, of class Container.
     */
    @Test
    public void testGetAankomst_bedrijf() {
        System.out.println("getAankomst_bedrijf");
        
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test3";
        String result = instance.getAankomst_bedrijf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVertrek_datum method, of class Container.
     */
    @Test
    public void testGetVertrek_datum() {
        System.out.println("getVertrek_datum");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test4";
        String result = instance.getVertrek_datum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVertrek_tijd method, of class Container.
     */
    @Test
    public void testGetVertrek_tijd() {
        System.out.println("getVertrek_tijd");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test5";
        String result = instance.getVertrek_tijd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVertrek_vervoer method, of class Container.
     */
    @Test
    public void testGetVertrek_vervoer() {
        System.out.println("getVertrek_vervoer");
       
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test6";
        String result = instance.getVertrek_vervoer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVertrek_bedrijf method, of class Container.
     */
    @Test
    public void testGetVertrek_bedrijf() {
        System.out.println("getVertrek_bedrijf");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test7";
        String result = instance.getVertrek_bedrijf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEigenaar method, of class Container.
     */
    @Test
    public void testGetEigenaar() {
        System.out.println("getEigenaar");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test8";
        String result = instance.getEigenaar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContainer_nr method, of class Container.
     */
    @Test
    public void testGetContainer_nr() {
        System.out.println("getContainer_nr");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        int expResult = 9;
        int result = instance.getContainer_nr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGewicht_leeg method, of class Container.
     */
    @Test
    public void testGetGewicht_leeg() {
        System.out.println("getGewicht_leeg");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        int expResult = 10;
        int result = instance.getGewicht_leeg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGewicht_inhoud method, of class Container.
     */
    @Test
    public void testGetGewicht_inhoud() {
        System.out.println("getGewicht_inhoud");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        int expResult = 11;
        int result = instance.getGewicht_inhoud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInhoud method, of class Container.
     */
    @Test
    public void testGetInhoud() {
        System.out.println("getInhoud");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test12";
        String result = instance.getInhoud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSoort method, of class Container.
     */
    @Test
    public void testGetSoort() {
        System.out.println("getSoort");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test13";
        String result = instance.getSoort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGevaar method, of class Container.
     */
    @Test
    public void testGetGevaar() {
        System.out.println("getGevaar");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test14";
        String result = instance.getGevaar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getISO method, of class Container.
     */
    @Test
    public void testGetISO() {
        System.out.println("getISO");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        String expResult = "test15";
        String result = instance.getISO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Container.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        int expResult = 16;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Container.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        int expResult = 17;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getZ method, of class Container.
     */
    @Test
    public void testGetZ() {
        System.out.println("getZ");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        int expResult = 18;
        int result = instance.getZ();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDeparture_date method, of class Container.
     */
    @Test
    public void testGetDeparture_date() {
        System.out.println("getDeparture_date");
        Container instance = new Container("9-12-2004", "0.00-0.10", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 9, 10, 11, "test12", "test13", "test14", "test15", 16, 17, 18, 2, 5, 2013);

        Date expResult = new Date(2013, 5, 2);
//        
//        expResult.setDate(2);
//        expResult.setMonth(5);
//        expResult.setYear(2013);
        Date result = instance.getDeparture_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}