import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAddresses {

    Truck truck;

    /**
     * Constructor. Takes a Truck object and sets it to the Truck object in this class.
     * @param truck
     */
    public ReadAddresses(Truck truck){
        this.truck = truck;
    }

    /**
     * Reads the Addresses File and adds the houses to the Truck object.
     */
    public void read(){
        String line = "";
        String number = "";
        String time = "";
        char street = ' ';

        int count = 0;

        try{
            BufferedReader reader = new BufferedReader(new FileReader("addresses.txt"));
            while((line = reader.readLine()) != null)
            {

                if(line.charAt(2) != ' ')
                {
                    number = line.substring(0,3);
                    street = line.charAt(4);
                    time = line.substring(13,18);
                }
                else
                {
                    number = line.substring(0,2);
                    street = line.charAt(3);
                    time = line.substring(12,17);
                }
                Address a = new Address(Integer.valueOf(number), street, time);

                System.out.println("---------------------------------");
                System.out.println(count);
                count++;
                System.out.println(line);
                System.out.println(a.toString());
                System.out.println("---------------------------------");
                truck.addHouse(a);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
