/**
 * Java Program to create a popup and display it on a parent frame
 */

import javax.swing.*;
import java.awt.event.*;
class pop extends JFrame {
    // popup
    Popup p;

    pop(Address address)
    {

        JPanel p1 = new JPanel();

        Address serviceCenter = new Address();

        if (Character.toString(address.getStreet()).equals(Character.toString(serviceCenter.getStreet())) && address.getNumber() == serviceCenter.getNumber())
        {
            JOptionPane.showMessageDialog(p1,
                    "The truck has currently completed deliveries.",
                    "Customer Truck Tracker",
                    JOptionPane.PLAIN_MESSAGE);

        }
        else
        {
            JOptionPane.showMessageDialog(p1,
                    "Hello customer! The truck is currently on:\r\nStreet name: " + address.getStreet() + "\r\nStreet number:" + address.getNumber(),
                    "Customer Truck Tracker",
                    JOptionPane.PLAIN_MESSAGE);

        }


    }


    public void actionPerformed(ActionEvent e)
    {
        p.show();
    }

}