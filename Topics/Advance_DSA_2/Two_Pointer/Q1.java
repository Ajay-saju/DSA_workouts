public class Q1{
    public static void main(String[] args) {
        

        int []arr = {-5,-2,1,2,7,10,13,15};
        int k = 11;
        System.out.println(solve(arr,k));
    }
    public static boolean solve(int[] arr,int k){

        int i = 0;
        int j = arr.length-1;

        while (i<j){

            if( arr[i] + arr[j] == k){
                return true;
            }else if( arr[i] + arr[j] > k ){
                j--;
            }else{
                i ++;
            }
        }
        return false;
    }

}