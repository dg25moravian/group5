public interface Strategy
{
    abstract void addHouse(Address a);
    abstract Address nextHouse();
    abstract void changeLoc(Address l);

}
