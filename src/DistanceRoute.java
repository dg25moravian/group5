import java.util.ArrayList;
import java.util.Collections;

/**
 * An arraylist which continues to sort itself in order of closets to furthers from a set destinations
 */

public class DistanceRoute
{
    private ArrayList<Address> houses;  //List of houses
    private Address loc;  //current location
    public DistanceFinder dist;  //distancefinder object
    //private MoveTruck truck;
    private Truck truck;

    /**
     * Constructor
     * @param local     The current location of the truck
     * @param t         The truck to move
     */
    public DistanceRoute(Address local, Truck t)
    {
        truck = t;
        loc = local;
        dist = new DistanceFinder();
        houses = new ArrayList<Address>();
    }

    /**
     * Adds a house to the list and automatically sorts the house into place
     * @param a     House to add to the list
     */
    public void addHouse(Address a)
    {
        houses.add(a);
        Collections.sort(houses,new DistanceCompare(loc));
    }

    /**
     * Prints all houses in a human readable format
     */
    public void output()
    {
        for(Address a : houses)
        {
            System.out.print(a.getNumber() + " " + a.getStreet());
            System.out.println("");
        }

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

/**
    public void moveNext()
    {
        Address next = houses.get(0);
        System.out.println(next.getStreet() + "  " + loc.getStreet());
        while(Character.valueOf(next.getStreet()).compareTo(Character.valueOf(loc.getStreet())) != 0);
        {
            System.out.println("one");
            if(next.getStreet() - loc.getStreet() > 0)
            {
                truck.moveTruck.moveTruckRight();
            }
            if(next.getStreet() - loc.getStreet() < 0)
            {
                truck.moveTruck.moveTruckLeft();
            }
        }
        while(next.getNumber()/100 != loc.getNumber()/100)
        {
            System.out.println("two");
            if(next.getNumber()/100 - loc.getNumber()/100 > 0)
            {
                truck.moveTruck.moveTruckDown();
            }
            if(next.getNumber()/100 - loc.getNumber()/100 < 0)
            {
                truck.moveTruck.moveTruckUp();
            }
        }

    }
**/

}
