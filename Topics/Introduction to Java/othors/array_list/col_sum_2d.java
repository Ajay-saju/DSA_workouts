import java.util.*;

public class col_sum_2d {
    public static void main(String[] args) {
        int A = 3;
        int B = 2;
        // System.out.print(sampleArrayList());
        // ArrayList<ArrayList<Integer>> C = sampleArrayList();
        // System.out.println(sampleArrayList());
        sampleArrayList();

    }

    public static ArrayList<Integer> solve(int A, int B, ArrayList<ArrayList<Integer>> C) {
        ArrayList<Integer> newList = new ArrayList<>();

        int rowSum = 0;
        int colSum = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            temp = C.get(i);
            for (int j = 0; j < B; j++) {

                rowSum += temp.get(i);
                colSum += temp.get(j);
            }
        }
        return newList;
    }

    public static ArrayList<ArrayList<Integer>> sampleArrayList() {
        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> myArrayList = new ArrayList<>();

        // ArrayList<Integer> row1 = new ArrayList<>();
        // row1.add(1);
        // row1.add(2);
        // row1.add(3);
        // myArrayList.add(row1);

        // ArrayList<Integer> row2 = new ArrayList<>();
        // row2.add(4);
        // row2.add(5);
        // row2.add(6);
        // myArrayList.add(row2);

        // ArrayList<Integer> row3 = new ArrayList<>();
        // row3.add(7);
        // row3.add(8);
        // row3.add(9);
        // myArrayList.add(row3);
        // return myArrayList;

        System.out.println("Enter array list row");
        int n = scn.nextInt();
        System.out.println("Enter array list col");
        int m = scn.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter values for row " + (i + 1) + ":");
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                temp.add(scn.nextInt());
            }
            myArrayList.add(temp);
        }
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        return myArrayList;
    }
}
