/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Chris H
 */
public class Storage {

    int numberOfDepots = 45;
    List<ContainerDepot> containerDepots = new LinkedList<>();

    public Storage() {
        for (int i = 0; i < numberOfDepots; i++) {
            containerDepots.add(new ContainerDepot());
        }

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

                    if (y > 0 && currentContainerDate.before(containerDepots.get(1).containerCluster[x][y - 1][z].getDeparture_date())
                            && containerDepots.get(1).containerCluster[x][y - 1][z] != null) {
                        if (containerDepots.get(1).containerCluster[x][y][z] == null) {
                            containerDepots.get(1).containerCluster[x][y][z] = container;
                            Arrays.fill(position, x, y, z);
                        }
                    } else if (containerDepots.get(1).containerCluster[x][y][z] == null) {
                        containerDepots.get(1).containerCluster[x][y][z] = container;
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
                    if (containerDepots.get(1).containerCluster[x][y][z].getDeparture_date().before(firstDepartureDate)
                            && containerDepots.get(1).containerCluster[x][y][z].y < 5
                            && containerDepots.get(1).containerCluster[x][y + 1][z] == null) {
                        firstDepartureDate = containerDepots.get(1).containerCluster[x][y][z].getDeparture_date();
                        Arrays.fill(position, x, y, z);
                        container = containerDepots.get(1).containerCluster[x][y][z];
                        containerDepots.get(1).containerCluster[x][y][z] = null;
                    } else if (containerDepots.get(1).containerCluster[x][y][z].getDeparture_date().before(firstDepartureDate)
                            && containerDepots.get(1).containerCluster[x][y][z].y == 6) {
                        firstDepartureDate = containerDepots.get(1).containerCluster[x][y][z].getDeparture_date();
                        Arrays.fill(position, x, y, z);
                        container = containerDepots.get(1).containerCluster[x][y][z];
                        containerDepots.get(1).containerCluster[x][y][z] = null;

                    }

                }
            }
        }
        return position;
    }
}
