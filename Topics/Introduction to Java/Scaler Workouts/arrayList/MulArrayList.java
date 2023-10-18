// package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MulArrayList {
    public static void main(String[] args) {
        // System.out.println(numericStaircase(3));
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static ArrayList<Integer> multiples(ArrayList<Integer> A) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            int x = A.get(i);
            if (x % 5 == 0 && x % 7 == 0) {
                myList.add(x);
            }
        }
        return myList;
    }

    public static ArrayList<Integer> problem2(int a, int b) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            myList.add(i * a);
        }
        return myList;

    }

    public static void print2DList(ArrayList<ArrayList<Integer>> list2D) {
        for (int i = 0; i < list2D.size(); i++) {
            for (int j = 0; j < list2D.get(i).size(); j++) {
                System.out.print(list2D.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> numericStaircase(int n) {
        ArrayList<ArrayList<Integer>> myList = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println(temp);
            for (int j = 1; j <= i + 1; j++) {
                temp.add(j);
            }
            myList.add(temp);
        }
        return myList;
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

}
