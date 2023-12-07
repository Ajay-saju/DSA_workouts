import java.util.*;

public class Vowels_vs_Consonants {
    public static void main(String[] args) {
        findVovels();
    }

    public static void findVovels() {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        scn.nextLine();

        for (int j = 1; j <= n; j++) {
            String s = scn.nextLine();
            int countvowels = 0;
            int constraints = 0;

            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                    countvowels++;
                } else {
                    constraints++;
                }
            }
            System.out.println(countvowels + " " + constraints);

        }

    }
}
