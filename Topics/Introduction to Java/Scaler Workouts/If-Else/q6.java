import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (n % 2 != 0) {
            System.out.println("Weired");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weired");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weired");
            } else {
                System.out.println("Not Weired");
            }
        }
    }

}
