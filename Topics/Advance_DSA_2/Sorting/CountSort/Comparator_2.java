package CountSort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_2 {
    // Problem Description
    // You are developing a feature for Zomato that helps users find the nearest
    // restaurants to their current location. It uses GPS to determine the user's
    // location and has access to a database of restaurants, each with its own set
    // of coordinates in a two-dimensional space representing their geographical
    // location on a map. The goal is to identify the "B" closest restaurants to the
    // user, providing a quick and convenient way to choose where to eat.

    // Given a list of restaurant locations, denoted by A (each represented by its x
    // and y coordinates on a map), and an integer B representing the number of
    // closest restaurants to the user. The user's current location is assumed to be
    // at the origin (0, 0).

    // Here, the distance between two points on a plane is the Euclidean distance.

    // You may return the answer in any order. The answer is guaranteed to be unique
    // (except for the order that it is in.)

    // NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is
    // sqrt( (x1-x2)2 + (y1-y2)2).

    // Problem Constraints
    // 1 <= B <= length of the list A <= 105
    // -105 <= A[i][0] <= 105
    // -105 <= A[i][1] <= 105

    // Input Format
    // The argument given is list A and an integer B.

    // Output Format
    // Return the B closest points to the origin (0, 0) in any order.

    // Example Input
    // Input 1:

    // A = [
    // [1, 3],
    // [-2, 2]
    // ]
    // B = 1
    // Input 2:

    // A = [
    // [1, -1],
    // [2, -1]
    // ]
    // B = 1

    // Example Output
    // Output 1:

    // [ [-2, 2] ]
    // Output 2:

    // [ [1, -1] ]

    public static void main(String[] args) {

        int[][] arr = { { -4, 2 }, { 0, 1 }, { 1, 1 }, { -2, 1 }, { 3, 0 }, { -2, -2 } };
        int b = 4;
        findResturants(arr, b);
        for(int [] n : arr){
           System.out.println(Arrays.toString(n));
        }

    }

    private static void findResturants(int[][] arr, int b) {

        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] v1, int[] v2) {

                double d1 = findDis(v1);
                double d2 = findDis(v2);

                if( d1 < d2){
                    return -1;
                }
                // else if ( d1>d2){
                //     return 1;
                // }
                else{
                    return 0 ;
                }

            }

            private double findDis(int[] v1) {

                double x = v1[0];
                double y = v1[1];

                return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            }

        });
    }

}
