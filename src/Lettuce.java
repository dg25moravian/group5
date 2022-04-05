
/**
 *  Creates a Lettuce class that extends CondimentDecorator.
 *  This class creates the condiment Lettuce that costs $0.30 and can be added to any sandwich.
 *
 * @param sandwich instantiates a new sandwich object
 */
public class Lettuce extends CondimentDecorator {
    Sandwich sandwich;

    public Lettuce(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + ", Lettuce";
    }

    public double cost() {
        return .30 + sandwich.cost();
    }
}