/**
 * Distance finder class
 * Create with 2 addresses and call calculatorDistance() to find the distance between them
 *
 *
 */




public class DistanceFinder
{
    double x;
    double y;
    public DistanceFinder()
    {

    }

    /**
    Address add1;
    Address add2;
    double x;
    double y;
    public DistanceFinder(Address ad1, Address ad2)
    {
        add1 = ad1;
        add2 = ad2;
    }
     **/
    public double calculateDistance(Address add1, Address add2)
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

}
