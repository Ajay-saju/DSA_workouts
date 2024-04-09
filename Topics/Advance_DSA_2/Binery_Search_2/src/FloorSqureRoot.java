public class FloorSqureRoot {
    public  static  void  main(String[]args){
        int n = 2147483647 ;
        System.out.println(findSqureRoot(n));
    }

    private static int findSqureRoot(int n) {

        int low = 1 ; int high = n;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if( mid * mid == n){
                ans = mid ;
                return  mid ;
            }

            else if( mid *mid > n ){
                high = mid - 1;
            }else{
                ans = mid ;
                low = mid + 1;
            }
        }
return  ans ;
    }
}
