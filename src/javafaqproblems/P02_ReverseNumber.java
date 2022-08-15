package javafaqproblems;

import java.util.Scanner;

public class P02_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("You Entered: "+number);

        //1. using a while loop
        int rev = 0;
        while(number !=0){
            rev = rev*10 + number%10;
            number=number/10;
        }
        System.out.println("Reversed number is: "+rev);

        //2. Convert to StringBuilder
        System.out.println("Enter another number: ");
        int aNbr = scanner.nextInt();
        String str = Integer.toString(aNbr);
        StringBuilder sbStr = new StringBuilder(str);
        sbStr.reverse();
        System.out.println("Reversed number is: "+sbStr);
    }
}
