public class Q4 {
    // given a sorted integer array A and an integet K find anu pair s,t A[j] - A[i] == k 
    //  i != j

    public static void main (String[]args){

        int []A = {-5, -2,1,3,5,8,10,12,15};
        int k = 11;
       System.out.println( solve(A,k));;
    }

    private static boolean solve(int[] a, int k) {
    int i = 0;int j = 1;

    int n = a.length;
    
    while( j < n ){
        
        int dif = a[j] - a[i];
        if( dif == k){
          return true;
          
        }else if (dif > k ){
            i++;
        }else{
            j++;
        }
    }
    return false;
    }
}
