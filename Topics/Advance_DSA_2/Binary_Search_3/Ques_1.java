package Topics.Advance_DSA_2.Binary_Search_3;

public class Ques_1 {
    // Painters partition problem 
    // we have to pain n boreds of length A1,A2,..An there are K painters available and each take 1 unit of time to paint 1 unit of bored 
    // find the minimum time to get the job done 
    // NOTE : 1 painter will paint only countinues section of the borde
    // 2 painters cant share a bored 

    public static void main(String[] args) {
        int [] A = {8840,2280,4420,8890};
        int k = 4;
        System.out.println(minimumTime(A,k));
    }

    private static int minimumTime(int[] a, int k) {

        int low = findMax(a);
        int high = sumOfArray(a);

        int ans = 0;

        while (low<= high) {
            int mid = low + (high - low) / 2;
            if( checK(mid,a,k)){
                ans= mid;
                high= mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
        
    }

    private static boolean checK(int mid, int[] a, int k) {
       int sum = 0;
       int count = 1;
       for(int i = 0; i < a.length; i++){
        sum += a[i];
        if( sum > mid){
          count++;
          sum = a[i];
          if( count >k){
            return false;
          }
        }
       }
       return true;
    }

    private static int sumOfArray(int[] a) {
        int sum = 0;

        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    private static int findMax(int[] a) {
        int maxValue = a[0];
        for(int i=0;i< a.length;i++){
            if(a[i] > maxValue){
                maxValue = a[i];
            }
        }
        return maxValue;
    }
}
