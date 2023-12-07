package Prifix_Array;

import java.util.Arrays;

public class findMaxValue {
    public static void main(String[] args) {
        // int[] arr = { -3, 2, -3, 4, 2 };
        // int[] arrr = { 1, 2 };
        // System.out.println(minStartValue(arr));
        System.out.println(5 & 6);
    }

    public static int minStartValue(int[] nums) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            System.out.println("sum =   " + sum);
            ans = Math.min(sum, ans);
            System.out.println("ANS =" + ans);
        }
        // System.out.println(ans);
        return -ans + 1;
    }
}
