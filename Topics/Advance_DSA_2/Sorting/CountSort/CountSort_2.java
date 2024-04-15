package CountSort;
import java.util.Arrays;

public class CountSort_2 {

    // count sort with Negative numbers
    // T.C = O(Range + N)/ O(n)
    // S.C = O(Range) 
    // here range is length of frequncy array

    
    public static void main(String []args){


        int[] arr={-2,3,8,3,-2,3};

        System.out.println(Arrays.toString(arr));

        countSort2(arr); 

    }

    private static void countSort2(int[] arr) {
       
        // find min and max in array

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for( int i =0;i< arr.length;i++){
            if( arr[i]< min ){
                min = arr[i];
            }
            if(arr[i]> max){
                max= arr[i];
            }
        }
        
        // FInd the length of the frequency array

        int []freq = new int[max-min+1];
        for(int i =0;i< arr.length;i++){
            int val = arr[i];
            freq[val-min] = freq[val-min]+1;
        }

        // create a ans array 

        int []ans = new int[arr.length];

        int index = 0;
        
        // itreate over the digits in frequancy array 

        for(int d =0;d< freq.length;d++){
            for ( int count =0; count< freq[d];count++){
                ans[index] = d+min;
                index++;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
