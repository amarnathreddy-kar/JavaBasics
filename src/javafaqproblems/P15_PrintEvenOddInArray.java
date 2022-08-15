package javafaqproblems;

import java.util.Arrays;

public class P15_PrintEvenOddInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        //extract even numbers and odd numbers from the above array
        System.out.println("Even numbers of the above array: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers from the above array: ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
