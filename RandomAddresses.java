import java.util.Random;


public class RandomAddresses {
        public static void main(String args[]) {

                Random rand = new Random();

                for (int i = 0; i < 50; i++){
                        char c = (char) ('A' + rand.nextInt(10));
                        int rand_int = rand.nextInt((1000 - 100)) + 100;
                        System.out.println(rand_int + " " + c + " " + "Street");
                }

                for (int i = 0; i < 50; i++){
                        int rand_int = rand.nextInt((1000 - 100)) + 100;
                        int rand_int2 = rand.nextInt(10) +1;
                        System.out.print(rand_int + " ");
                        if (rand_int2 == 1){
                                System.out.print(rand_int2 + "st");
                        }
                        else if (rand_int2 == 2){
                                System.out.print(rand_int2 + "nd");
                        }
                        else if (rand_int2 == 3){
                                System.out.print(rand_int2 + "rd");
                        }
                        else {
                                System.out.print(rand_int2 + "th");
                        }
                        System.out.println(" Street");
                }

        }

}
