package functions;

public class is_perfect_squre {
    public static void main(String[] args) {
        System.out.print(solve(8430800));
    }

    public static int solve(int A) {
        
        for (int i = 1 ;i <=A; i++){
            if(i*i == A){
               return 1;
            }
        }
        return 0;
        
    }
}
