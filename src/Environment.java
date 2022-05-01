import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Environment extends JFrame {

    Truck truck;

    public Environment(MessagePublisher subject, Boolean routeChoice){
        this.truck = new Truck(subject);

        truck.changeDistance(routeChoice);

        ReadAddresses readAddresses = new ReadAddresses(truck);
        readAddresses.read();


        this.setSize(1020, 1020);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(truck);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}