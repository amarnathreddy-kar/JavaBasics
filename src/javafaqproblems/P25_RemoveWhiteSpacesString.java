package javafaqproblems;

public class P25_RemoveWhiteSpacesString {

    public static void main(String[] args) {
        String str = "Java Programming   spring  boot microservices";
        System.out.println("Before removing the spaces: "+str);

        String finalStr = str.replaceAll("\\s","");
        System.out.println("After removing the spaces: "+finalStr);
    }
}
