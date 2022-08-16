package javafaqproblemsset1;

public class P26_CountCharOccurence {
    public static void main(String[] args) {

        String str = "Java Programming";
        int cntWithAs = str.length();

        String withoutAs = str.replace("a","");
        int cntWithoutAs = withoutAs.length();

        int count = cntWithAs - cntWithoutAs;
        System.out.println("Total occurence of 'a' is = "+count);


    }
}
