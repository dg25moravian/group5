/* This class creates a Truck object, which is a circle on the Neighborhood GUI. It holds x and y coordinates so
  that the truck can be moved by adjusting the coordinates to where it needs to go.
 */
import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.concurrent.TimeUnit;


public class Truck extends JPanel implements ActionListener {

    final int PANEL_SIZE = 1020;
    private int x = 0;
    private int y = 0;
    MoveTruck moveTruck = new MoveTruck(this);
    Timer timer;
    static boolean mutex = false;

    Address local = new Address(0,'a');
    DistanceRoute distanceroute = new DistanceRoute(local, this);

    /**
     * Constructor. Sets the size of the JPanel and creates a Timer object to delay the truck movement.
     */
    public Truck(){
        this.setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
        timer = new Timer(10, this);
        timer.start();


        Address a1 = new Address(10,'a');
        Address a2 = new Address(10,'c');
        Address a3 = new Address(30,'d');

        distanceroute.addHouse(a1);
        distanceroute.addHouse(a2);
        distanceroute.addHouse(a3);

    }

    /**
     * Paints the circle on the GUI to represent the truck.
     * @param g 
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fillOval(x, y, 15, 15);
        g2.setColor(Color.blue);

    }

    /**
     * Paints grid of neighborhood.
     * @param g
     */
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.black);

        g.drawLine(5,1005,5, 5);
        g.drawLine(105, 1005, 105, 5);
        g.drawLine(205, 1005, 205,5);
        g.drawLine(305, 1005, 305, 5);
        g.drawLine(405, 1005, 405, 5);
        g.drawLine(505, 1005, 505, 5);
        g.drawLine(605, 1005, 605, 5);
        g.drawLine(705, 1005, 705, 5);
        g.drawLine(805, 1005, 805, 5);
        g.drawLine(905, 1005, 905, 5);
        g.drawLine(1005, 1005, 1005, 5);

        g.drawLine(1005, 5, 5, 5);
        g.drawLine(1005, 105, 5, 105);
        g.drawLine(1005, 205, 5, 205);
        g.drawLine(1005, 305, 5, 305);
        g.drawLine(1005, 405, 5, 405);
        g.drawLine(1005, 505, 5, 505);
        g.drawLine(1005, 605, 5, 605);
        g.drawLine(1005, 705, 5, 705);
        g.drawLine(1005, 805, 5, 805);
        g.drawLine(1005, 905, 5, 905);
        g.drawLine(1005, 1005, 5, 1005);

        /**
         g.drawString("1st street", 25, 75);
         g.drawString("2nd street", 25, 150);
         g.drawString("3rd street", 25, 225);
         g.drawString("4th street", 25, 300);
         g.drawString("5th street", 25, 375);
         g.drawString("6th street", 25, 450);
         g.drawString("7th street", 25, 525);
         g.drawString("8th street", 25, 600);
         g.drawString("9th street", 25, 675);
         g.drawString("10th street", 25, 750);
         g.drawString("A street", 30, 100);
         g.drawString("B street", 120, 100);
         g.drawString("C street", 200, 100);
         g.drawString("D street", 290, 100);
         g.drawString("E street", 375, 100);
         g.drawString("F street", 460, 100);
         g.drawString("G street", 540, 100);
         g.drawString("H street", 625, 100);
         g.drawString("I street", 715, 100);
         g.drawString("J street", 805, 100);
         */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!mutex)
        {
            mutex = true;
            Address a = distanceroute.nextHouse();
            this.moveTruck.setNextXCoord(a.getX());
            this.moveTruck.setNextYCoord(a.getY());
        }

        this.moveTruck.moveTruckOnGrid();
        repaint();
        if(x == moveTruck.getNextXCoord() && y == moveTruck.getNextYCoord())
        {
            mutex = false;
            System.out.println("Arrived at location");
        }


            /**
            a = new Address(10, 'a');
            System.out.println("2");
            //Address a = distanceroute.nextHouse();
            this.moveTruck.setNextXCoord(a.getX());
            this.moveTruck.setNextYCoord(a.getY());
            //System.out.println(moveTruck.getNextXCoord() + "  "  + moveTruck.getNextYCoord());

            this.moveTruck.moveTruckOnGrid();

            a = new Address(0, 'b');
            System.out.println("3");
            //Address a = distanceroute.nextHouse();
            this.moveTruck.setNextXCoord(a.getX());
            this.moveTruck.setNextYCoord(a.getY());
            //System.out.println(moveTruck.getNextXCoord() + "  "  + moveTruck.getNextYCoord());

            this.moveTruck.moveTruckOnGrid();
            */
            repaint();

        }




    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}


