import java.util.ArrayList;
import java.util.Scanner;

public class two_d_array_list {
    public static void main(String[] args) {
        userInput2();
    }

    public static void userInput2() {
        Scanner scn = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> userList = new ArrayList<>();
        int n = 3;
        int m = 3;
        for (int i = 0; i < n; i++) {
            userList.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                userList.get(i).add(scn.nextInt());
            }
        }
        System.out.print(userList);
    }

    public static void userInput() {
        ArrayList<ArrayList<Integer>> userList = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int n = 5;
        int m = 5;
        for (int row = 0; row < n; row++) {
            ArrayList<Integer> rows = new ArrayList<>();
            for (int col = 0; col < m; col++) {
                int x = scn.nextInt();
                rows.add(x);
            }
            userList.add(rows);
        }
        System.out.print(userList);
    }

    public static void normalArrayList() {
        ArrayList<ArrayList<Integer>> myList = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        myList.add(row1);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        myList.add(row2);
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        myList.add(row3);
        System.out.println(myList);

        // accessing each item

        for (ArrayList<Integer> row : myList) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
