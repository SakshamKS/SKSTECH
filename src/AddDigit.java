import java.util.Scanner;

public class AddDigit {
    public  static int Digit(int No)
    {
        int h = 0;

        while (No > 9)
        {
            h = No;
            No = 0;
            while ( h > 0)
            {
                No += (h% 10);
                h = h/10;

            }
        }
     return No;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("The sum of the digit is :"+ Digit(k) );
    }
}
