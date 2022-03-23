/**
 * This class creates an Neighborhood object that takes a JFrame argument. It creates a GUI Model of a neighborhood
 * along with labeled Streets.
 *//*



import java.awt.*;
import javax.swing.*;

public class Neighborhood {

    JFrame window;

    */
/**
     * Takes a JFrame argument. Creates a GUI Model of the neighborhood as a grid with labeled streets.
     * @param window
     *//*

    public Neighborhood(JFrame window) {
        this.window = window;
        window.setTitle("GUI_Truck.exe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel compContainer = new JPanel(new GridLayout(10, 10));
        compContainer.setBorder(BorderFactory.createLineBorder(Color.black, 2));


        JPanel[][] truckRoute = new JPanel[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                truckRoute[i][j] = new JPanel();

                //JLabel label1 = new JLabel("10th Street");
                //truckRoute[i][j].add(label1);

                truckRoute[i][j].setBackground(Color.green);
                truckRoute[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                truckRoute[i][j].setPreferredSize(new Dimension(100, 100));
                compContainer.add(truckRoute[i][j]);
            }

        }


        JLabel label1 = new JLabel("1st Street");
        truckRoute[0][0].add(label1);

        label1 = new JLabel("2nd Street");
        truckRoute[1][0].add(label1);

        label1 = new JLabel("3rd Street");
        truckRoute[2][0].add(label1);

        label1 = new JLabel("4th Street");
        truckRoute[3][0].add(label1);

        label1 = new JLabel("5th Street");
        truckRoute[4][0].add(label1);

        label1 = new JLabel("6th Street");
        truckRoute[5][0].add(label1);

        label1 = new JLabel("7th Street");
        truckRoute[6][0].add(label1);

        label1 = new JLabel("8th Street");
        truckRoute[7][0].add(label1);

        label1 = new JLabel("9th Street");
        truckRoute[8][0].add(label1);

        label1 = new JLabel("10th Street");
        truckRoute[9][0].add(label1);

        label1 = new JLabel("A Street");
        truckRoute[0][0].add(label1);

        label1 = new JLabel("B Street");
        truckRoute[0][1].add(label1);

        label1 = new JLabel("C Street");
        truckRoute[0][2].add(label1);

        label1 = new JLabel("D Street");
        truckRoute[0][3].add(label1);

        label1 = new JLabel("E Street");
        truckRoute[0][4].add(label1);

        label1 = new JLabel("F Street");
        truckRoute[0][5].add(label1);

        label1 = new JLabel("G Street");
        truckRoute[0][6].add(label1);

        label1 = new JLabel("H Street");
        truckRoute[0][7].add(label1);

        label1 = new JLabel("I Street");
        truckRoute[0][8].add(label1);

        label1 = new JLabel("J Street");
        truckRoute[0][9].add(label1);

        window.pack();
        window.setVisible(true);

        GridLayout layout = new GridLayout(0, 1);
        JPanel mainPanel = new JPanel(layout);

        mainPanel.add(compContainer);

        window.add(mainPanel);
        window.pack();
        window.setVisible(true);


    }

}
*/
