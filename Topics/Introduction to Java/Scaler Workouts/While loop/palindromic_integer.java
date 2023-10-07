import java.util.Scanner;

public class palindromic_integer {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);

        int a = scn . nextInt();
        int rev = 0 ;
        int temp = a; 
        while ( temp > 0){
            rev = rev * 10 + (temp%10);
            temp= temp/10;
        }
        if( a == rev ){
             System.out.print("Yes");
        }else{ 
             System.out.print("No");
        }

    }
}
