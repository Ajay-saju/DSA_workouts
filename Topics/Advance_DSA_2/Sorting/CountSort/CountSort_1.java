package CountSort;

import java.util.Arrays;

/**
 * CountSort_1
 */
public class CountSort_1 {

    // find the smallest number that can be forremed by reamining the digits of
    // givennumber in a array.Return the smallest number in the form an array
    //Eg: {6,3,4,2,7,2,1}, ans= {1,2,2,3,4,6,7}

    // T.C o(n)
    // S.c o(n)

    public static void main(String[] args) {

        int []arr= {6,3,4,2,7,2,1};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
    }

    private static void countSort(int[] arr) {
        // for count sort first we have need a frequency array 

        int[] freq = new int [10];
        for(int i =0;i< arr.length;i++){
            int val = arr[i];
            freq[val]= freq[val]+1; 
        }

        // Using this frequency array creata a answer array
        
        int[]ans= new int[arr.length];
        int index=0;
        for(int d= 0;d< freq.length;d++){
            for(int count = 0;count< freq[d];count++){
             ans[index]= d;
             index++;
            }
        }
        System.out.println(Arrays.toString(ans));
        
    }


}
