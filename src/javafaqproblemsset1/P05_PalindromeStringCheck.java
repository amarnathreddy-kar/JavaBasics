package javafaqproblemsset1;

import java.util.Scanner;

public class P05_PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        try{
            String str = scanner.next();
            String InputStr = str.toUpperCase();
            System.out.println("Your Entered: "+InputStr);
            String res ="";

            for(int i=str.length()-1;i>=0;i--){
                res = res + str.charAt(i);
            }
            System.out.println("Revered String: "+res.toUpperCase());

            if(InputStr.equalsIgnoreCase(res)){
                System.out.println("String is palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }
        catch (java.util.InputMismatchException e)
        {
            System.out.println("Invalid Input! Please enter a valid String");
            return;
        }
    }
}
