package javafaqproblemsset2;

import java.util.Scanner;

public class P06_PrintMulitpleTableofUserInput {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter any number for multiplication table: ");
            Integer n = scanner.nextInt();

            System.out.println("--------------------------------");
            System.out.println("Your Multiplication Table is: ");
            System.out.println("--------------------------------");
            for(int i=1;i<=20; i++){
                System.out.println(n+" x "+i+" = "+(n*i));
            }
            System.out.println("--------------------------------");

            scanner.close();
        } catch (java.util.InputMismatchException e){
            System.out.println("Please enter a valid number");
            return;
        }
    }
}
