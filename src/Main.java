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
        } catch (IOException e) {
            e.printStackTrace();
        }
        JFrame window = new JFrame();
        Neighborhood neighborhood = new Neighborhood(window);

    }
}
