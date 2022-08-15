package javafaqproblems;

import java.util.Arrays;

public class P20_LinearSearchInArray {
    public static void main(String[] args) {

        Integer arr[] = {2,34,21,9,83,90};
        //System.out.println(Arrays.toString(arr));
        int i=0;
        int e = 83;
        boolean flag = false;

        for(i=0;i<arr.length;i++){
            if(e == arr[i]){
                System.out.println(arr[i]+ " found at index["+i+"] that is at position "+(++i));
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("Element not found");
    }
}
