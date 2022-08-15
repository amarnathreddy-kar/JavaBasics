package javafaqproblems;

//A prime number is always > 1
//has only two factors i.e., 1 and itself

import java.util.Scanner;

public class P11_IsPrimeNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0;

        if (num > 1){
            for(int i =1; i<=num;i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(num+" is a prime number.");
            } else{
                System.out.println(num+" is not a prime number.");
            }

        } else {
            System.out.println("Not a prime number");
        }
    }
}
