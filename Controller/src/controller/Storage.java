/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Chris H
 */
public class Storage {

    /*
     * vrachtauto's (47%), treinen (8%),  zeevaart (20%) en binnenvaart (25%). 
     */
    public final String transportTruck = "vrachtwagen"; //depot 24-45
    public final String transportInlandShip = "binnenschip"; //depot 13-23
    public final String transportSeaShip = "zeeschip"; //depot 6-12
    public final String transportTrain = "trein"; //depot 1-5
    int numberOfDepots = 45;
    List<ContainerDepot> containerDepots = new LinkedList<>();

    public Storage() {
        for (int i = 0; i < numberOfDepots; i++) {
            containerDepots.add(new ContainerDepot());
        }

    }

    public int checkAvailableDepot(Container container) {

        boolean availablePosition = false;
        int depotRow = 1;
        Calendar currentContainerDate = container.getDeparture_date();
        String transportType = container.getVertrek_vervoer();

        if (transportTrain.equals(transportType)) {
            depotRow = 1;
        }

        if (transportSeaShip.equals(transportType)) {
            depotRow = 6;
        }

        if (transportInlandShip.equals(transportType)) {
            depotRow = 13;
        }

        if (transportTruck.equals(transportType)) {
            depotRow = 24;
        }

        while (availablePosition == false) {
            for (int z = 0; z < 20; z++) {
                for (int x = 0; x < 6; x++) {
                    for (int y = 0; y < 6; y++) {

                        /*
                         * Check for available positions
                         */
                        if (y > 0
                                && containerDepots.get(depotRow).containerCluster[x][y - 1][z] != null
                                && currentContainerDate.before(containerDepots.get(depotRow).containerCluster[x][y - 1][z].getDeparture_date())) {
                            if (containerDepots.get(depotRow).containerCluster[x][y][z] == null) {
                                availablePosition = true;
                            }

                        } else if (containerDepots.get(depotRow).containerCluster[x][y][z] == null) {
                            availablePosition = true;
                        }
                    }
                }
            }
            if (availablePosition == false) {
                depotRow++;
            }

        }
        return depotRow;
    }

    public int[] storeContainer(Container container, int depotRow) {

        int[] position = new int[3];
        Calendar currentContainerDate = container.getDeparture_date();

        for (int z = 0; z < 20; z++) {
            for (int x = 0; x < 6; x++) {
                for (int y = 0; y < 6; y++) {

                    /*
                     * If y > 0 and containerdate comes before the one below it, fill the position with the current container.
                     * Else, if y == 0 and the position is empty, fill it with the current container.
                     * If there are no positions available, go to the next cluster.
                     */

                    if (y > 0 && currentContainerDate.before(containerDepots.get(depotRow).containerCluster[x][y - 1][z].getDeparture_date())
                            && containerDepots.get(depotRow).containerCluster[x][y - 1][z] != null) {
                        if (containerDepots.get(depotRow).containerCluster[x][y][z] == null) {
                            containerDepots.get(depotRow).containerCluster[x][y][z] = container;
                            position[0] = x;
                            position[1] = y;
                            position[2] = z;
                            return position;
                        }
                    } else if (containerDepots.get(depotRow).containerCluster[x][y][z] == null) {
                        containerDepots.get(depotRow).containerCluster[x][y][z] = container;
                        position[0] = x;
                        position[1] = y;
                        position[2] = z;
                        return position;
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

        int[] position = new int[3];
        Container container = new Container();
        Calendar firstDepartureDate = new GregorianCalendar(2100,12,12,12,40,40);

        for (int z = 0; z < 20; z++) {
            for (int x = 0; x < 6; x++) {
                for (int y = 5; y >= 0; y--) {

                    /*
                     * If the containerdate of the container on the current position comes before the firstDepartureDate
                     * the date and position are then stored in the variables firstDepartureDate and position.
                     * When exiting the for loop the container position with the lowest departure date is given back.
                     */
                    if (containerDepots.get(6).containerCluster[x][y][z] != null
                            && y == 5
                            && containerDepots.get(6).containerCluster[x][y][z].getDeparture_date().before(firstDepartureDate)) {
                        firstDepartureDate = containerDepots.get(6).containerCluster[x][y][z].getDeparture_date();
                        container = containerDepots.get(6).containerCluster[x][y][z];
                        position[0] = x;
                        position[1] = y;
                        position[2] = z;

                    } else if (containerDepots.get(6).containerCluster[x][y][z] != null
                            && y < 5
                            && containerDepots.get(6).containerCluster[x][y][z].getDeparture_date().before(firstDepartureDate)
                            && containerDepots.get(6).containerCluster[x][y + 1][z] == null) {
                        firstDepartureDate = containerDepots.get(6).containerCluster[x][y][z].getDeparture_date();
                        container = containerDepots.get(6).containerCluster[x][y][z];
                        position[0] = x;
                        position[1] = y;
                        position[2] = z;
                    }
                }
            }
        }
        containerDepots.get(6).containerCluster[position[0]][position[1]][position[2]] = null;
        return position;
    }
}
