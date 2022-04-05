
/**
 *  Creates a Mayonnaise class that extends CondimentDecorator.
 *  This class creates the condiment Mayonnaise that costs $0.25 and can be added to any sandwich.
 *
 * @param sandwich instantiates a new sandwich object
 */
public class Mayonnaise extends CondimentDecorator {
    Sandwich sandwich;

    public Mayonnaise(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + ", Mayonnaise";
    }

    public double cost() {
        return .25 + sandwich.cost();
    }
}