package CountSort;
import java.util.Arrays;

public class Partition {
    

    // Given an integer array, consider the first element as the pivot rearrange the elements 
    // Eg: [54, 26, 93, 17, 77, 31, 44, 55, 20]
    
    // ans = [31, 26, 20, 17, 44, 54, 77, 55, 93]
    public static void main(String []args){

        int []arr= {54,26,93,17,77,31,44,55,20};
        
        System.out.println(Arrays.toString(arr));
       
        int first = 0;
        int last = arr.length-1;

        arrPartition(arr,first,last);
    }

    private static void arrPartition(int[] arr, int first, int last) {
    

        int pivotValue= arr[first];
        int l = first+1;
        int r = last;

        while( l<= r){
            if( arr[l] <= pivotValue){
                l++;
            }else if( arr[r]> pivotValue){
                r--;
            }else{
                swap(arr,l,r);
                l++;
                r--;
            }
        }
        swap(arr, first, r);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int l, int r) {
        
        int temp = arr[l];
        arr[l]= arr[r];
        arr[r]= temp;
    }
}
