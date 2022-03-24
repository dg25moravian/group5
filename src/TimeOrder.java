import java.awt.geom.NoninvertibleTransformException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import javax.swing.text.Position;


public class TimeOrder {

    public static ArrayList<Position> timeOrder() throws FileNotFoundException{
        Scanner scanner = new Scanner( new File("addresses.txt"));
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] letter = line.split(", ");
            String[] address = letter[1].split(", ");
            String timestamp = String.valueOf(line.split(", "));

            if (Character.isDigit(letter[0].charAt(0))){
                int secondNum = Integer.parseInt(letter[1]);
                int firstNum = Integer.parseInt(letter[0]);
            }

        }
        return null;
    }
}
