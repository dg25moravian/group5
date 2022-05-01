/**
 * Creates a GUI for the user to select the route choice they want the truck to follow. CLoses
 * at selection and runs the rest of the program.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SelectGUI extends JFrame {

    boolean routeChoice;

    /**
     * Creates the GUI and the Route buttons. Takes the selected button and sets route choice
     * to which route was selected.
     */
    public SelectGUI(){
        this.setSize(400, 400);
        JButton time = new JButton("Time Route");
        JButton distance = new JButton("Distance Route");

        time.setBounds(100, 25, 200, 100);
        distance.setBounds(100, 200, 200, 100);

        time.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                routeChoice = false;
                dispose();
                start();
            }
        });

        distance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                routeChoice = true;
                dispose();
                start();
            }
        });


        this.add(time);
        this.add(distance);

        this.setLayout(null);
        this.setVisible(true);
    }

    /**
     * Returns a boolean that determines the route choice.
     * @return
     */
    public boolean getRouteChoice(){
        return routeChoice;
    }

    /**
     * Runs the rest of the program.
     */
    public void start() {
        MessagePublisher subject = new  MessagePublisher();
        Environment environment = new Environment(subject, this.getRouteChoice());

        TruckLocation tl = new TruckLocation();

        subject.attach(tl);
    }
}
