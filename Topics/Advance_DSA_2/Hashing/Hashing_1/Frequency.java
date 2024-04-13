

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    // Given N elements Q queries find the frequency of elements provided in the query
    public static void main (String[]args){
        int[]n = {2,6,3,8,2,8,2,8,10};
        int []q={2,8,3,5};
        solve(n,q);
    }
    public static void solve(int []arr, int []query){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i< arr.length;i++){
            if(map.containsKey(arr[i])){
                int currentVal = map.get(arr[i]);
                map.put(arr[i],currentVal+1); 
            }else{
                map.put(arr[i], 1);
            }
        }
        for(int j=0;j< query.length;j++){
            if( map.containsKey(query[j])){
                System.out.println(query[j]+  " :"+  map.get(query[j]));
            }else{
                System.out.println(query[j]+  " :"+  0);
            }
        }
    }
}
