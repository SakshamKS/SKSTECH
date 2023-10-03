import java.util.Scanner;

public class ReverseInteger {
    public static int Reverse(int n) {

        long reverse = 0;
        int remainder = 0;


        while (n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;

        }
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reverse;
        }
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int i = in.nextInt();
        System.out.println("Reverse of integer is " + Reverse(i)  );
    }
}
