import java.util.HashSet;

class FindPair{
    // Given arr[n] and k. Check if there exisit a pair (i,j) such that a[i] + a[j] == k and (a[i] ! a[j])


    public static void main(String[] args) {
        int []a = {8,9,1,-2,4,5,11,-6,4};
        int k = 6;
        System.out.println(findPairs(a, k));
    }
    public static boolean findPairs(int[]arr,int k){

        HashSet<Integer>mySet= new HashSet<>();
        for(int i =0;i< arr.length;i++){
          
            int x = k-arr[i];
            
            if( mySet.contains(x)){
                return true;
            }
            mySet.add(arr[i]);
        }
        return false;
    }
}