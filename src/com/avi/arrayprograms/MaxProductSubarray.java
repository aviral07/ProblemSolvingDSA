import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxProductSubarray {
    static int  maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = max_so_far;

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int temp_max = max(curr, max(max_so_far * curr, min_so_far * curr));
            min_so_far = min(curr, min(max_so_far * curr, min_so_far * curr));

            max_so_far = temp_max;

            result = max(max_so_far, result);
        }

        return result;
    }


  /*  public int maxProduct(int[] nums) {

        int currProduct=1;
        int maxProduct=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){

            currProduct=currProduct*nums[i];
            if(currProduct>maxProduct){
                maxProduct=currProduct;
            }
            if(currProduct == 0){
                currProduct=1;
            }
        }
        return maxProduct;
    }*/

    public static void main(String[] args) {
        int [] nums={3,-1,4};
        int ans=MaxProductSubarray.maxProduct(nums);
        System.out.println(ans);
    }
}
