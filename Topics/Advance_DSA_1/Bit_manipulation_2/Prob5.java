public class Prob5 {

    public static void main (String []args){
        int[]arr = {5,1,3,6};
        findTheMissingNumbers(arr);
    }
    public  static void findTheMissingNumbers(int []a){
        int n = a.length;
        int x =0 ;

        // XOR all elements in the array
        for (int i = 0; i < n; i++) {
            x =x ^ a[i];

        }

        // second XOR 1 to N+2
        for(int i = 1;i <= n+2; i++){
           x =x ^ i;
        }

        int pos = 0;

        for(int i = 0;i < 31;i++){
            if( checkBit(x,i)){
                pos = i;
                break;
            }

        }
        int y = 0;
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            if(checkBit(a[i],pos)){
                y= y^a[i];
            }else{
                z = z^a[i];
            }

        }

        for( int i = 1;i< n+2; i++){
            if(checkBit(i,pos)){
                y= y^i;
            }else {
                z= z^i;
            }
        }
        System.out.println(y +"  "+z);

    }
    public static boolean checkBit(int n, int  i ){
        if( (n & 1<<i)!= 0){
            return  true;
        }else {
            return  false;
        }
    }
}
