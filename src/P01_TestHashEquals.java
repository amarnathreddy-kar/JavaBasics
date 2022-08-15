
/*
Note: As per the Java documentation, both the methods should be overridden to get the complete equality mechanism;
using equals() alone is not sufficient. It means, if we override the equals(), we must override the hashcode()
method. */
public class P01_TestHashEquals {
    public static void main(String[] args) {
        String a = "Amarnath";
        String b = "Amarnath";

        if(a.equals(b)){
            System.out.println("String a & b are equal, and their respective haschodes are "+a.hashCode()+
            " & "+b.hashCode());
        }

        if(a==b){
            System.out.println("a == b");
        }else {
            System.out.println("a != b");
        }

        String c = "Raju";
        String d = "Reddy";

        if(!c.equals(d)){
            System.out.println("String c & d are not equal and their respective hashcodes are "+
                    c.hashCode()+" & "+d.hashCode());
        }

        if(c==d){
            System.out.println("c == d");
        } else {
            System.out.println("c != d");
        }
    }
}
