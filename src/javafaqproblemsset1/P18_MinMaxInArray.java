package javafaqproblemsset1;

import java.util.Arrays;

public class P18_MinMaxInArray {
    public static void main(String[] args) {

        //to find element of max value
        int arr[] = {25,22,89,2,2,5,9,89};
        int max= arr[0];

        for (int i = 0; i<arr.length; i++ ){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Scanning through Array: "+ Arrays.toString(arr));
        System.out.println("Maximum element in a given array is: "+max);

        //to find element of min value
        int arr1[] = {-2,03, -9,90,86,43};
        int min = arr[0];

        for(int j=0; j<arr1.length; j++){
            if(arr1[j] < min ){
                min = arr1[j];
            }
        }
        System.out.println("Scanning through Array: "+ Arrays.toString(arr1));
        System.out.println("Minimum element in a given array is: "+min);
    }
}
