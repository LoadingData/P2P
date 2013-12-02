/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Jeroen
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    
    public List<Container> containerList;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        XML_parser xml = new XML_parser("hoi");
        xml.xml_values("hoi"); 
        
        
        //Server server = new Server(xml.sendList());
        
        connectionHandler connection = new connectionHandler(xml.getContainerArray());   
    }
}
