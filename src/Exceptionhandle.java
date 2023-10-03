import java.sql.SQLOutput;
import java.util.Scanner;

public class Exceptionhandle{
    void divide(int a,int b)
    {
        int result;
        try {
            result = a / b;
        }
            catch(ArithmeticException ex)
            {
                System.out.println("denominator is invalid ");
            }
        }
        public static void main(String[] args)
        {
            Exceptionhandle e = new Exceptionhandle();
            e.divide(10,0);
        }
    }