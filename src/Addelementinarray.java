import java.util.Scanner;

public class Addelementinarray
{
public static void main(String[] args) {
    int[] arr2 = new int[15];
    System.out.println("ENTER the the number of element : ");
    Scanner sc1 = new Scanner(System.in);
    int n = sc1.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println("Enter the data : ");
        arr2[i] = sc1.nextInt();
    }
    int k = n;
    for (int j = n - 1; j >= 0; j--) {
        arr2[k] = arr2[j];
        k--;
    }
    System.out.println(" ");
    System.out.println("Enter a new number to add in array : ");
    arr2[k] = sc1.nextInt();
    for (int i = 0; i < arr2.length; i++)
    {
        System.out.println(arr2[i]+" ");
    }
    }
}