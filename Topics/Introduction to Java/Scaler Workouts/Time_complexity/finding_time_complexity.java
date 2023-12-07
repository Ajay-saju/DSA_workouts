package Time_complexity;

public class finding_time_complexity {
    public static void main(String[] args) {
        // int n = 20;
        // for (int i = 1; i <= n; i = i + 2) {
        // System.out.println("Value of ui =" + i);
        // }
        // int a = 0, i = 25;
        // while (i > 0) {
        // a += i;
        // i /= 2;
        // System.out.println("Value of ui =" + i);
        // }
        System.out.println(func(10));
    }

    public static int func(int n) {

        int s = 0;

        for (int i = 1; i <= 100; i++) {

            s = s + i;
            System.out.println("Value of ui =" + i);

        }

        return s;

    }

}
