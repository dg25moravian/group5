/*
   This class creates a Truck object, which is a circle on the Neighborhood GUI. It holds x and y coordinates so
   that the truck can be moved by adjusting the coordinates to where it needs to go.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Truck extends JPanel implements ActionListener {
    private boolean distance; //boolean, true if using distance route, false for time route
    final int PANEL_SIZE = 1020;
    private int x = 0;
    private int y = 0;

    MoveTruck moveTruck = new MoveTruck(this);
    MessagePublisher subject;

    private char street;
    private int number;

    private Address saveAddress;

    Timer timer;
    static boolean mutex = false;
    private Strategy strategy;
    public double distanceTraveled = 0.0;
    JLabel distanceLabel;

    Address local = new Address(0,'a');

    /**
     * Constructor. Sets the size of the JPanel and creates a Timer object to delay the truck movement.
     */
    public Truck(MessagePublisher subject){
        this.subject = subject;
        this.setSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
        timer = new Timer(7, this);
        timer.start();
        distance = false;
        strategy = new DistanceRoute(local);
        this.distanceLabel = new JLabel("Distance Traveled: " + getDistanceTraveled());
        this.add(distanceLabel);
        distanceLabel.setLocation(2000, 5);
    }

    //adds a house to the appropriate object
    public void addHouse(Address a)
    {
        strategy.addHouse(a);

    }

    /**
     * Changes the route to use
     * @param b:  which route to use, true for distance, false for time
     */
    public void changeDistance(boolean b)
    {
        if(!b)
        {
            strategy = new TimeRoute(local);
        }
        if(b)
        {
            strategy = new DistanceRoute(local);
        }
    }

    /**
     * Paints the circle on the GUI to represent the truck.
     * @param g
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fillOval(x, y, 10, 10);
        g2.setColor(Color.blue);
        g2.fillRect(moveTruck.nextXCoord, moveTruck.nextYCoord, 10,10);
        g2.setColor(Color.RED);
        g2.fillRect(0, 0, 10, 10);

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
    }


    //This methods runs every timer event
    @Override
    public void actionPerformed(ActionEvent e) {
        Address b = new Address();

        if(!mutex) //If this variable is false then the truck is ready to receive its new place to go
        {
            mutex = true;
            Address a = strategy.nextHouse();
            b = a;
            this.moveTruck.setNextXCoord(a.getX());
            this.moveTruck.setNextYCoord(a.getY());
            this.street=a.getStreet();
            this.number=a.getNumber();

            saveAddress=a;

        }

        this.moveTruck.moveTruckOnGrid();//it takes a step closer to the location every timer event
        repaint();

        if(x == moveTruck.getNextXCoord() && y == moveTruck.getNextYCoord())//if the truck has arrived it sets mutex to false
        {

//truck back at home so stop timer

            Address serviceCenter = new Address(0, 'a');

            if (Character.toString(saveAddress.getStreet()).equals(Character.toString(serviceCenter.getStreet())) &&
                    saveAddress.getNumber() == serviceCenter.getNumber())

//           if(x==0 && y==10)
            {
                //System.exit(0);
                timer.stop();
//               this.subject.notifyUpdate(this.street,this.number);
                this.subject.notifyUpdate(saveAddress);

            }
            else
            {
                strategy.changeLoc(b);
                mutex = false;
                System.out.println("Arrived at location");
                this.subject.notifyUpdate(saveAddress);

//               this.subject.notifyUpdate(this.street,this.number);
//               System.out.println(x + " " +  y);
//               System.out.println(saveAddress.getStreet());
            }

        }
        repaint();
    }

    /**
     * Updates the distance traveled by the truck.
     */
    public void updateDistanceTraveled(){
        this.distanceTraveled += 0.01;
        distanceLabel.setText("Distance Traveled: " + String.format("%.2f", getDistanceTraveled()));
    }


    /**
     * Sets the x coordinate.
     * @param x
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Sets the y coordinate.
     * @param y
     */
    public void setY(int y){
        this.y = y;
    }

    /**
     * Gets the x coordinate.
     * @return
     */
    public int getX() {
        return this.x;
    }

    /**
     * Gets the y coordinate.
     * @return
     */
    public int getY() {
        return this.y;
    }

    /**
     * Gets the distance traveled.
     * @return
     */
    public double getDistanceTraveled(){
        return this.distanceTraveled;
    }

}
