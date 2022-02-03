import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Given is array and the target number
    //We need to find the index of two elements which sums up to the target number

    public int[] twoSumSol(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(target-nums[i]))
                mp.put(nums[i],i);
            else return new int[]{mp.get(target-nums[i]),i};
        }
        return new int[]{-1, 1};
    }

    public static void main(String[] args) {
        TwoSum ts= new TwoSum();
        int arr[] ={3,4,2,1,8};
        //int result[2] = new int[];
        ts.twoSumSol(arr,9);
    }


}
