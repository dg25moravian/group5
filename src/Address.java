public class Address
{
    private int number;
    private char street;

    public Address(int n, char s)
    {
        number = n;
        street = s;
    }
    public char getStreet()
    {
        return street;
    }
    public int getNumber()
    {
        return number;
    }
}
