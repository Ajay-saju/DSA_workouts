public class SearchK {
    // Search in an elememnt in a sorted array but its roteted .
    public static  void main (String []args){

        int []arr= {10,20,30,1,2,3,4,5,6,7,8,9};
        int k = 4;
        System.out.println(findIndexofK(arr,k));

    }

    private static int findIndexofK(int[] arr,int k) {
        int n = arr.length;

        int low = 0 ; int high = n-1;
        while(low <= high){

            int mid = low + (high - low)/2;
            if( arr[mid]== k ){
                return  mid;
            }
            if(arr[0] > k){

                // k is in part 2 so find the mid-position

                if( arr[mid] > arr[0] ){
                    // mid is in part 1 so go to right

                    low = mid +1;

                }else {
                    // do binary search
                    if( arr[mid ]> k){
                        // go to left
                        high = mid-1;
                    }else {
                        low = mid + 1;
                    }
                }
            }else{
                // k is in part 1 so find the mid-position
                if( arr[mid] < arr[0]){
                    // mid is in the part 2 so go to left
                    high = mid-1;
                }else{
                    // do binary search
                    if( arr[mid] > k){
                        // go to left
                        high = mid -1;

                    }else{
                        low = mid +1;
                    }
                }

            }
        }
        return  -1;
    }
}
