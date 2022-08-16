package javafaqproblemsset2;

import java.util.Scanner;

public class P05_EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number");

        try{
            Integer number = scan.nextInt();
            if(number%2 == 0){
                System.out.println(number+" is an even number");
            } else {
                System.out.println(number+" is odd number");
            }

            scan.close();
        } catch (java.util.InputMismatchException e){
            System.out.println("Please enter a valid number");
            return;
        }
    }
}
