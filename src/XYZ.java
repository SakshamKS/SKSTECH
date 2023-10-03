class Sum{
        public  int sum (int[] arr){
                int sum = 0;
                int sum1 =0;

                int [] arr1  = arr;
                for (int i = 0;i< arr1.length;i++)
                {
                        if (arr[i]%2==0)
                        {
                                sum = sum +arr[i];
                        }else {
                                sum1 =sum1 + arr[i];
                        }
                }
                        if (sum>sum1){
                                return sum;
                        }else {
                                return sum1;
                        }
                }
        }
        public class XYZ {
        public static void main(String[] args) {
                Sum s= new Sum();
                int [] a = {1 ,2 ,8,9,10,12 };
                int r = s.sum(a);
                System.out.println(r);
        }
}
