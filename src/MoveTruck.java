

import java.awt.Color;
import java.awt.Graphics;

public class MoveTruck {

    int nextXCoord;
    int nextYCoord;
    Truck truck;

    public MoveTruck(Truck truck){
        this.nextXCoord = 0;
        this.nextYCoord = 0;
        this.truck = truck;
    }

    public void setNextXCoord(int nextXCoord) {
        this.nextXCoord = nextXCoord;
    }

    public void setNextYCoord(int nextYCoord) {
        this.nextYCoord = nextYCoord;
    }

    public void moveTruckOnGrid(){
        if (truck.getX() != nextXCoord){
            if (truck.getX() > nextXCoord){
                truck.setX(truck.getX() - 5);

            }
            if (truck.getX() < nextXCoord) {
                truck.setX(truck.getX() + 5);
            }
        }
        else if (truck.getY() != nextYCoord){
            if (truck.getY() > nextYCoord){
                truck.setY(truck.getY() + 5);
            }
            if (truck.getY() < nextYCoord){
                truck.setY(truck.getY() - 5);
            }
        }

    }
}
