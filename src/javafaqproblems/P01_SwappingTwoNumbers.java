package javafaqproblems;

public class P01_SwappingTwoNumbers {

    public static void main(String[] args) {
        int a =10, b = 20;
        System.out.println("Before swapping a = "+a+" and b = "+b);
        //1. with third or temp variable
        int temp;
        temp = b; //temp = 20;
        b=a; //b = 10;
        a=temp; //a=20;
        System.out.println("After  swapping a = "+a+" and b = "+b);

        //2. without third variable
        int x = 40, y = 45;
        System.out.println("Before swapping x = "+x+" and y = "+y);
        x = x + y; //x=85
        y = x - y; //y=45
        x = x - y; //x=40
        System.out.println("After  swapping x = "+x+" and y = "+y);

        //3. In a single statement
        int l=80, m=90;
        System.out.println("Before swapping l = "+l+" and m = "+m);
        m = l+m-(l=m);
        System.out.println("After  swapping l = "+l+" and m = "+m);

    }
}
