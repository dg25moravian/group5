/**
 * Concrete subject class to implement observer pattern
 */

public interface Subject
{
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Address address);


}