public class SimpleBinarySearch {
    public static void main(String[]args){

        int[]arr= {3,6,9,12,14,19,20,23,25,27};
        int k = 25;
        System.out.println(searchIndexK(arr,arr.length,k));

    }
    public static int searchIndexK(int[]arr,int n , int k){

        int low = 0; int high = n-1;

        while(low <= high){
            int mid =  low + (high - low)/2;

            if(arr[mid] == k){
                return  mid;
            } else if (arr[mid] > k) {
                high = mid-1;
            }else {
                low = mid +1;
            }
        }
        return  -1;

    }
}
