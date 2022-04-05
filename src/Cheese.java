
/**
 *  Creates a Cheese class that extends CondimentDecorator.
 *  This class creates the condiment Cheese that costs $0.75 and can be added to any sandwich.
 *
 * @param sandwich instantiates a new sandwich object
 */
public class Cheese extends CondimentDecorator {
    Sandwich sandwich;

    public Cheese(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + ", Cheese";
    }

    public double cost() {
        return .75 + sandwich.cost();
    }
}