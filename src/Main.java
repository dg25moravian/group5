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

        //used for testing DistanceFinder
        //Address a1 = new Address(0,'a');
        //Address a2 = new Address(20,'d');
        //DistanceFinder d = new DistanceFinder(a1,a2);
        //System.out.println(d.calculateDistance());



       RandomAddresses addresses;
       try {
          addresses = new RandomAddresses("addresses.txt");
       }
       catch (IOException e) {
           e.printStackTrace();
        }

       Environment environment = new Environment();


    }
}
