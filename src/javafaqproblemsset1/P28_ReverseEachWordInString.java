package javafaqproblemsset1;

import java.util.Arrays;

public class P28_ReverseEachWordInString {
    public static void main(String[] args) {
        //Input - Welcome To Java
        //Output - emocleW oT avaJ
        //Steps to follow in Approach1:
        // 1. Split the phrase. 2. Extract each word 3. reverse each word and 4. print to the console

        String str = "Hello World";

        String [] words = str.split(" ");
        //System.out.println(Arrays.toString(words));
        String reverseString = "";

        for (String sample: words){
            String reverseword= "";
            for(int i=sample.length()-1; i>=0;i--){
                reverseword=reverseword+sample.charAt(i);
            }
            reverseString = reverseString+reverseword+" ";
        }
        System.out.println("Final Output: "+reverseString);

        //Approach 2: Using in-built StringBuilder Implementation
        String str2 = "Reverse String with String Builder";
        String [] eachWord = str2.split("\\s");

        String reversedWord = "";

        for (String w:eachWord){
            StringBuilder builder = new StringBuilder(w);
            builder.reverse();

            reversedWord = reversedWord+builder.toString()+" ";
        }
        System.out.println("Final Output with String Builder built-in reverse() ");
        System.out.println(reversedWord);
    }
    }


