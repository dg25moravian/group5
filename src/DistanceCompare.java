import java.util.*;

public class DistanceCompare implements Comparator<Address>
{

    private Address loc;
    private DistanceFinder dist;
    public DistanceCompare(Address l)
    {
        loc = l;
        dist = new DistanceFinder();
    }
    public int compare(Address a1, Address a2)
    {
        double x = dist.calculateDistance(a1, loc);
        double y = dist.calculateDistance(a2, loc);
        return (int)(x-y);
    }
}
