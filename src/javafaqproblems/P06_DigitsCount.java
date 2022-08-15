package javafaqproblems;

import java.util.Scanner;

public class P06_DigitsCount {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("You entered: "+num);

        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }
        System.out.println("The number has "+count+" digits.");
    }
}
