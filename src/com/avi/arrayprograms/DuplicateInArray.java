package com.avi.arrayprograms;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateInArray {

    public void findDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                //   return nums[i];
                System.out.println(nums[i]);
            }
        }
        //return -1;
    }
//nlogn(n)
    //basic solution to compare 1st value with all values with two inner loops .it will be o(n2)

    //approach2 hashset
    public void findDuplicateHash(int[] nums){
        HashSet<Integer> langs=new HashSet();

        for(int l:nums){
            if(langs.add(l)==false){
                System.out.println(l);
            }
        }
    }

    public static void main(String[] args) {
        DuplicateInArray dp = new DuplicateInArray();
        int arr[] = { 1, 2, 2, 1, 3, 6};
        int arr_size = arr.length;

        //dp.findDuplicate(arr);
        dp.findDuplicateHash(arr);
    }
}
