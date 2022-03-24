import java.util.ArrayList;
import java.util.Collections;

public class DistanceRoute
{
    private ArrayList<Address> houses;
    private Address loc;
    public DistanceFinder dist;

    public DistanceRoute(Address local)
    {
        loc = local;
        dist = new DistanceFinder();
        houses = new ArrayList<Address>();
    }

    public void addHouse(Address a)
    {
        houses.add(a);
        Collections.sort(houses,new DistanceCompare(loc));
    }
    public void output()
    {
        for(Address a : houses)
        {
            System.out.print(a.getNumber() + " " + a.getStreet());
            System.out.println("");
        }

    }



}
