package javafaqproblemsset2;

import java.util.Scanner;

public class P04_TwoNumbersSumFromInput {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner((System.in));

            System.out.println("Enter first number: ");
            Integer firstNbr = scanner.nextInt();

            System.out.println("Enter second number: ");
            Integer secondNbr = scanner.nextInt();

            System.out.println("Sum of two numbers: " + (firstNbr + secondNbr));
            scanner.close();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid Input! Only number in Integer range are allowed");
            return;
        }
    }
}

