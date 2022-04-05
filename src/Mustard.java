
/**
 *  Creates a Mustard class that extends CondimentDecorator.
 *  This class creates the condiment Mustard that costs $0.25 and can be added to any sandwich.
 *
 * @param sandwich instantiates a new sandwich object
 */
public class Mustard extends CondimentDecorator {
    Sandwich sandwich;

    public Mustard(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + ", Mustard";
    }

    public double cost() {
        return .25 + sandwich.cost();
    }
}