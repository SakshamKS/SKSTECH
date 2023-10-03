import java.util.Arrays;

class Solution {
    public int [] plusone(int[] digits){
        int []arr = digits;
        int start = 0;
        int last = arr.length - 1;

        if (arr.length == 1) {
           int[] ans = new int [arr.length + 1];
           Arrays.fill(ans , 0 );
           ans[0] = arr[0]/10 + 1 ;
           return ans;
        }
        if (arr[last]< 9){
            arr[last] = arr[last] +1 ;

        }
        while (arr[last]>=9){
            int r =arr[last]%10;
            arr[last] = r + 1 ;
            arr[last - 1] = arr[last]/10;

        }
            return  arr;
        }
        }
        public  class PlusOne {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] ans = sol.plusone(new int[]{29});
        System.out.println(Arrays.toString(ans));
    }
}
