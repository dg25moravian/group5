/** This class creates a Truck object, which is a circle on the Neighborhood GUI. It holds x and y coordinates so
 * that the truck can be moved by adjusting the coordinates to where it needs to go.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.concurrent.TimeUnit;


public class Truck extends JPanel {

    private int x;
    private int y;
    public Graphics g;
    MoveTruck moveTruck;

    /**
     * Constructor of the Truck object. Sets the x and y to the beginning location of the truck and creates
     * MoveTruck object that will update the Truck's coordinates.
     */
    public Truck(Graphics g){
        this.x = 105;
        this.y = 135;
        this.moveTruck = new MoveTruck(this);
        this.g = g;
    }

    public void setX(int x) {
        this.x = x;
        paint(g);

    }

    public void setY(int y) {
        this.y = y;
        paint(g);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Paints the circle on the GUI to represent the truck.
     */

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D circle = new Ellipse2D.Double(x, y, 20, 20);
        g2.fill(circle);
        // g.drawOval(getX(), getY(), 20, 20);
        // g.setColor(Color.RED);
        // g.fillOval(getX(), getY(), 20, 20);
    }


    /**
     * Sends the coordinates of the new address to moveTruck, which updates the coordinates until the Truck is at
     * the new location.
     */
    public void callMoveTruck(){
        moveTruck.setNextXCoord(500);
        moveTruck.setNextYCoord(200);
        while(getX() != moveTruck.getNextXCoord() || getY() != moveTruck.getNextYCoord()) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            moveTruck.moveTruckOnGrid();
            repaint();
        }

    }

}


