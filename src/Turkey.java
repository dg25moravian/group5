
/**
 *  Creates a Turkey class that extends Sandwich.
 *  This class creates the sandwich Turkey that costs $1.50.
 *  This sandwich class can be called upon in Main to create a sandwich
 *  which can then have condiments added to it.
 */
public class Turkey extends Sandwich {

    public Turkey() {
        description = "Turkey";
    }

    public double cost() {
        return 1.50;
    }
}