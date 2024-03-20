

// count no of set bits in N
class CountBit{

    public static void main (String []args){
        countSetBit(12);
    }
    // Another approch
    public static void  countSetBit(int n ){
        int ans=0;
        while(n>0){
            if((n & 1)==1){
                ans++;
            }
            n = n>>1;
        }
        System.out.println(ans);
    }

    public static void countSetBits(int n ){
        int ans=0;
        for (int i = 0; i < 32; i++) {
            if(checkTheBit_isSet(n,i)==true){
                ans =ans+1;
            }
        }
        System.out.println(ans);

    }
    public static   boolean checkTheBit_isSet(int n ,int  i ){
        if( (n & (1 << i))==0){
            return  false;
        }else {
            return  true;
        }
    }
}