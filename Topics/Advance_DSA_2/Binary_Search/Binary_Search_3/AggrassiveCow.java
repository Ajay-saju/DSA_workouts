package Topics.Advance_DSA_2.Binary_Search.Binary_Search_3;

import java.util.Arrays;

public class AggrassiveCow {
    
    public static void main(String[] args) {
        int []arr= {5,17,100,11};
        int b= 2;
        System.out.println(solve(arr,b));
    }

    private static int  solve(int[] arr, int b) {
        
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        int low = min(arr);
        int high = arr[arr.length-1]- arr[0];
        int ans = low;
        while (low <= high){
            int mid = low + (high-low) / 2;
            if(check(mid,arr,b)){
                ans = mid;
                low = mid + 1 ;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }

   

    private static boolean check(int mid, int[] arr, int b) {
       
        int count = 1;
        int position = arr[0];
        for(int i = 0; i < arr.length; i++){

            if( arr[i]- position >= mid){
                count++;
                position = arr[i];

                if( count == b){
                    return true;
                }
            } 
        }
        return false;
        
    }

    private static int min(int[] arr) {
      int ans = arr[1]- arr[0];
      for (int i = 1; i < arr.length-1; i++) {
          ans = Math.min(ans, arr[i] - arr[i-1]);
      }
      return ans;
    }
}
