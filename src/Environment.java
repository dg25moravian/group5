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
        g.drawOval(150, 150, 25, 25);
        g.setColor(Color.RED);
        g.fillOval(150, 150, 25, 25);

        g.setColor(Color.black);

        g.drawLine(30, 750, 30, 75);
        g.drawLine(150, 75, 150,750);
        //draw more lines here for remaining roads

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
        g.drawString("C street", 210, 100);
        g.drawString("D street", 300, 100);
        g.drawString("E street", 390, 100);
        g.drawString("F street", 480, 100);
        g.drawString("G street", 570, 100);
        g.drawString("H street", 660, 100);
        g.drawString("I street", 750, 100);
        g.drawString("J street", 840, 100);


    }
}