import java.util.ArrayList;
import java.util.Collections;

/**
 * An arraylist which continues to sort itself in order of closets to furthers from a set destinations
 */

public class TimeRoute
{
    private ArrayList<Address> houses;  //List of houses
    private Address loc;  //current location
    //private MoveTruck truck;
    private Truck truck;

    /**
     * Constructor
     * @param local     The current location of the truck
     * @param t         The truck to move
     */
    public TimeRoute(Address local, Truck t)
    {
        truck = t;
        loc = local;
        houses = new ArrayList<Address>();
    }

    /**
     * Adds a house to the list and automatically sorts the house into place
     * @param a     House to add to the list
     */
    public void addHouse(Address a)
    {
        houses.add(a);
        Collections.sort(houses,new TimeCompare());
    }

    /**
     * Prints all houses in a human readable format
     */
    public void output()
    {
        for(Address a : houses)
        {
            System.out.print(a.getNumber() + " " + a.getStreet());
            System.out.print("   ");
        }
        System.out.println("");

    }
    /**
     * Grabs the next house to use and removes it from the list
     */
    public Address nextHouse()
    {
        if(houses.size() != 0)
        {
            Address temp = houses.get(0);
            houses.remove(0);
            return temp;
        }
        return loc;

    }
    /**
     * CHecks if list is empty
     */
    public boolean empty()
    {
        if(houses.size() == 0)
        {
            return true;
        }
        return false;
    }

    /**
     *Updates location and then sorts list again to reflect change
     * @param l     new location
     */
    public void changeLoc(Address l)
    {
        loc = l;
        Collections.sort(houses, new DistanceCompare(loc));
    }

}
