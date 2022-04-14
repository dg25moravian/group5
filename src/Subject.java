/**
 * concrete subject class to maintain the state of the object and when a change in the state occurs
 * it notifies the attached Observers.
 */

import java.util.ArrayList;
import java.util.List;

public class Subject extends Truck{

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}