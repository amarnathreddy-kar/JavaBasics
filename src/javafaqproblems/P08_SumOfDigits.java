package javafaqproblems;

public class P08_SumOfDigits {

    public static void main(String[] args) {
        int n = 196;
        System.out.println("Enter an integer: "+n);
        int sum = 0;
        while (n > 0){
            sum=sum+ n%10;
            n=n/10;
        }
        System.out.println("Sum is : "+sum);
    }
}
