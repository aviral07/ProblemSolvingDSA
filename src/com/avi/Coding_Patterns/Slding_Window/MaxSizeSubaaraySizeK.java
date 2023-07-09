package Slding_Window;

public class MaxSizeSubaaraySizeK {

    public static int findMaxSumSubarrayOfSizeKBruteForce(int[] a, int k) {
        int maxSum = 0, subarraySum;
        for (int i = 0; i <= a.length-k; i++) {
            subarraySum = 0;
            for (int j = i; j < i+k; j++) {
                subarraySum += a[j];
            }
            maxSum = Math.max(maxSum, subarraySum);
        }

        return maxSum;
    }

    public static int findMaxSumSubarrayOfSizeKOptimal(int[] a, int k) {
        if(k == 0 || a.length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int windowStart = 0;
        int windowSum = 0;

        for(int windowEnd = 0; windowEnd < a.length; windowEnd++) {
            windowSum += a[windowEnd]; // Add the next element to the window

            if(windowEnd-windowStart+1 == k) { // When we hit the window size. Update maximum sum, and slide the window
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= a[windowStart]; // Subtract the element going out of the window
                windowStart++; // Slide the window
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] num={100,200,300,400};
        int ans=MaxSizeSubaaraySizeK.findMaxSumSubarrayOfSizeKOptimal(num,2);
        System.out.println(ans);
    }
}
