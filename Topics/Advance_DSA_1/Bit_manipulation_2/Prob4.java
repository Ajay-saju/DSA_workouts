public class Prob4 {
    // given N array elements, choose two indices (i,j) such that i != j , arr(i) & arr(j) is maximum

    public static void main(String[]args){
        int [] arr = {26,13,23,28,27,7,25};
        System.out.println(findMaxAndValue(arr));
    }

    public static boolean checkBit(int n , int i ){
        if( (n & 1<<i)!=0){
            return  true;
        }else {
            return false;
        }
    }
    public static int findMaxAndValue(int []arr){

        int n = arr.length;
        int ans = 0;
        for (int i = 30; i >=0 ; i--) {

            int count = 0 ;
            // find the count of set-bits
            for( int j = 0;j< n ;j++){
                if( checkBit( arr[j], i)){
                  count++;
                }
            }

            // set 1 for the result or adding value
            // we can form a pair whose have 1 at this i^th place

            if( count >= 2){
                ans = ans + (1<<i);

                for(int j =0;j< n ;j++){
                    if( checkBit(arr[j], i ) == false){
                        arr[j]= 0 ;
                    }
                }
            }
            // make unset bits in the i^th bit to zero



        }
        return ans;
    }
}
