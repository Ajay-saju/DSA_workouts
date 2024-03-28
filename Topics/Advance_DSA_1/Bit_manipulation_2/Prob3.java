public class Prob3 {

    // Given an integer array, all the elements will occur twice expect two. Find those distinct elements
    public static void main(String[] args) {
        int[] arr = {10,8,8,9,12,9,6,11,10,6,12,17};
        findTwoDistinctElements(arr);
    }

    public static boolean checkBit(int val, int i) {

        if ((val & 1 << i) != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void findTwoDistinctElements(int[] arr) {

        int n = arr.length;
        // step 1 - XOR all the elements

        int v = 0;
        for (int i = 0; i < n; i++) {
            v ^= arr[i];
        }


        // step 2 - find the set bit position
        int pos = 0;
        for (int i = 0; i < 31; i++) {
            if (checkBit(v, i)) {
                pos = i;
                break;
            }
        }
        System.out.println(pos);

        // step 3 - Split the arr based on the position index into set and unset
        int set = 0;
        int unset = 0;
        for (int i = 0; i < n; i++) {

            if (checkBit(arr[i], pos)) {
                set ^=arr[i];
            }else{
                unset ^= arr[i];
            }
        }
        System.out.println(set +"and"+ unset);

    }
}


