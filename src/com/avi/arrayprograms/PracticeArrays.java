
import java.util.*;
public class PracticeArrays {


    public static void pairsWithGivenSum(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();
        //yet another leetcode gotcha testcase
        if (nums.length == 1){
            return;
        }
        //put the counts into a map. loop through input array nums[]
        for(int num:nums){

            map.put(num,map.getOrDefault(num,0)+1);
        }
        //glad thats over with
        int counter = 0;
        //we use a counter here to say, "ok this is what i should be after we
        //overwrites nums[] with 0s... then 1s.... then 2s....
        //then we use map.get() to find out how many of the next number
        //we need to add as well
        for (int i = 0; i < map.getOrDefault(0,0); i++){
            nums[i] = 0;
            ++counter;
        }
        for (int i = counter; i < map.getOrDefault(0,0) + map.getOrDefault(1,0); i++){
            nums[i] = 1;
            ++counter;
        }
        for (int i = counter; i < map.getOrDefault(0,0)+ map.getOrDefault(1,0) + map.getOrDefault(2,0); i++){
            nums[i] = 2;
        }
    }

    public static void main(String[] args) {


    int[] num ={0,2,0,1,2};

        pairsWithGivenSum(num);


    }
}
