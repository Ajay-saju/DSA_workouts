import java.util.HashMap;
import java.util.Map;

public class ContOfPairs {

    // Given arr[n] and k. Count pairs , there exisit a pair (i,j) such that a[i] + a[j] == k and (a[i] ! a[j])
    public static void main(String []args){
        int []arr= {2,5,2,5,8,5,2,8};
        int k =10;
        System.out.println(solve(arr,k));
    }

    private static int solve(int[] arr, int k) {
       int ans =0;
       Map<Integer,Integer>myMap= new HashMap<>();

       for(int i =0;i<arr.length;i++){
        int x = k-arr[i];
        if(myMap.containsKey(x)){
            ans += myMap.get(x); 
        }
        if( myMap.containsKey(arr[i])){
            int count = myMap.get(arr[i]);
            myMap.put(arr[i], count+1);
        }else{
            myMap.put(arr[i],1);
        }
       }
       for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
       return ans;
    }
}
