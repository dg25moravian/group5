import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Truck {

    public Truck() {
        {
            JFrame frame = new JFrame("Truck");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.add(new Circle());
            frame.pack();
            frame.setVisible(true);

        }
    }


    public class Circle extends JPanel {

        private int x = 0;
        private int y = 25;
        private int radius = 15;
        private int xDelta = 2;

        public Dimension getPreferredSize() {
            return new Dimension(10, 40);
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(x, y - radius, radius * 2, radius * 2);
        }
    }

}
