package QuerySum;

public class FindQuerySum {

    public static void main(String[] args) {
        int[][] querys = { { 4, 8 }, { 3, 7 }, { 1, 3 }, { 0, 4 }, { 7, 7 } };
        int[] arr = { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
        findQuarySum(querys, arr);

    }

    public static void findQuarySum(int[][] querys, int arr[]) {
        // Step 1: create the prifix array
        int[] PF = createPrifixArray(arr);
        for (int i = 0; i < querys.length; i++) {
            int L = querys[i][0];
            int R = querys[i][1];
            int sum = 0;
            if (L == 0) {
                sum = PF[R];
            } else {
                sum = PF[R] - PF[L - 1];
            }
            System.out.println(sum);
        }
    }

    public static int[] createPrifixArray(int[] arr) {
        int[] pfArr = new int[arr.length];
        pfArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pfArr[i] = pfArr[i - 1] + arr[i];
        }
        return pfArr;
    }

}
