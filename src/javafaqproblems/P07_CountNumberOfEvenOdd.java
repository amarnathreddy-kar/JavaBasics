package javafaqproblems;

public class P07_CountNumberOfEvenOdd {
    public static void main(String[] args) {
        //1. num%10 will give the ones digit
        //2. keep num/10 to minimize the digit count like 100s, 10s, etc.

        int num = 222215;
        System.out.println(num);
        int even_count = 0;
        int odd_count = 0;

        while (num > 0){
            int rem = num %10;
            if (rem%2 == 0){
                even_count++;
            } else {
                odd_count++;
            }
            num=num/10;
        }

        System.out.println("Number of even digits: "+even_count);
        System.out.println("Number of odd digits: "+odd_count);

    }
}
