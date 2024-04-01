class Setbit{
    // set bits in a range.
    public static void main (String []args){
        setBitInaRange(4,3,2);
    }
    public static void  setBitInaRange(int a,int b,int c){
        int ans=0;
        for(int i = 0;i< b;i++){
            ans =  setBit(ans,c+i);

        }
        System.out.println(ans);
    }
    public static int setBit(int n , int i ){
        n = (n | (1<<i));
        return  n;

    }
}