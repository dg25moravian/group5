/**
 * Java class that instantiates a truck object, adds houses, and the truck to the GUI.
 */

import javax.swing.*;
import java.awt.*;

public class Environment extends JFrame {

    Truck truck;

    public Environment() {
        this.truck = new Truck();


        Address a1 = new Address(10,'a',"1:00");
        Address a2 = new Address(10,'c', "2:00");
        Address a3 = new Address(40,'c', "1:30");

        truck.changeDistance(true);

        truck.addHouse(a1);
        truck.addHouse(a2);
        truck.addHouse(a3);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(truck);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        /**MoveTruck m = new MoveTruck(truck);
         m.moveTruckRight();
         m.moveTruckRight();
         // Add
         // DistanceRoute r = new DistanceRoute()
         **/
    }

}