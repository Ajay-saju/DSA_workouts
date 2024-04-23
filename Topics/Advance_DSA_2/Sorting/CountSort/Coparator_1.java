package CountSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Coparator_1 {

    // sort based on factors
    // int []arr= {9,3,10,6,4};
    // ans = {3,4,9,6,10}

    public static void main(String[] args) {
        Integer[] arr = { 9, 3, 10, 6, 4 };
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(9);
        myList.add(3);
        myList.add(10);
        myList.add(6);
        myList.add(4);
        Collections.sort(myList, new Comparator<Integer>() {

            @Override
            public int compare(Integer v1, Integer v2) {
                

                if (factors(v1) == factors(v2)) {

                    if (v1 < v2) {
                        return -1;
                    } else if (v1 > v2) {
                        return +1;
                    } else {
                        return 0;
                    }
                } else if (factors(v1) < factors(v1)) {
                    return -1;
                } else {
                    return 1;
                }

            }

            private int factors(Integer v1) {
                int count = 0;
                for (int i = 1; i <= v1; i++) {

                    if (v1 % i == 0) {
                        count++;
                    }
                }

                return count;
            }
        });

        for (Integer n : myList) {
            System.out.println(n);
        }
    }
}
