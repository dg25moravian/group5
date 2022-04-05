
/**
 *  Creates a Ham class that extends Sandwich.
 *  This class creates the sandwich Ham that costs $1.50.
 *  This sandwich class can be called upon in Main to create a sandwich
 *  which can then have condiments added to it.
 */
public class Ham extends Sandwich {
  
	public Ham() {
		description = "Ham";
	}
  
	public double cost() {
		return 1.50;
	}
}

