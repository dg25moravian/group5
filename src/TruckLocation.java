/**
 * Tells customer where the truck is currently at based on orders
 */
public class TruckLocation implements Observer{

    Address address;

    public TruckLocation(){
    }

    @Override
//    public void update(char streetName,int streetNumber) {
    public void update(Address address) {
        System.out.println("Hello customer! The truck is currently on:" +
                "\n" + "Street name: " + address.getStreet() +
                "\n" + "Street number: " + address.getNumber());


//    pop p = new pop(streetName,streetNumber);
        pop p = new pop(address);

    }
}