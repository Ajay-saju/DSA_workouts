import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(10);

        // here i mentioned the initial capacity is 10;
        // Array list input

        // myList.add(10);
        // myList.add(20);
        // myList.add(30);
        // myList.add(40);
        // myList.add(50);
        // myList.add(60);

        // user input
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int x = scn.nextInt();
            myList.add(x);
        }
        // System.out.print(myList);

        // for (int items : myList) {
        // System.out.print(items + " ");

        // }
        for (int i = 0; i < 5; i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}