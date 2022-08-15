package javafaqproblems;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P14_SumOfArrayElements {
    public static void main(String[] args) {
        int a[] = {5,2,7,9,6};
        int sum = 0;

        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("Total/ Sum of Array elements: "+sum);
        sum =0;
        //enhanced for-loop
        for(int num:a){
            sum=sum+num;
        }
        System.out.println("for-each loop: "+sum);

        //with streams
        System.out.println("with streams");
        Integer aSum = Arrays.stream(a).sum();
        System.out.println(aSum);
    }


}
