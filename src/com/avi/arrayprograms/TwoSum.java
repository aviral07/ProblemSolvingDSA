import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //Given is array and the target number
    //We need to find the index of two elements which sums up to the target number

    public int[] twoSumSol(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
               // return new int[] { numMap.get(complement), i };
                return new int[]{complement,nums[i]};
            } /*else {
                numMap.put(nums[i], i);
            }*/
            numMap.put(nums[i], numMap.getOrDefault(nums[i],0) + 1);
        }
        return new int[]{};
    }
    public int[] twoSumIndexes(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                 return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }

        }
        return new int[]{};
    }



    public static void main(String[] args) {
        TwoSum ts= new TwoSum();
        int arr[] ={3,4,2,1,6};
        //int result[2] = new int[];
        int[] result=ts.twoSumSol(arr,7);
        int[] resultindex=ts.twoSumIndexes(arr,7);
       for(int i:resultindex){
            System.out.println(i);
        }

    }


}
