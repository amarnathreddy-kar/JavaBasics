package javafaqproblemsset1;

import java.util.Scanner;

public class P27_WordCountInString {

    public static void main(String[] args) {
        System.out.println("Enter a comprehensive passage for what you need word count: ");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int count = 1;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println("Total word count is: "+count);
    }
}
