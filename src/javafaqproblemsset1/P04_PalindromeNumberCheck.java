package javafaqproblemsset1;

import java.util.Scanner;

public class P04_PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        try{
            int num = scanner.nextInt();
            int org_num = num;

            String aNbr = String.valueOf(num);
            StringBuilder sb = new StringBuilder(aNbr);
            sb = sb.reverse();
            //to check the datatype of sb
            System.out.println("data type of sb is: "+sb.getClass().getSimpleName());

            String str = sb.toString();
            System.out.println("data type of str is: "+str.getClass().getSimpleName());
            int res = Integer.parseInt(str);
            System.out.println("Reversed Number: "+res);
            System.out.println("Datatype of res is: "+((Object)res).getClass().getSimpleName());
            System.out.println("Datatype of org_num is: "+((Object)org_num).getClass().getSimpleName());;

            if (org_num == res) {
                System.out.println("The number is palindrome");
            } else {
                System.out.println("The entered number is not a palindrome");
            }
        }
        catch (java.util.InputMismatchException e)
        {
            System.out.println("Invalid Input! Only number in Integer range are allowed");
            return;
        }

    }
}
