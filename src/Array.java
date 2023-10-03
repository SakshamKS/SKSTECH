import java.util.Scanner;

// three types of array
public class Array {
    public static void main(String[]args) {
        int arr[]= new int[6];
        int arr2[]= {4,5,3,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr  :  ");
        int size = sc.nextInt();
        int arr3[]  = new int[size];
        arr[0] = 54;
        arr[1] = 74;
        arr[2] = 48;
        arr[3] = 12;
        arr[4] = 98;
        for(int i=0;i<arr3.length;i++)
        {
            System.out.println("Enter data : ");
            arr3[i] = sc.nextInt();
        }
            System.out.println(arr.length);
            System.out.println(arr2.length);
            System.out.println(arr3.length);
            for(int i=0;i<arr3.length;i++)
            {
                System.out.print(arr3[i]+" ");
            }
        }
    }
