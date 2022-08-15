package javafaqproblems;

import java.util.Scanner;

public class P13_FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number for which you need factorial: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        long fact = 1;

        /*
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }

         */

        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is = " + fact);
    }
}