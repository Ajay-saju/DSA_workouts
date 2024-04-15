package CountSort;

import java.util.Arrays;

public class MergeSort {

    // Merge two sorted array
    // Given an integer array where all odd elements are sorted and even elements
    // are sorted we have to sort the entire array

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 8, 11, 13, 10, 15, 21 };
        System.out.println(Arrays.toString(arr));
        merge2SortedArray(arr);
    }

    private static void merge2SortedArray(int[] arr) {

        // find the count of odd elements and even elements
        int oddElemets = 0;
        int evenElements = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenElements++;
            } else {
                oddElemets++;
            }
        }
        
        // create odd array and even array

        int []oddArr= new int[oddElemets];
        int []evenArr= new int[evenElements];

        // add values to the arrays
       int oddIntex=0;
       int evenIntex=0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]%2==0){
                evenArr[evenIntex]= arr[i];
                evenIntex++;
            }else{
                oddArr[oddIntex]= arr[i];
                oddIntex++;
            }
        }

        // creating 2 pointers to compaire this elements and store to ans array 
        int index =0;
         oddIntex=0;
         evenIntex=0;
        while ( oddIntex != oddArr.length && evenIntex != evenArr.length){
            if(oddArr[oddIntex]< evenArr[evenIntex]){
                arr[index]= oddArr[oddIntex];
                oddIntex++;
                index++;
            }else{
                arr[index]= evenArr[evenIntex];
                index++;
                evenIntex++;
            }
        }
        for( int i =oddIntex;i< oddArr.length;i++){
            arr[index]= oddArr[i];
            index++;
            
        }
        for(int j= evenIntex;j< evenArr.length;j++){
            arr[index]= evenArr[j];
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }

}
