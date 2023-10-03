public class pattern
{
    public static void main(String[] args)
    {
        int rows = 5;
        System.out.println(" Pattern ");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            for (int l = i - 1; l >= 1; l--)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}