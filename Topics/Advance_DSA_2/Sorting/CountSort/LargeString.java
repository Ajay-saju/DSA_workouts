
package CountSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class LargeString {

    // Given an array A of non-negative integers, arrange them such that they form
    // the largest number.

    // Note: The result may be very large, so you need to return a string instead of
    // an integer.

    // eg: A = [3, 30, 34, 5, 9]
    // ans = "9534330"

    // sort the array like this using comparator

    public static void main(String[] args) {

        
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(8);
        myList.add(89);
        // myList.add(34);
        // myList.add(5);
        // myList.add(9);

        Collections.sort(myList, new Comparator<Integer>() {

            @Override
            public int compare(Integer v1, Integer v2) {

                System.out.println("Befor convert" + v1 + "   " + v2);

              int   cv1 = convert(v2, v1);
               int cv2 = convert(v1, v2);
                System.out.println(" Aftet convert" + cv1 + "   " + cv2);

                if (cv1 < cv2) {
                    return Integer.compare(cv1, cv2);
                } else {
                    // return Integer.compare(cv2, cv1);
                    return 0 ;
                }
            }

            private Integer convert(Integer a, Integer b) {

                String sA = Integer.toString(a);
                String sB = Integer.toString(b);
                String ans = sA + sB;
                return Integer.parseInt(ans);

            }

        });
        for (Integer n : myList) {
            System.out.print(n);
        }

    }

}