class CheckBit {
    public static void main ( String[] ars){

        System.out.println(checkTheBit_isSet(10,3));

    }
  public static   boolean checkTheBit_isSet(int n ,int  i ){
        if( (n & (1 << i))==0){
            return  false;
        }else {
            return  true;
        }
    }
}