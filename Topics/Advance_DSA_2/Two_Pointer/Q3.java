

public class Q3 {
    // find all the pairs which sum is K. (Elements are same).

    public static void main(String[]args){

        // int arr[] ={2,4,4,4,5,5,7,7,7,10,10,15};
        int[] arr={1,2,6,6,7,9,9};

        int k = 14;
        solve(arr,k);
        
    }

    private static void solve(int[] arr, int k) {
      
        int i = 0;
        int j = arr.length-1;
        int ans  =0;

        while ( i < j){
            int sum = arr[i]+ arr[j];

            if( sum > k ){
                j--;
            }else if ( sum < k ){
                i++;
            }else{

                if( arr[i] == arr[j]){

                    int n = j-i+1;

                    ans += n * (n-1)/2;
                    break;

                }else{

                    int ii = i;

                    int jj = j ;
                    

                   while( arr[ii] ==arr[i] ){
                    ii ++;
                   }
                   int count1 = ii - i;
                   i = ii;  

                   while ( arr[jj]== arr[j]){

                    jj --;
                   }
                   int count2 = j -jj;
                   j = jj;

                   ans += count1 * count2; 


                }
            }
        }
        System.out.println(ans);
    }


}
