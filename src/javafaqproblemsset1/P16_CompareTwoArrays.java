package javafaqproblemsset1;

public class P16_CompareTwoArrays {
    public static void main(String[] args) {

        //1. using in-built Arrays.equals
        /*
        int a1[] = {1,2,35,6};
        int a2[] = {1,2,35,6};


        boolean status = Arrays.equals(a1,a2);

        if(status==true){
            System.out.println("Both Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal");
        }
         */

        //2. logic with multi if-else conditional loop
    int arr1[] = {1,2,3,6};
    int arr2[] = {1,2,3,6};

    boolean status = true;
    if(arr1.length == arr2.length){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                status=false;
            }
        }
    }
    else {
        status=false;
    }
    if (status==true){
        System.out.println("Arrays are equal");
    } else{
        System.out.println("Arrays are not equal");
    }
    }

}
