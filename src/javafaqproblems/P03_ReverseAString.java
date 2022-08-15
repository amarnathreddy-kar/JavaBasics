package javafaqproblems;

public class P03_ReverseAString {
    public static void main(String[] args) {
        //1. using str.concat()
        String str = "AMAR";
        System.out.println("Before reversal: "+str);
        String result = "";

        for(int i=str.length()-1;i>=0;i--){
            result = result + str.charAt(i);
        }
        System.out.println(result);
        result=""; //to empty the result variable (to re-use it in the below code)

        //2. Using Character Array - char []
        String str2 = "ABCD";
        System.out.println("Before reversal: "+str2);
        char a[] = str2.toCharArray();
        for(int i = a.length-1;i>=0;i--){
            result = result+a[i];
        }
        System.out.println(result);

        //3. Using String Buffer Class
        StringBuffer sb = new StringBuffer("String");
        System.out.println("Before reversal: "+sb);
        sb.reverse();
        System.out.println("After reverse: "+sb);

    }

}
