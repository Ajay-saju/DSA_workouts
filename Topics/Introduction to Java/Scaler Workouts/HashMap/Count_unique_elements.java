package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

import javax.print.DocFlavor.READER;

public class Count_unique_elements {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>();
    ArrayList<Integer> B = new ArrayList<>();
    A.add(6);
    A.add(3);
    A.add(3);
    A.add(6);
    A.add(7);
    A.add(8);
    A.add(7);
    A.add(3);
    A.add(7);

    B.add(10);
    B.add(9);
    B.add(8);

    System.out.print(solved(A, B));

  }

  public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

    ArrayList<Integer> myList = new ArrayList<>();
    HashMap<Integer, Integer> myMap = new HashMap<>();

    for (int i : B) {
      int count = 0;
      for (int j : A) {
        if (i == j) {
          count++;
          myMap.put(i, count);
        } else {
          myMap.put(i, count);
        }
      }

    }
    System.out.println(myMap);

    for (int val : B) {
      int count = myMap.get(val);
      System.out.println(count);
      myList.add(count);
    }

    return myList;
  }

  public int[] solve(int[] A, int[] B) {
    int[] ans = new int[B.length];
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < A.length; i++) {
      if (map.containsKey(A[i])) {
        int freq = map.get(A[i]);
        map.put(A[i], freq + 1);
      } else {
        map.put(A[i], 1);
      }
    }

    for (int j = 0; j < B.length; j++) {
      if (map.containsKey(B[j])) {
        ans[j] = map.get(B[j]);
      } else {
        ans[j] = 0;
      }
    }

    return ans;

  }

  public static ArrayList<Integer> solved(ArrayList<Integer> A, ArrayList<Integer> B) {

    ArrayList<Integer> myList = new ArrayList<>();
    HashMap<Integer, Integer> myMap = new HashMap<>();

    for (int i : A) {

      if (myMap.containsKey(i)) {
        int freq = myMap.get(i) + 1;
        myMap.put(i, freq);

      } else {
        myMap.put(i, 1);
      }
    }

    for (int p = 0; p < myMap.size(); p++) {
      System.out.println(myMap.containsKey(p));
    }

    for (int j : B) {
      if (myMap.containsKey(j)) {
        myList.add(myMap.get(j));
      } else {
        myList.add(0);
      }

    }
    System.out.println(myMap);
    return myList;
  }

  int population(HashMap<String, Integer> H, int K) {

    int count = 0;
    for (String i : H.keySet()) {
      // String key = H,getKey(i);
      int val = H.get(i);
      if (val < K) {
        count++;
      }

    }
    return count;

  }

}
