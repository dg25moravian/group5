import java.util.*;

/**
 * Comparator object used to compare 2 Addresses based on distance
 */


public class DistanceCompare implements Comparator<Address>
{

    private Address loc;
    private DistanceFinder dist;

    /**
     * Constructor, makes a distanceFinder object and takes the current truck location
     * @param l   current location of the truck
     */
    public DistanceCompare(Address l)
    {
        loc = l;
        dist = new DistanceFinder();
    }

    /**
     * Compares 2 addresses based on distance from current location l
     * @param a1    First address to compare
     * @param a2    Second address to compare
     * @return      difference of the two
     */

    public int compare(Address a1, Address a2)
    {
        double x = dist.calculateDistance(a1, loc);
        double y = dist.calculateDistance(a2, loc);
        return (int)(x-y);
    }
}
