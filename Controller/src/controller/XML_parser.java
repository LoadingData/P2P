/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Jeroen
 */
public class XML_parser {
    
    private String document;  
    private int aantalContainers =0;
    private Map<String, String> info_map = new HashMap<String, String>();
    List<HashMap<String, String>> container = new ArrayList<HashMap<String, String>>();
    private ArrayList<Container> containerArray = new ArrayList<>();
    
    
    
    public XML_parser(String xml)
    {
        this.document = xml;
        
    }
    
    public void xml_values(String xml)
    {
        String d;
        String m;
        String j;
        
        String van;
        String tot;

        
            try {

        File fXmlFile = new File("C:\\Users\\Jeroen\\Desktop\\Containing\\XML\\xml1.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile); 
	
	doc.getDocumentElement().normalize(); 
 
	NodeList nl = doc.getElementsByTagName("record");
 
	System.out.println("----------------------------");
        
        
        
 
	for (int i = 0; i < nl.getLength(); i++) {
                info_map.clear();
                aantalContainers++;
		Node node = nl.item(i);
 
		System.out.println("\nCurrent Element :" + node.getNodeName());
 
                if (node.getNodeType() == Node.ELEMENT_NODE) {                    
                    
                    Element eElement = (Element) node;                    
                    
                    // <record>
                    // <aankomst>
                    // <d>,<m>,<j>
                    d = eElement.getElementsByTagName("d").item(0).getTextContent();
                    m = eElement.getElementsByTagName("m").item(0).getTextContent();
                    j = eElement.getElementsByTagName("j").item(0).getTextContent();   

                    info_map.put("aankomst_datum", getDate(d,m,j));                  
                    // </d>,</m>,</j>
                    // <tijd>
                    van = eElement.getElementsByTagName("van").item(0).getTextContent();
                    tot = eElement.getElementsByTagName("tot").item(0).getTextContent();
                    info_map.put("aankomst_tijd", getTime(van,tot));
                    // </tijd>
                    // <vervoer>
                    info_map.put("aankomst_vervoer", eElement.getElementsByTagName("soort_vervoer").item(0).getTextContent());
                    Log(eElement.getElementsByTagName("soort_vervoer").item(0).getTextContent(), eElement.getElementsByTagName("soort_vervoer").item(0).getNodeName());
                    // </vervoer>
                    // <bedrijf>
                    info_map.put("aankomst_bedrijf", eElement.getElementsByTagName("bedrijf").item(0).getTextContent());
                    Log(eElement.getElementsByTagName("bedrijf").item(0).getTextContent(), eElement.getElementsByTagName("bedrijf").item(0).getNodeName());
                    // </bedrijf>
                    // <x>,<y>,<z>
                    info_map.put("aankomst_X", eElement.getElementsByTagName("x").item(0).getTextContent());  
                    Log(eElement.getElementsByTagName("x").item(0).getTextContent(), eElement.getElementsByTagName("x").item(0).getNodeName());
                    info_map.put("aankomst_Y", eElement.getElementsByTagName("y").item(0).getTextContent());    
                    Log(eElement.getElementsByTagName("y").item(0).getTextContent(), eElement.getElementsByTagName("y").item(0).getNodeName());
                    info_map.put("aankomst_Z", eElement.getElementsByTagName("z").item(0).getTextContent());
                    Log(eElement.getElementsByTagName("z").item(0).getTextContent(), eElement.getElementsByTagName("z").item(0).getNodeName());
                    // </x>,</y>,</z>
                    //</aankomst>
                    
                    //<vertrek>
                    // <d>,<m>,<j>
                    d = eElement.getElementsByTagName("d").item(1).getTextContent();
                    m = eElement.getElementsByTagName("m").item(1).getTextContent();
                    j = eElement.getElementsByTagName("j").item(1).getTextContent(); 
                    info_map.put("dag", eElement.getElementsByTagName("d").item(1).getTextContent());  
                    info_map.put("maand", eElement.getElementsByTagName("m").item(1).getTextContent());
                    info_map.put("jaar", eElement.getElementsByTagName("j").item(1).getTextContent());
                    info_map.put("vertrek_datum", getDate(d,m,j));
                    // </d>,</m>,</j>
                    // <tijd>  
                    van = eElement.getElementsByTagName("van").item(1).getTextContent();
                    tot = eElement.getElementsByTagName("tot").item(1).getTextContent();
                    info_map.put("vertrek_tijd", getTime(van, tot));                   
                    // </tijd>
                    // <vervoer>
                    info_map.put("vertrek_vervoer", eElement.getElementsByTagName("soort_vervoer").item(1).getTextContent());
                    Log(eElement.getElementsByTagName("soort_vervoer").item(1).getTextContent(), eElement.getElementsByTagName("soort_vervoer").item(1).getNodeName());
                    // </vervoer>
                    // <bedrijf>
                    info_map.put("vertrek_bedrijf", eElement.getElementsByTagName("bedrijf").item(1).getTextContent());
                    Log(eElement.getElementsByTagName("bedrijf").item(1).getTextContent(), eElement.getElementsByTagName("bedrijf").item(1).getNodeName());
                    // </bedrijf>
                    // </vertrek>            
                    
                    // <eigenaar>
                    // <naam>
                    info_map.put("naam_eigenaar", eElement.getElementsByTagName("naam").item(1).getTextContent());
                    Log(eElement.getElementsByTagName("naam").item(0).getTextContent(), eElement.getElementsByTagName("naam").item(0).getNodeName());
                    // </naam>
                    // <containernr>
                    info_map.put("containernr", eElement.getElementsByTagName("containernr").item(0).getTextContent());
                    Log(eElement.getElementsByTagName("containernr").item(0).getTextContent(), eElement.getElementsByTagName("containernr").item(0).getNodeName());
                    // </containernr>
                    // </eigenaar>
                    
                    // <gewicht>
                    // <leeg>
                    info_map.put("gewicht_leeg", eElement.getElementsByTagName("leeg").item(0).getTextContent());
                    Log(eElement.getElementsByTagName("leeg").item(0).getTextContent(), eElement.getElementsByTagName("leeg").item(0).getNodeName());
                    // </leeg>
                    // <inhoud>
                    info_map.put("gewicht_inhoud", eElement.getElementsByTagName("inhoud").item(0).getTextContent());
                    Log(eElement.getElementsByTagName("inhoud").item(0).getTextContent(), eElement.getElementsByTagName("inhoud").item(0).getNodeName());
                    // </inhoud>
                    // </gewicht>
                    
                    // <inhoud>
                    // <naam>
                    info_map.put("naam_inhoud", eElement.getElementsByTagName("naam").item(1).getTextContent());
                    Log(eElement.getElementsByTagName("naam").item(1).getTextContent(), eElement.getElementsByTagName("naam").item(1).getNodeName());
                    // </naam>
                    // <soort>
                    info_map.put("soort", eElement.getElementsByTagName("soort").item(0).getTextContent());
                    Log(eElement.getElementsByTagName("soort").item(0).getTextContent(), eElement.getElementsByTagName("soort").item(0).getNodeName());
                    // </soort>
                    // <gevaar>
                    info_map.put("gevaar", eElement.getElementsByTagName("gevaar").item(0).getTextContent());
                    Log(eElement.getElementsByTagName("gevaar").item(0).getTextContent(), eElement.getElementsByTagName("gevaar").item(0).getNodeName());
                    // </gevaar>
                    // </inhoud>
                    
                    // <ISO>
                    info_map.put("ISO", eElement.getElementsByTagName("ISO").item(0).getTextContent());
                    Log(eElement.getElementsByTagName("ISO").item(0).getTextContent(), eElement.getElementsByTagName("ISO").item(0).getNodeName());
                    // </ISO>
                    // </record>
                    
                    //de map toevegen aan de lijst.
                    container.add(i, (HashMap<String, String>) info_map);
                    //een container aanmaken die elke eigenschap bevat
                    //dit kan in de forloop gebeuren of in de methode, beste manier is ?
                    containerArray.add(createContainer(info_map));
                    
                    System.out.println("Grootte List van Maps: " + container.size());
                    
                }	
	}
        System.out.println("Aantal keer ge'loopt: " + aantalContainers);
        System.out.println("Aantal objecten Containers in de ArrayList: "+ containerArray.size());
        
    } catch (Exception e) {
	e.printStackTrace();
    }
        
    }
    
    private String getDate(String day, String month, String year)
    {
        String datum = day+ "-" + month + "-20" + year;
        System.out.println("Datum: " + datum);
        return datum;
    }
    
    private String getTime(String van, String tot)
    {
        String time = van + "-" + tot;
        System.out.println("Tijd: " + time);
        return time;
    }
    
    private void Log(String string, String naam)
    {
        System.out.println(naam.toUpperCase() + ": " + string);
    }
    
    public Container createContainer(Map info)
    {       
       Container container = new Container(info.get("aankomst_datum").toString(),info.get("aankomst_tijd").toString(),info.get("aankomst_vervoer").toString(),info.get("aankomst_bedrijf").toString(),info.get("vertrek_datum").toString(),info.get("vertrek_tijd").toString(),
               info.get("vertrek_vervoer").toString(),info.get("vertrek_bedrijf").toString(),info.get("naam_eigenaar").toString(),Integer.parseInt(info.get("containernr").toString()),Integer.parseInt(info.get("gewicht_leeg").toString()),Integer.parseInt(info.get("gewicht_inhoud").toString()),info.get("naam_inhoud").toString(),
               info.get("soort").toString(),info.get("gevaar").toString(),info.get("ISO").toString(),Integer.parseInt(info.get("aankomst_X").toString()),Integer.parseInt(info.get("aankomst_Y").toString()),Integer.parseInt(info.get("aankomst_Z").toString()),Integer.parseInt(info.get("dag").toString()),Integer.parseInt(info.get("maand").toString()),
               Integer.parseInt(info.get("jaar").toString()));
       return container;
    }
    
    public Container getContainer(int id)
    {        
        return containerArray.get(id);
    }
    
    public int getAantalContainers()
    {
        return containerArray.size();
    }
    
    public List<HashMap<String, String>> sendList()
    {
        return container;
    }
    
    public ArrayList<Container> getContainerArray()
    {
        return containerArray;
    }
    
    //dit is alleen voor de test!
    public Map info()
    {
        return info_map;
    }
}
