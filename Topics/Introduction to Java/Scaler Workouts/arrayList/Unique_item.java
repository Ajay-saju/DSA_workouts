

import java.util.ArrayList;

public class Unique_item {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(9);
        a.add(10);
        a.add(7);
        a.add(10);
        a.add(9);
        a.add(1);
        a.add(5);
        a.add(1);
        a.add(5);
        // a.add(4);
        System.out.println(solve(a));
    }

    public static int solve(ArrayList<Integer> A) {

        int n = A.size();
        for (int i = 0; i < n - 1; i++) {
            int x = A.get(i);
            int count = 0;

            for (int j = i + 1; j < n; j++) {

                int y = A.get(j);
                // System.out.print(y+" ");
                if (x == y) {
                    count++;
                }
            }
            // System.out.println();
            if (count == 0) {
                return x;
            }
        }
        return 0;
    }
}
