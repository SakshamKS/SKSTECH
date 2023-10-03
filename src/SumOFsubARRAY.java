
public class SumOFsubARRAY {
    public static int  SubArraySum(int arr[], int n)
    {
        int addition = 0,
                temp = 0;


        for (int i = 0; i < n; i++) {

            temp = 0;
            for (int j = i; j < n; j++) {

                temp += arr[j];
                addition += temp;
            }
        }
        return addition;
    }


    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 7 };
        int n = arr.length;
        System.out.println("Sum of SubArray : "
                + SubArraySum(arr, n));
    }
}
