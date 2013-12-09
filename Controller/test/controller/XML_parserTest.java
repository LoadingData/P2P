/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
public class XML_parserTest {
    
    public XML_parserTest() {
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
     * Test of xml_values method, of class XML_parser.
     */
    @Test
    public void testXml_values() {
        System.out.println("xml_values");
        String xml = "hoi";
        XML_parser instance = new XML_parser(xml);
        instance.xml_values(xml);
        // TODO review the generated test code and remove the default call to fail.
        
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createContainer method, of class XML_parser.
     */
    @Test
    public void testCreateContainer() {
        System.out.println("createContainer");
        
        XML_parser instance = new XML_parser("hoi");
        for(int i = 0; i < instance.getAantalContainers();i++)
        {
            Map info = instance.info();
            Container expResult = instance.getContainer(i);
            Container result = instance.createContainer(info);
            assertEquals(expResult, result);        
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContainer method, of class XML_parser.
     */
    @Test
    public void testGetContainer() {
        System.out.println("getContainer");
        int id = 0;
        XML_parser instance = new XML_parser("hoi");
        instance.xml_values("hoi");
        Container expResult = instance.getContainer(0);
        Container result = instance.getContainer(0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAantalContainers method, of class XML_parser.
     */
    @Test
    public void testGetAantalContainers() {
        System.out.println("getAantalContainers");
        XML_parser instance = new XML_parser("hoi");
        instance.xml_values("hoi");
        //xml1!
        int expResult = 10;
        int result = instance.getAantalContainers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sendList method, of class XML_parser.
     */
    @Test
    public void testSendList() {
        System.out.println("sendList");
        XML_parser instance = new XML_parser("hoi");
        
        List expResult = instance.getContainerArray();
        List result = instance.sendList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContainerArray method, of class XML_parser.
     */
    @Test
    public void testGetContainerArray() {
        System.out.println("getContainerArray");
        XML_parser instance = new XML_parser("hoi");
        
        ArrayList expResult = instance.getContainerArray();
        ArrayList result = instance.getContainerArray();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}