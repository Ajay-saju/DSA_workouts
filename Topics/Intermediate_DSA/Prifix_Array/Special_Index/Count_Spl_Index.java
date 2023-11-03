package Prifix_Array.Special_Index;

public class Count_Spl_Index {
    public static void main(String[] args) {
        // Given an array of size N count the number of special index in the array.
        // Special index are those after removing which , sum of all Even indexed
        // elements is equal to sum of
        // all ODD indexed elements.
        // int[] arr = { 4, 3, 2, 7, 6, -2 };
        int[] arr = { 1, 2, 3, 7, 1, 2, 3 };

        findSplIndexCount(arr, arr.length);
    }

    public static void findSplIndexCount(int[] arr, int n) {
        // step 1 - fuind the Prifix Even array and Prifix Odd array

        int[] PFeven = createPrifixEvenArray(arr);
        int[] PFodd = createPrifixOddArray(arr);

        // step 2 - travel through all the index.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            // step 3 - declaring the sum of odd and even arrays.
            int sumOdd = 0;
            int sumEven = 0;
            if (i == 0) {
                // System.out.println(PFodd[n - 1]);
                // System.out.println(PFodd[i + 1]);
                sumOdd = PFodd[n - 1] - PFodd[i];
                sumEven = PFeven[n - 1] - PFeven[i];
            } else {
                sumOdd = PFodd[i - 1] + PFeven[n - 1] - PFeven[i];
                sumEven = PFeven[i - 1] + PFodd[n - 1] - PFodd[i];
            }
            if (sumOdd == sumEven) {
                count++;
            }

            System.out.println(sumOdd + " " + sumEven);

        }
        System.out.println(count);

    }

    public static int[] createPrifixEvenArray(int[] arr) {
        int[] PFEven = new int[arr.length];
        PFEven[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                PFEven[i] = PFEven[i - 1] + arr[i];
            } else {
                PFEven[i] = PFEven[i - 1];
            }
        }
        return PFEven;
    }

    public static int[] createPrifixOddArray(int[] arr) {
        int[] PFODD = new int[arr.length];
        PFODD[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                PFODD[i] = PFODD[i - 1] + arr[i];
            } else {
                PFODD[i] = PFODD[i - 1];
            }
        }

        return PFODD;
    }

}
