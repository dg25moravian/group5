// Java Program to create a popup and display
// it on a parent frame
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class popup extends JFrame {
    // popup
    Popup p;

    // constructor
    popup() {

        Subject subject = new Subject();
        subject.attach(new TruckLocation(subject));
        subject.setState(subject.getX());

/*        //Address address = new Address();

        // create a panel
        JPanel p1 = new JPanel();

                "Hello customer! The truck is currently on the street: " + subject.getX() + truck.getNextYCoord(),
                "Customer Truck Tracker",
                JOptionPane.PLAIN_MESSAGE);
    }*/

    }
    public void actionPerformed (ActionEvent e)
    {
        p.show();
    }

}