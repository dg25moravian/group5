
/**
 *  Creates a Ketchup class that extends CondimentDecorator.
 *  This class creates the condiment Ketchup that costs $0.25 and can be added to any sandwich.
 *
 * @param sandwich instantiates a new sandwich object
 */
public class Ketchup extends CondimentDecorator {
    Sandwich sandwich;

    public Ketchup(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + ", Ketchup";
    }

    public double cost() {
        return .25 + sandwich.cost();
    }
}