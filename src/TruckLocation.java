/**
 * truck location class, updates message for customer when new street is arrived to.
 * @param subject
 */

import javax.swing.JOptionPane;
public class TruckLocation extends Observer{
    Address address;

    public TruckLocation(Subject subject){
        this.address = new Address();

    }

    @Override
    public void update() {
        JOptionPane.showMessageDialog(null,
                "Hello customer! The truck is currently on:" + "\n" +
                        "Street name: " + address.getStreet() +
                        "\n" + "Street number: " + address.getNumber(),
                "TITLE",
                JOptionPane.INFORMATION_MESSAGE);

    }
}