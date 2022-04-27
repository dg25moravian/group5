/**
 * Distance finder class
 * Finds distance between 2 give points by calling calculateDistance with the addresses
 */

public class DistanceFinder
{
    public DistanceFinder()
    {

    }

    /**
    Calculates the distance between 2 addresses
     @param     add1, add2, Addresses to find distance between
     @return    Double c, distance between
     **/
    public double calculateDistance(Address add1, Address add2)
    {
        if(add1 != null && add2 != null)
        {
            if(add1.getStreet() == add2.getStreet())
            {
                return Math.abs((double)(add1.getNumber()-add2.getNumber())/10);
            }
            else if(add1.getNumber() == add2.getNumber())
            {
                return Math.abs((double)((int)add1.getStreet()-(int)add2.getStreet()));
            }
            else
            {
                double a = Math.abs((int)add1.getStreet() - (int)add2.getStreet());
                double b = Math.abs((add1.getNumber()-add2.getNumber())/10);
                double c = (a*a) + (b*b);
                c = Math.sqrt(c);
                return c;
            }
        }
        return 0;


    }

}
