
/**
 *  Creates a Tomato class that extends CondimentDecorator.
 *  This class creates the condiment Tomato that costs $0.40 and can be added to any sandwich.
 *
 * @param sandwich instantiates a new sandwich object
 */
public class Tomato extends CondimentDecorator {
    Sandwich sandwich;

    public Tomato(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + ", Tomato";
    }

    public double cost() {
        return .40 + sandwich.cost();
    }
}