import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.*;

public class GUI {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("GUI_Truck.exe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel compContainer = new JPanel(new GridLayout(10, 10));
        compContainer.setBorder(BorderFactory.createLineBorder(Color.black, 2));


        JPanel[][] truckRoute = new JPanel[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                truckRoute[i][j] = new JPanel();

                JLabel label1 = new JLabel("10th Street");
                truckRoute[i][j].add(label1);

                truckRoute[i][j].setBackground(Color.green);
                truckRoute[i][j].setBorder(BorderFactory.createLineBorder(Color.black, 1));
                truckRoute[i][j].setPreferredSize(new Dimension(100, 100));
                compContainer.add(truckRoute[i][j]);



            }

        }
        //JLabel label1 = new JLabel("10th Street");
        //window.add(label1);

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
