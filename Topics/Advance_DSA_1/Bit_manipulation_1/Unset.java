class Unset{
    public static void main (String [] args){
        unsetA_bit(6,2);
    }
    public static void unsetA_bit(int n , int i ){
        if( checkBit( n , i)){
            n = (n ^ (1 << i));
        }
        System.out.println(n);
    }
    public static  boolean checkBit( int n ,int i ){

            if( (n & (1 << i ))==0){
                return  false ;
            }else{
                return  true;
            }

    }


}