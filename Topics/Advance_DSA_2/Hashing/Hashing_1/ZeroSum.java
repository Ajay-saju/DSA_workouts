import java.util.HashSet;

public class ZeroSum {
    // given array n elements check if exist a subarray with zero sum

    public static void main(String[] args) {
        int[] a = { 2, 5, -4, -3, 8, 9, 10 };
        System.out.println(solve(a));
    }

    public static boolean solve(int[] arr) {
        // create a prifix arr

        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {

            pf[i] = pf[i + 1] + pf[i];

        }
        // create a hahmap for storing uniq elements
        // why storing uniq elements? becouse same pf.array elements give sub array sum
        // zero
        // pf[]=[2,7,5,2,3,8,4] here we have element 2 in two times so the sub array sum
        // b/w them is zero thats y we are checking the length of the hashset.
        HashSet<Integer> mySet = new HashSet<>();

        for (int i = 0; i < pf.length; i++) {
            if (pf[i] == 0) {
                return true;
            }
            mySet.add(pf[i]);
        }
        if (mySet.size() == arr.length) {
            return false;
        }
        return true;
    }
}
