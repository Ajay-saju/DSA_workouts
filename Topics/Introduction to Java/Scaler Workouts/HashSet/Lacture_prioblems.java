package HashSet;

import java.util.HashSet;

public class Lacture_prioblems {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 1, 2, 3, 5, 6, 7, 8, 9, 5, 5, };
        // System.out.println(convertToHashSet(arr));
        int[] a1 = { 1, -2, 3, 4, 5 };
        int[] a2 = { 0, -2, 3, 10, };
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();
        for (int val : a1) {
            hs1.add(val);
        }
        for (int val : a2) {
            hs2.add(val);
        }

        // intersect(hs1, hs2);
        printCommon(hs1, hs2);
    }

    public static void printCommon(HashSet<Integer> hs1, HashSet<Integer> hs2) {
        for (int val : hs1) {
            if (hs2.contains(val) == true) {
                System.out.println(val);
            }
        }
    }

    public static void sampleHashSet() {
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        System.out.print(myHashSet);
    }

    public static HashSet<Integer> convertToHashSet(int[] arr) {
        HashSet<Integer> myhs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            myhs.add(arr[i]);
        }
        return myhs;
    }

    public static void intersect(HashSet<Integer> hs1, HashSet<Integer> hs2) {
        for (int val : hs1) {
            // for (int j = 0; j < hs2.size(); j++) {
            // if (val == j) {
            // System.out.println(val);
            // }
            // }

            if (hs2.contains(val))
                System.out.println(val);
        }
    }
}
