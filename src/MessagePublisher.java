import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    @Override
    public void attach(Observer observer){
        observers.add(observer);
    }
    @Override
    public void detach(Observer observer){
        observers.remove(observer);
    }

    @Override

    public void notifyUpdate(Address address){
        for (Observer observer : observers) {
            observer.update(address);
        }
    }
}