package javafaqproblems;

import java.util.Arrays;
import java.util.HashSet;

public class P19_DuplicateArrayElement {
    public static void main(String[] args) {

        String arr[] = {"Java", "C", "C++", "Python", "JavaScript", "Flutter","Katlon"};
        //1. Using two for loop and flag assignment
    /*
        //1. comparing each element in an array
        boolean flag = false;

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Found duplicate element: "+arr[i]);
                    flag = true;
                }
            }
        }
        if(flag==false){
            System.out.println("No duplicates found");
        }

     */

        //2. Using HashSet dataset approach
        HashSet <String> arraySet = new HashSet<>();
        //Set by implementation will not allow duplicates and does not maintain any particular order
        //arraySet.addAll(Arrays.asList(arr));
        //System.out.println(arraySet);

        boolean flag = false;
        for(String l:arr){
            if(!arraySet.add(l)){
                System.out.println("Found duplicate element: "+l);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("No duplicates found");
        }
    }
}
