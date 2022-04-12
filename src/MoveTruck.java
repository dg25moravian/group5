/**
 * Holds the coordinates of the next address, updating the Truck coordinates until it is at the address.
 */

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;


public class MoveTruck extends JPanel {

    int nextXCoord;
    int nextYCoord;
    Truck truck;

    /**
     * Constructor of the MoveTruck object, takes a Truck parameter. Initializes the next coordinates to 0.
     */

    public MoveTruck(Truck truck){

        Address a = new Address(100,'k');
        this.nextXCoord = a.getX();
        this.nextYCoord = a.getY();
        this.truck = truck;
    }

    /**
     * Sets the next X coordinate.
     * @param nextXCoord
     */
    public void setNextXCoord(int nextXCoord) {
        this.nextXCoord = nextXCoord;
    }

    /**
     * Sets the next Y coordinate.
     * @param nextYCoord
     */
    public void setNextYCoord(int nextYCoord) {
        this.nextYCoord = nextYCoord;
    }

    /**
     * Returns the next X coordinate.
     * @return
     */
    public int getNextXCoord(){
        return nextXCoord;
    }

    /**
     * Returns the next Y coordinate.
     * @return
     */
    public int getNextYCoord() {
        return nextYCoord;
    }

    /**
     * Updates the coordinates of the truck object. This method gets the Truck to the proper X value first
     * before updating the Y value.
     */

    public void moveTruckRight(){
        truck.setX(truck.getX() + 1);
    }

    public void moveTruckLeft(){
        truck.setX(truck.getX() - 1);
    }

    public void moveTruckUp(){
        truck.setY(truck.getY() - 1);
    }

    public void moveTruckDown(){
        truck.setY(truck.getY() + 1);
    }

    public void moveTruckOnGrid(){
        if (truck.getX() != nextXCoord){
            if (truck.getX() > nextXCoord){
                truck.setX(truck.getX() - 1);

            }
            if (truck.getX() < nextXCoord) {
                truck.setX(truck.getX() + 1);
            }
        }
        else if (truck.getY() != nextYCoord){
            if (truck.getY() < nextYCoord){
                truck.setY(truck.getY() + 1);
            }
            if (truck.getY() > nextYCoord){
                truck.setY(truck.getY() - 1);
            }
        }

    }
}
