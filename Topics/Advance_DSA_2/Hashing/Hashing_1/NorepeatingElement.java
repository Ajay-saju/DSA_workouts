import java.util.HashMap;
import java.util.Map;

public class NorepeatingElement {
    public static void main(String[] args){
        int[]a={1,2,3,1,2,5};
        solve(a);
    }
    public static void solve(int[]a){
     
        Map <Integer,Integer>myMap= new HashMap<>();
        for(int i=0;i< a.length;i++){
            if(myMap.containsKey(a[i])){
                  int cv= myMap.get(a[i]);
                  myMap.put(a[i], cv+1);
            }else{

                myMap.put(a[i],1);

            }
        }
        for( int i =0;i< a.length;i++){
          int x =myMap.get(a[i]);
          if(x==1){
            System.out.println(a[i]);
            break;
          }
        }
    }
}
