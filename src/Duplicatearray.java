public class Duplicatearray
{
    public static void print(int[] arr)
    {
        System.out.println(" %d");
        for ( int i=0;i<arr.length;i++)
            System.out.println(" %d");
        System.out.println("");
    }
    public static void print(Object[] arr)
    {
     System.out.println("In Object Array");
     System.out.println("%s" );
     System.out.println();
     for ( int i=1;i<arr.length;i++)
     {
         System.out.println(arr[i]+" ");
     }
    }
    public static void main(String[] args)
    {
        int[] a1 = {22,11,33};
        print(a1);
        int[]b1 = (int[])a1.clone();
        print(b1);
        String[] str = {"kk","hh","ll"};
        print(str);
    }

}
