/**
 * Holds the coordinates of the next address, updating the Truck coordinates until it is at the address.
 */

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;


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
     * Moves the truck right one unit.
     */
    public void moveTruckRight(){
        truck.setX(truck.getX() + 1);
        truck.updateDistanceTraveled();
    }

    /**
     * Moves the truck left one unit.
     */
    public void moveTruckLeft(){
        truck.setX(truck.getX() - 1);
        truck.updateDistanceTraveled();
    }

    /**
     * Moves the truck up one unit.
     */
    public void moveTruckUp(){
        truck.setY(truck.getY() - 1);
        truck.updateDistanceTraveled();
    }

    /**
     * Moves the truck down one unit.
     */
    public void moveTruckDown(){
        truck.setY(truck.getY() + 1);
        truck.updateDistanceTraveled();
    }

    /**
     * Determines if the truck is able to move right or not.
     */
    public boolean canMoveRight(){
        return truck.getX() != 1005 && (truck.getY() == 5 || truck.getY() == 105 || truck.getY() == 205 ||
                truck.getY() == 305 || truck.getY() == 405 || truck.getY() == 505 || truck.getY() == 605 ||
                truck.getY() == 705 || truck.getY() == 805 || truck.getY() == 905 || truck.getY() == 1005);
    }

    /**
     * Determines if the truck is able to move left or not.
     */
    public boolean canMoveLeft(){
        return truck.getX() != 5 && (truck.getY() == 5 || truck.getY() == 105 || truck.getY() == 205 ||
                truck.getY() == 305 || truck.getY() == 405 || truck.getY() == 505 || truck.getY() == 605 ||
                truck.getY() == 705 || truck.getY() == 805 || truck.getY() == 905 || truck.getY() == 1005);
    }

    /**
     * Determines if the truck is able to move down or not.
     */
    public boolean canMoveDown() {
        return truck.getY() != 1005 && (truck.getX() == 5 || truck.getX() == 105 || truck.getX() == 205 ||
                truck.getX() == 305 || truck.getX() == 405 || truck.getX() == 505 || truck.getX() == 605 ||
                truck.getX() == 705 || truck.getX() == 805 || truck.getX() == 905 || truck.getX() == 1005);
    }

    /**
     * Determines if the truck is able to move up or not.
     */
    public boolean canMoveUp(){
        return truck.getY() != 5 && (truck.getX() == 5 || truck.getX() == 105 || truck.getX() == 205 ||
                truck.getX() == 305 || truck.getX() == 405 || truck.getX() == 505 || truck.getX() == 605 ||
                truck.getX() == 705 || truck.getX() == 805 || truck.getX() == 905 || truck.getX() == 1005);
    }

    /**
     * Moves the truck along the grid to the next destination.
     */
    public void moveTruckOnGrid(){
        if (truck.getX() != nextXCoord){
            if (truck.getX() > nextXCoord){
                moveTruckLeft();
            }
            if (truck.getX() < nextXCoord) {
                moveTruckRight();
            }
        }
        else if (truck.getY() != nextYCoord){
            if (truck.getY() < nextYCoord){
                moveTruckDown();
            }
            if (truck.getY() > nextYCoord){
                moveTruckUp();
            }
        }

        //System.out.println("Moved to: " + nextXCoord + ", " + nextYCoord);
    }
}
