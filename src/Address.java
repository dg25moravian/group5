
public class Address
{
    private int number;
    private char street;
    private String time;

    public Address()
    {
        number = 1;
        street = 'a';
        time = "12:00";
    }
    public Address(int n, char s)
    {
        number = n;
        street = s;
        time = "12:00";
    }
    public Address(int n, char s, String t)
    {
        number = n;
        street = s;
        time = t;
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
