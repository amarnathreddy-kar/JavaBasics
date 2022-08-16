package javafaqproblemsset1;

import java.util.Arrays;
import java.util.Collections;

public class P23_SortingElementsArray {
    public static void main(String[] args) {

        //1. Approach - using parallel sorting method

        int a[] = {30,25,68,54,2,1};
        System.out.println("Before Sorting Array a[]: "+ Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After  Sorting Array a[]: "+ Arrays.toString(a));

        //2. Approach - using Arrays.sort
        int b[] = {8,9,56,2,7,9,1};
        System.out.println("Before Sorting Array b[]: "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("After  Sorting Array b[]: "+Arrays.toString(b));

        //3. Approach - to sort in reverse/ descending order
        Integer c[] = {3,9,5,4,10,43,89,91};
        System.out.println("Before Sorting Array c[]: "+Arrays.toString(c));
        Arrays.sort(c, Collections.reverseOrder());
        System.out.println("After  Sorting Array c[]: "+Arrays.toString(c));
    }
}
