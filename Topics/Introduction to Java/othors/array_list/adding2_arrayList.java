import java.util.ArrayList;
import java.util.Scanner;

public class adding2_arrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter A elements");
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(scn.nextInt());
            }
            A.add(temp);
        }
        System.out.println("Enter B elements");
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(scn.nextInt());
            }
            B.add(temp);
        }

        System.out.println(A);
        System.out.println(B);
        System.out.println(solve(A, B));

    }

    public static ArrayList<ArrayList<Integer>> add2ArryList(ArrayList<ArrayList<Integer>> A,
            ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> sumList = new ArrayList<>();

        int n1 = A.size();

        // for (ArrayList<Integer> items : A) {
        // for (int item : items) {
        // x = item;
        // }
        // }
        for (int i = 0; i < n1; i++) {
            ArrayList<Integer> temp1 = new ArrayList<>();
            ArrayList<Integer> temp2 = new ArrayList<>();
            ArrayList<Integer> temp3 = new ArrayList<>();
            temp1 = A.get(i);
            temp2 = B.get(i);
            for (int j = 0; j < n1; j++) {
                int x = 0;
                int y = 0;
                int sum = 0;
                x = temp1.get(j);
                y = temp2.get(j);
                sum = x + y;
                temp3.add(sum);
            }
            sumList.add(temp3);
        }

        return sumList;
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A,
            ArrayList<ArrayList<Integer>> B) {

        ArrayList<ArrayList<Integer>> newArrayList = new ArrayList<>();
        int n = A.size();

        // for ( int i =0;i<n;i++){
        // newArrayList.add(new ArrayList<>());
        // }
        for (int i = 0; i < n; i++) {
            // ArrayList<Integer> temp1= A.get(i);
            // ArrayList<Integer> temp2= B.get(i);
            // ArrayList<Integer> temp3= B.get(i);
            ArrayList<Integer> temp1 = new ArrayList<>();
            ArrayList<Integer> temp2 = new ArrayList<>();
            ArrayList<Integer> temp3 = new ArrayList<>();
            temp1 = A.get(i);
            temp2 = B.get(i);

            for (int j = 0; j < n; j++) {
                int x = 0;
                int y = 0;
                int z = 0;
                y = temp2.get(j);
                x = temp1.get(j);

                z = x + y;
                // newArrayList.get(i).add(z);
                temp3.add(z);
            }
            newArrayList.add(temp3);
        }
        return newArrayList;
    }
}
