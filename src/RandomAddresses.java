/*
  This class writes a file of 100 randomly chosen addresses. The file holds 1 address on each line.
  It takes a filename argument so multiple RandomAddresses Objects can be created and
  write to different files.
 */


import java.io.IOException;
import java.util.Random;
import java.io.FileWriter;
import java.util.Random;


public class RandomAddresses {

        public final FileWriter writer;
        public final Random rand;
        public String filename;

        /**
         * The constructor initializes the filename, the random object, and the FileWriter object using the filename.
         * Then calls on selectAddress() 100 times select random addresses and then closes the file.
         * @param filename
         * @throws IOException
         */
        public RandomAddresses(String filename) throws IOException {
                this.filename = filename;
                this.rand = new Random();
                this.writer = new FileWriter(filename);
                for (int i = 0; i < 100; i++){
                        selectAddress(rand, writer);
                }
                writer.close();
        }

        /**
         * Selects a random street number and house number to send to the write methods based on a random
         * variable integer. This helps to randomize the order in which streets are selected.
         * @param rand
         * @param writer
         * @throws IOException
         */
        private static void selectAddress(Random rand, FileWriter writer) throws IOException{
                int randomVariable = rand.nextInt(2);
                int numStreet = rand.nextInt(10);
                int houseNumber = (rand.nextInt(10) + 1) * 10;
                writeAlphabeticalStreet(numStreet, houseNumber, writer);
        }


        /**
         * This method writes to the output file for Street names that are numbers.
         * @param numStreet
         * @param houseNumber
         * @param writer
         * @throws IOException
         */



        private static void writeNumericalStreet(int numStreet, int houseNumber, FileWriter writer) throws IOException {
                Sandwich sandwich1 = new Ham();
                Sandwich sandwich2 = new Turkey();
                Sandwich sandwich3 = new RoastBeef();
                Random oneToThree = new Random();
                int sandwichNum = oneToThree.nextInt(4 - 1) +1;
                Random oneToSix = new Random();
                int condimentNum = oneToSix.nextInt(7 - 1) + 1;
                Random hour = new Random();
                int hourNum = hour.nextInt(16 - 9 + 1) + 9;
                Random min = new Random();
                int minNum = min.nextInt(59 - 10 +1) + 10;
                if(hourNum < 10)
                {
                        writer.write(houseNumber + " " + (numStreet + 1) + " Street 0" + hourNum + ":" + minNum + " ");

                }
                else
                {
                        writer.write(houseNumber + " " + (numStreet + 1) + " Street " + hourNum + ":" + minNum + " ");
                }
                if (sandwichNum == 1){
                        if (condimentNum == 1){
                                sandwich1 = new Cheese(sandwich1);
                                sandwich1 = new Lettuce(sandwich1);
                        }
                        if (condimentNum == 2){
                                sandwich1 = new Ketchup(sandwich1);
                        }
                        if (condimentNum == 3){
                                sandwich1 = new Lettuce(sandwich1);
                                sandwich1 = new Mayonnaise(sandwich1);
                                sandwich1 = new Mustard(sandwich1);
                        }
                        if (condimentNum == 4){
                                sandwich1 = new Lettuce(sandwich1);
                                sandwich1 = new Tomato(sandwich1);
                        }
                        if (condimentNum == 5){
                                sandwich1 = new Mustard(sandwich1);
                        }
                        if (condimentNum == 6){
                                sandwich1 = new Tomato(sandwich1);
                        }
                        writer.write(sandwich1.getDescription() + "\n");
                }
                if (sandwichNum == 2){
                        if (condimentNum == 1){
                                sandwich2 = new Cheese(sandwich2);
                                sandwich2 = new Lettuce(sandwich2);
                        }
                        if (condimentNum == 2){
                                sandwich2 = new Ketchup(sandwich2);
                        }
                        if (condimentNum == 3){
                                sandwich2 = new Lettuce(sandwich2);
                                sandwich2 = new Mayonnaise(sandwich2);
                                sandwich2 = new Mustard(sandwich2);
                        }
                        if (condimentNum == 4){
                                sandwich2 = new Lettuce(sandwich2);
                                sandwich2 = new Tomato(sandwich2);
                        }
                        if (condimentNum == 5){
                                sandwich2 = new Mustard(sandwich2);
                        }
                        if (condimentNum == 6){
                                sandwich2 = new Tomato(sandwich2);
                        }
                        writer.write(sandwich2.getDescription() + "\n");
                }
                if (sandwichNum == 3){
                        if (condimentNum == 1){
                                sandwich3 = new Cheese(sandwich3);
                                sandwich3 = new Lettuce(sandwich3);
                        }
                        if (condimentNum == 2){
                                sandwich3 = new Ketchup(sandwich3);
                        }
                        if (condimentNum == 3){
                                sandwich3 = new Lettuce(sandwich3);
                                sandwich3 = new Mayonnaise(sandwich3);
                                sandwich3 = new Mustard(sandwich3);
                        }
                        if (condimentNum == 4){
                                sandwich3 = new Lettuce(sandwich3);
                                sandwich3 = new Tomato(sandwich3);
                        }
                        if (condimentNum == 5){
                                sandwich3 = new Mustard(sandwich3);
                        }
                        if (condimentNum == 6){
                                sandwich3 = new Tomato(sandwich3);
                        }
                        writer.write(sandwich3.getDescription() + "\n");
                }
        }

