/*
  This class writes a file of 100 randomly chosen addresses. The file holds 1 address on each line.
  It takes a filename argument so multiple RandomAddresses Objects can be created and
  write to different files.
 */


import java.io.IOException;
import java.util.Random;
import java.io.FileWriter;


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
                int houseNumber = (rand.nextInt(100) + 1) * 10;
                if (randomVariable == 0) {
                        writeNumericalStreet(numStreet, houseNumber, writer);
                }
                else {
                        writeAlphabeticalStreet(numStreet, houseNumber, writer);
                }
        }


        /**
         * This method writes to the output file for Street names that are numbers.
         * @param numStreet
         * @param houseNumber
         * @param writer
         * @throws IOException
         */
        private static void writeNumericalStreet(int numStreet, int houseNumber, FileWriter writer) throws IOException {
                writer.write(houseNumber + " " + (numStreet + 1) + " Street\n");
        }

        /**
         * This method writes to the output file for Street names that are letters.
         * @param numStreet
         * @param houseNumber
         * @param writer
         * @throws IOException
         */
        private static void writeAlphabeticalStreet(int numStreet, int houseNumber, FileWriter writer) throws IOException {
                char streetLetter = (char) ('A' + numStreet);
                writer.write(houseNumber + " " + streetLetter + " Street\n");
        }

}
