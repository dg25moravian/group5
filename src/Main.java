/**
 * Currently runs the 2 Java Classes needed for Sprint 1. RandomAddresses creates a file with 100 random addresses for
 * delivery. Neighborhood creates the GUI Model of the Neighborhood.
 *
 * Authors: Kyle Adams, Maxwell Houck, Davin Glynn, David Olsakowski
 */



import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        RandomAddresses addresses;
        try {
            addresses = new RandomAddresses("addresses.txt");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //Environment environment = new Environment();

        MessagePublisher subject = new  MessagePublisher();
        Environment environment = new Environment(subject);

        TruckLocation tl =new TruckLocation();

        subject.attach(tl);
        //popup p = new popup();

    }
}