public class DecimelToBinery {

    public static  void main(String[]args){
        convertDecimelToBinery(23);
    }

    private static void convertDecimelToBinery(int i) {

        if (i ==0){
            System.out.println(0);
        }
        StringBuilder binary = new StringBuilder();
        while (i >0 ){
            int rem = i % 2 ;
            binary.insert(0,rem);
            i = i/2;
        }
        System.out.println(binary.toString());
    }
}
