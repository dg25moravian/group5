import javax.swing.*;
import java.awt.*;

public class Environment extends JFrame {



    public Environment() {

        setBackground(Color.green);
        setSize(1000, 1000);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void paint(Graphics g) {

        g.setColor(Color.black);

        g.drawLine(25,750,25,75);
        g.drawLine(115, 750, 115, 75);
        g.drawLine(200, 750, 200,75);
        g.drawLine(285, 750, 285, 75);
        g.drawLine(370, 750, 370, 75);
        g.drawLine(455, 750, 455, 75);
        g.drawLine(540, 750, 540, 75);
        g.drawLine(625, 750, 625, 75);
        g.drawLine(710, 750, 710, 75);
        g.drawLine(800, 750, 800, 75);

        g.drawLine(800, 75, 25, 75);
        g.drawLine(800, 150, 25, 150);
        g.drawLine(800, 225, 25, 225);
        g.drawLine(800, 300, 25, 300);
        g.drawLine(800, 375, 25, 375);
        g.drawLine(800, 450, 25, 450);
        g.drawLine(800, 525, 25, 525);
        g.drawLine(800, 600, 25, 600);
        g.drawLine(800, 675, 25, 675);
        g.drawLine(800, 750, 25, 750);

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


        Truck truck = new Truck(g);
        add(truck);
        truck.paint(g);
        truck.moveTruck.moveTruckDown();
        truck.moveTruck.moveTruckDown();
        truck.moveTruck.moveTruckDown();



    }
}