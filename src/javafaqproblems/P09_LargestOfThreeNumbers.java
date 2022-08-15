package javafaqproblems;

import java.util.Scanner;

public class P09_LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int n3 = scanner.nextInt();

        /*
        if(n1>n2 && n1>n3){
            System.out.println(n1+ " is the largest number");
        } else if (n2>n1 && n2 > n3){
            System.out.println(n2+ " is the largest number");
        } else {
            System.out.println(n3+ " is the larget numbers");
        }
         */

        //Using Ternary operator
        //int temp = n1>n2?n1:n2; //largest of n1 and n2 is in temp var now
        //int largest = n3>temp?n3:temp;

        //trying to put it into a single expression
        int largest = n3>(n1>n2?n1:n2)?n3:(n1>n2?n1:n2);

        System.out.println("Largest of the three numbers is: "+largest);

    }
}
