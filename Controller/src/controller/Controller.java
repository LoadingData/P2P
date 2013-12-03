/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jeroen
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    Container[][][] containerCluster1 = new Container[6][6][20];
    
    public List<Container> containerList;
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        XML_parser xml = new XML_parser("hoi");
        xml.xml_values("hoi"); 
        
        
        //Server server = new Server(xml.sendList());
        
        connectionHandler connection = new connectionHandler(xml.getContainerArray());   
    }
    public int[] storeContainer(Container container) {

        int[] position = null;
        Date currentContainerDate = container.getDeparture_date();
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 6; x++) {
                for (int z = 0; z < 20; z++) {

                    /*
                     * If y > 0 and containerdate comes before the one below it, fill the position with the current container.
                     * Else, if y == 0 and the position is empty, fill it with the current container.
                     */
                    if (y > 0 && currentContainerDate.before(containerCluster1[x][y - 1][z].getDeparture_date()) && containerCluster1[x][y - 1][z] != null) {
                        if (containerCluster1[x][y][z] == null) {
                            containerCluster1[x][y][z] = container;
                            Arrays.fill(position, x, y, z);
                        }
                    } else if (containerCluster1[x][y][z] == null) {
                        containerCluster1[x][y][z] = container;
                        Arrays.fill(position, x, y, z);
                    }
                }
            }
        }

        return position;
    }
    /*
     * Method pickUpcontainer loops through all the positions to check which container is the first to be 
     * picked up. The crane then picks up the container with the lowest departure date.
     */

    public int[] pickUpContainer() {

        int[] position = null;
        Container container = new Container();
        Date firstDepartureDate = new Date(2100, 12, 12, 12, 12);
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 6; x++) {
                for (int z = 0; z < 20; z++) {
                    
                    /*
                     * If the containerdate of the container on the current position comes before the firstDepartureDate
                     * the date and position are then sotred in the variables firstDepartureDate and position.
                     * When exiting the for loop the container position with the lowest departure date is given back.
                     */
                    if (containerCluster1[x][y][z].getDeparture_date().before(firstDepartureDate)
                            && containerCluster1[x][y][z].y < 5
                            && containerCluster1[x][y + 1][z] == null) {
                        firstDepartureDate = containerCluster1[x][y][z].getDeparture_date();
                        Arrays.fill(position, x, y, z);
                        container = containerCluster1[x][y][z];
                        containerCluster1[x][y][z] = null;
                    } else if (containerCluster1[x][y][z].getDeparture_date().before(firstDepartureDate)
                            && containerCluster1[x][y][z].y == 6) {
                        firstDepartureDate = containerCluster1[x][y][z].getDeparture_date();
                        Arrays.fill(position, x, y, z);
                        container = containerCluster1[x][y][z];
                        containerCluster1[x][y][z] = null;

                    }

                }
            }
        }
        return position;
    }
}
