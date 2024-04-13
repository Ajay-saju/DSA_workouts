import java.util.HashSet;

public class ZeroSum {
    // given array n elements check if exist a subarray with zero sum 

    public static void main(String[]args){
        int []a={2,5,-4,-3,8,9,10};
        System.out.println(solve(a));
    }
    public static boolean solve(int []arr){
        // create a prifix arr 

        int []pf= new int[arr.length];
        pf[0]= arr[0];
            for(int i= 1; i< arr.length-1;i++ ){

                pf[i] = pf[i+1] + pf[i];

            }

            HashSet<Integer>mySet = new HashSet<>();

            for(int i =0;i< pf.length;i++){
                if(pf[i]==0){
                    return true;
                }
                mySet.add(pf[i]);
            }
            if(mySet.size()==arr.length){
                return false;
            }
            return true;
    }
}
