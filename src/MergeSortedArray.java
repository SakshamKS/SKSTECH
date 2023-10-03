import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {11, 34, 5, 17};
        int n1 = arr1.length;

        int [] arr2 = {26, 42, 65, 18};
        int n2 = arr2.length;

        int [] arr3 = new int[n1 + n2];
        mergeArrays(arr1, arr2, n1, n2, arr3);

        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");

    }

    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
        int i = 0;
        int j = 0;
        int k = 0;


        while(i < n1){
            arr3[k++] = arr1[i++];
        }


        while(j < n2){
            arr3[k++] = arr2[j++];
        }


        Arrays.sort(arr3);
    }
}
