import java.util.Arrays;

public class P01_StringOperations {
    public static void main(String[] args) {
        String names = "Peter, Paul, Mary, Kagan";
        String [] result = names.split(",");
        System.out.println(Arrays.toString(result));

        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println("Capacity of the above sb is: "+sb.capacity());
        sb.trimToSize();
        System.out.println("Trim the capacity to actual size: "+sb.capacity());
        System.out.println("Length of the above sb is: "+sb.length());

        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println("What is the value displayed by the expression hannah.length()? Answer: "+hannah.length());
        System.out.println("What is the value returned by the method call hannah.charAt(12)? Answer: "+hannah.charAt(12));
        System.out.println("Write an expression that refers to the letter b in the string referred to by hannah. Answer: "+hannah.indexOf('b'));
        //for the above you can extract hannah.charAt(15). Used indexOf instead of counting and print out the 'b'

        String subStr = "Was it a car or a cat I saw?".substring(9, 12);
        System.out.println("How long is the string returned by the following expression? What is the string?");
        System.out.println(subStr.length());
        System.out.println(subStr);

    }
}
