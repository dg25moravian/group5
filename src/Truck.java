/** This class creates a Truck object, which is a circle on the Neighborhood GUI. It holds x and y coordinates so
 * that the truck can be moved by adjusting the coordinates to where it needs to go.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;


public class Truck extends JPanel {

    private int x;
    private int y;
    private int radius = 15;
    public Graphics g;
    MoveTruck moveTruck;

    /**
     * Constructor of the Truck object. Sets the x and y to the beginning location of the truck and creates
     * MoveTruck object that will update the Truck's coordinates.
     */
    public Truck(Graphics g){
        this.x = 105;
        this.y = 135;
        this.g = g;
        this.moveTruck = new MoveTruck(this);
    }

    public void setX(int x) {
        this.x = x;
        paintComponent(g);
    }

    public void setY(int y) {
        this.y = y;
        paintComponent(g);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Sends the coordinates of the new address to moveTruck, which updates the coordinates until the Truck is at
     * the new location.
     */
    public void callMoveTruck(){
        moveTruck.setNextXCoord(785);
        moveTruck.setNextYCoord(135);
        while(getX() != moveTruck.getNextXCoord() || getY() != moveTruck.getNextYCoord()) {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            moveTruck.moveTruckOnGrid();
        }

    }

    /**
     * Paints the circle on the GUI to represent the truck.
     */

    protected void paintComponent(Graphics g) {
        g.drawOval(getX(), getY(), 20, 20);
        g.setColor(Color.RED);
        g.fillOval(getX(), getY(), 20, 20);
    }

}


