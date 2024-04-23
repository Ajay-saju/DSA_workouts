package CountSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort3 {
    
    // Given 2 array , A[n] , B[m] calculate the number of paires i,j such that A[i] > B[j] 
    // Eg A[3] = 7,0,3
    // B[3] = 2,0,6
    // paires - (7,2),(7,0) (7,6) (3,2) (3,0) ans = 5;

    // BF - use 2 loop
    
    public static void main(String []args){
        int[]a = {7,0,3};
        int []b = {2,0,6};

        findPairs(a,b);
    }

    private static void findPairs(int[] a, int[] b) {
        
        Arrays.sort(a);
        Arrays.sort(b);
        merge(a,b);
    }

    private static void merge(int[] a, int[] b) {
       
        int []ans = new int[a.length + b.length];

        int index = 0;
        int count = 0;
        int p1 = 0;
        int p2 = 0;

        while ( p1< a.length && p2 < b.length){

            if( a[p1]> b[p2]){
                ans[index] = b[p2];
                count = count + a.length- p1;
                p2++;
                index++;
            }else{

                ans[index] = a[p1];
                p1++;
                index++;

            }
        }
        System.out.println(count);
    }
}
