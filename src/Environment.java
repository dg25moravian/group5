import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Environment extends JFrame {

    Truck truck;

    public Environment() {
        this.truck = new Truck();
        String line = "";
        String number = "";
        String time = "";
        char street = ' ';

        int count = 0;

        truck.changeDistance(true);

        try{
            BufferedReader reader = new BufferedReader(new FileReader("addresses.txt"));
            while((line = reader.readLine()) != null)
            {

                if(line.charAt(2) != ' ')
                {
                    number = line.substring(0,3);
                    street = line.charAt(4);
                    time = line.substring(13,18);
                }
                else
                {
                    number = line.substring(0,2);
                    street = line.charAt(3);
                    time = line.substring(12,17);
                }
                Address a = new Address(Integer.valueOf(number), street, time);

                System.out.println("---------------------------------");
                System.out.println(count);
                count++;
                System.out.println(line);
                System.out.println(a.toString());
                System.out.println("---------------------------------");
                truck.addHouse(a);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        //truck.changeDistance(true);

        /**
        Address a1 = new Address(10,'a',"11:00");
        Address a2 = new Address(10,'c', "12:00");
        Address a3 = new Address(30,'c', "11:30");

        truck.changeDistance(true);

        truck.addHouse(a1);
        truck.addHouse(a2);
        truck.addHouse(a3);
         **/


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