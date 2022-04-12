import javax.swing.*;
import java.awt.*;

public class Environment extends JFrame {

    Truck truck;

    public Environment() {
        this.truck = new Truck();


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