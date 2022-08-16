package javafaqproblemsset1;

import java.util.Random;

public class P12_GenerateRandomNbrsAndStrings {
    public static void main(String[] args) {

        //1. Using Random class
        Random random = new Random();
        //this will generate a number in the range 1 to 6 (like dice)
        int rand = random.nextInt(7);
        if (rand != 0 ){
            System.out.println(rand);
        }

        //double range 0.0 and <1.0
        double rand_dbl = random.nextDouble();
        System.out.println(rand_dbl);

        //2. Using Math Class
        System.out.println(Math.round(Math.random()*1000)+1000000000); //generates a random number between ten digit number

        //3. Using Apace commons - lang API

    }
}
