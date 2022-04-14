import java.util.Comparator;

/**
 * Comparator object used to compare 2 Addresses based on distance
 */


public class TimeCompare implements Comparator<Address>
{


    /**
     * Constructor
     */
    public TimeCompare()
    {

    }

    /**
     * Compares 2 addresses based on distance from current location l
     * @param a1    First address to compare
     * @param a2    Second address to compare
     * @return      difference of the two
     */

    public int compare(Address a1, Address a2)
    {
       String s1 = a1.getTime().substring(0,2);
       int p1 = Integer.parseInt(s1);

        String s2 = a1.getTime().substring(3,5);
        int p2 = Integer.parseInt(s2);

        String s3 = a2.getTime().substring(0,2);
        int p3 = Integer.parseInt(s3);

        String s4 = a1.getTime().substring(3,5);
        int p4 = Integer.parseInt(s4);

        if(p1 != p3)
        {
            return p1 - p3;
        }
        else
        {
            return p2 - p4;
        }

    }
}
