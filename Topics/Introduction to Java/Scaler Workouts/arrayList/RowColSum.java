
import java.util.*;

public class RowColSum {
    public static void main(String[] args) {
        myList();
    }

    public static void myList() {
        Scanner scn = new Scanner(System.in);

        System.out.println(" Enter the row : ");
        int n = scn.nextInt();
        System.out.println(" Enter the col : ");
        int m = scn.nextInt();
        ArrayList<ArrayList<Integer>> mySampleList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("enter the " + i + " Element");
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                temp.add(scn.nextInt());
            }
            mySampleList.add(temp);
        }
        System.out.println(mySampleList);

        System.out.println("======= My array list index printing =======");

        // for (int i = 0; i < mySampleList.size(); i++) {
        //     for (int j = 0; j < mySampleList.get(i).size(); j++) {
        //         System.out.print("Row " + i + "col" + j + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mySampleList);
        System.out.println(findSum(mySampleList));
    }

    public static ArrayList<Integer> findSum(ArrayList<ArrayList<Integer>> arr) {

        ArrayList<Integer> sum = new ArrayList<Integer>();
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = arr.get(i);
            int ans = 0;
            for (int j = 0; j < temp.size(); j++) {
                ans += temp.get(j);
            }
            sum.add(ans);
        }
        // System.out.println(arr.size());
        // System.out.println(arr.get(0).size());

        for (int i = 0; i < arr.get(0).size(); i++) {
            int ans = 0;
            System.out.print(i + 1 + "IterationI ");
            for (int j = 0; j < arr.size(); j++) {
                ans += arr.get(j).get(i);

                System.out.print(j + 1 + "IterationJ ");
            }
            System.out.println();   
            sum.add(ans);
        }
        return sum;

    }

}
