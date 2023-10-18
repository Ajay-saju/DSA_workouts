package HashMap;

import java.util.HashMap;

public class Lecture_problms {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // add
        hm.put("Delhi", 15);
        hm.put("Haryana", 20);
        hm.put("Punjab", 18);
        hm.put("goa", 7);

        System.out.println(hm);
        int[] arr = { 1, 2, 3, 1, 2, 5, 4, 6, 3, 2 };
        System.out.println(freqMap(arr));
    }

    public static HashMap<Integer, Integer> freqMap(int[] arr) {
        HashMap<Integer, Integer> myhasMap = new HashMap<>();
        for (int i = -0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                myhasMap.put(arr[i], count);
            }
        }
        return myhasMap;
    }
}
