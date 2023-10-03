import org.w3c.dom.css.Counter;

import java.util.ArrayList;
import java.util.Scanner;

public class Occ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int z;
        System.out.println("Enter the total number of elements ");
        z=sc.nextInt();

        int arr[]=new int[z];
        System.out.println("Enter the elements of the array ");
        for(int i=0; i<z ;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println(" element whose frequency you want to know");
        int a=sc.nextInt();
        int count=0;


        for(int i=0;i<z;i++)
        {
            if(a==arr[i])
            {
                count++;
            }
        }

        System.out.println(a+" occurred "+count+" times ");

    }

    }