        /**
         * This method writes to the output file for Street names that are letters.
         * @param numStreet
         * @param houseNumber
         * @param writer
         * @throws IOException
         */
        private static void writeAlphabeticalStreet(int numStreet, int houseNumber, FileWriter writer) throws IOException {
                Sandwich sandwich1 = new Ham();
                Sandwich sandwich2 = new Turkey();
                Sandwich sandwich3 = new RoastBeef();
                Random oneToThree = new Random();
                int sandwichNum = oneToThree.nextInt(4 - 1) + 1;
                Random oneToSix = new Random();
                int condimentNum = oneToSix.nextInt(7 - 1) + 1;
                Random hour = new Random();
                int hourNum = hour.nextInt(16 - 9 + 1) + 9;
                Random min = new Random();
                int minNum = min.nextInt(59 - 10 + 1) + 10;
                char streetLetter = (char) ('a' + numStreet);

                if(hourNum < 10)
                {
                        writer.write(houseNumber + " " + streetLetter + " Street 0" + hourNum + ":" + minNum + " ");

                }
                else
                {
                        writer.write(houseNumber + " " + streetLetter + " Street " + hourNum + ":" + minNum + " ");
                }

                //writer.write(houseNumber + " " + streetLetter + " Street " + hourNum + ":" + minNum + " ");
                if (sandwichNum == 1){
                        if (condimentNum == 1){
                                sandwich1 = new Cheese(sandwich1);
                                sandwich1 = new Lettuce(sandwich1);
                        }
                        if (condimentNum == 2){
                                sandwich1 = new Ketchup(sandwich1);
                        }
                        if (condimentNum == 3){
                                sandwich1 = new Lettuce(sandwich1);
                                sandwich1 = new Mayonnaise(sandwich1);
                                sandwich1 = new Mustard(sandwich1);
                        }
                        if (condimentNum == 4){
                                sandwich1 = new Lettuce(sandwich1);
                                sandwich1 = new Tomato(sandwich1);
                        }
                        if (condimentNum == 5){
                                sandwich1 = new Mustard(sandwich1);
                        }
                        if (condimentNum == 6){
                                sandwich1 = new Tomato(sandwich1);
                        }
                        writer.write(sandwich1.getDescription() + "\n");
                }
                if (sandwichNum == 2){
                        if (condimentNum == 1){
                                sandwich2 = new Cheese(sandwich2);
                                sandwich2 = new Lettuce(sandwich2);
                        }
                        if (condimentNum == 2){
                                sandwich2 = new Ketchup(sandwich2);
                        }
                        if (condimentNum == 3){
                                sandwich2 = new Lettuce(sandwich2);
                                sandwich2 = new Mayonnaise(sandwich2);
                                sandwich2 = new Mustard(sandwich2);
                        }
                        if (condimentNum == 4){
                                sandwich2 = new Lettuce(sandwich2);
                                sandwich2 = new Tomato(sandwich2);
                        }
                        if (condimentNum == 5){
                                sandwich2 = new Mustard(sandwich2);
                        }
                        if (condimentNum == 6){
                                sandwich2 = new Tomato(sandwich2);
                        }
                        writer.write(sandwich2.getDescription() + "\n");
                }
                if (sandwichNum == 3){
                        if (condimentNum == 1){
                                sandwich3 = new Cheese(sandwich3);
                                sandwich3 = new Lettuce(sandwich3);
                        }
                        if (condimentNum == 2){
                                sandwich3 = new Ketchup(sandwich3);
                        }
                        if (condimentNum == 3){
                                sandwich3 = new Lettuce(sandwich3);
                                sandwich3 = new Mayonnaise(sandwich3);
                                sandwich3 = new Mustard(sandwich3);
                        }
                        if (condimentNum == 4){
                                sandwich3 = new Lettuce(sandwich3);
                                sandwich3 = new Tomato(sandwich3);
                        }
                        if (condimentNum == 5){
                                sandwich3 = new Mustard(sandwich3);
                        }
                        if (condimentNum == 6){
                                sandwich3 = new Tomato(sandwich3);
                        }
                        writer.write(sandwich3.getDescription() + "\n");
                }
        }

}
