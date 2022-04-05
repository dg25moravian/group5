
/**
 *  Creates a class in which a sandwich object is instantiated.
 *  Can be called upon to give the description of a sandwich in Main.
 */
public abstract class Sandwich {
    String description = "Unknown Sandwich";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
