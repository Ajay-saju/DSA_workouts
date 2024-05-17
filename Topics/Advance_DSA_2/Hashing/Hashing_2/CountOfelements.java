import java.util.HashMap;
import java.util.Map;

public class CountOfelements {
    // Given an array count number of distingt elements in every window size k 

    public static void main(String []args){
        int[]a= { 1,2,1,3,4,2,3};
        int k =4;
        solve(a,k);
    }
    public static void solve(int []arr,int k){

        Map <Integer,Integer>myMap= new HashMap<>();

        for(int i =0;i< k;i++){
            if(myMap.containsKey(arr[i])){
                int freq = myMap.get(arr[i]);
                myMap.put(arr[i], freq +1);
            }else{
                myMap.put(arr[i], 1);
            }
        }
        System.out.println(myMap.size());

        int i = 1;int j=k;
        while (j< arr.length) {
            
            // remove the first element
            int freq = myMap.get(arr[i]);

            if(myMap.get(arr[i-1]) == 0){
                // remove the elements or remove the key
                myMap.remove(arr[i-1]);
            }else{
                myMap.put(arr[i-1], freq -1);
            }

            if(myMap.containsKey(arr[j])){
                freq = myMap.get(arr[j]);
                myMap.put(arr[j],freq+1);
            }else{
                myMap.put(arr[j],1);
            }
            System.out.println(myMap.size());
            i++;j++;
        }
        
    }
}
