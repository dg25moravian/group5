
/**
 *  Creates a Roast Beef class that extends Sandwich.
 *  This class creates the sandwich Roast Beef that costs $2.50.
 *  This sandwich class can be called upon in Main to create a sandwich
 *  which can then have condiments added to it.
 */
public class RoastBeef extends Sandwich {

    public RoastBeef() {
        description = "Roast Beef";
    }

    public double cost() {
        return 2.50;
    }
}