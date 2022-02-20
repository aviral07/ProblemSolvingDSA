package com.avi.arrayprograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PairsWithGivenSum {
    public void findPairWithGivenSum(int[] arr,int sum){
        int low=0;
        int high=arr.length-1;
        Arrays.sort(arr);
        while(low<high)
        {
            if(arr[low] + arr[high] > sum){
                high --;
            } else
            if(arr[low] + arr[high] < sum){
                low ++;

            } else if(arr[low] + arr[high] == sum){
                System.out.println("pair" +"("+arr[low]+" "+arr[high]+")" );
                low++;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        PairsWithGivenSum ps=new PairsWithGivenSum();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr={1,4,5,3,2,6,7};
        int sum=8;
        ps.findPairWithGivenSum(arr,sum);
    }
}


