/** This class creates a Truck object, which is a circle on the Neighborhood GUI. It holds x and y coordinates so
 * that the truck can be moved by adjusting the coordinates to where it needs to go.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Truck extends JPanel {

    private int x;
    private int y;
    private int radius = 15;

    public Truck(){
        this.x = 115;
        this.y = 150;
        Truck truck = this;
        Timer timer = new Timer(2,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MoveTruck moveTruck = new MoveTruck(truck);
                        moveTruck.setNextYCoord(200);
                        moveTruck.setNextXCoord(200);
                        while (x != 200 && y != 200) {
                            moveTruck.moveTruckOnGrid();
                            paintComponent();
                        }
                    }
                });
        timer.start();
    }

    public void setX(int x) {
        this.x = x;
        repaint();
    }

    public void setY(int y) {
        this.y = y;
        repaint();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void paintComponent(Graphics g) {
        g.drawOval(x - 10, y - 10, 20, 20);
        g.setColor(Color.RED);
        g.fillOval(x - 10, y - 10, 20, 20);
    }


}


