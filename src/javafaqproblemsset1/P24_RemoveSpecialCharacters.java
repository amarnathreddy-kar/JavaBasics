package javafaqproblemsset1;

import java.util.Arrays;

public class P24_RemoveSpecialCharacters {

    public static void main(String[] args) {

        String str = "È ÉÊËÌ Í  Î   Ï   Ð ÑÒÓÔ        Õ These are some sample ÉÊËÌ latin text symbols to be trimmed " +
                "ignoring the english text andnumbers like 0123564789";
        System.out.println("Length of String: "+str.length());

        //to remove/ replace with ""
        String interim = str.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println(interim);

        //interim string contains the blank spacing, let's trim
        String finalString = interim.trim();
        System.out.println(finalString);

        //String split
        System.out.println("String split based on space: ");
        Arrays.stream(finalString.split("\\s")).forEach(s-> System.out.println(s));


    }
}
