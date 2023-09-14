package Slding_Window;

public class firstNegativeInSubarray {
    private static int[] findFirstNegativeNumberInSubarray(int[] a, int k) {
        int n = a.length;
        int[] firstNegativeNumbers = new int[n - k + 1];
        int idx = 0;

        for(int i = 0; i <= n-k; i++) {
            int firstNegativeNum = 0;
            for(int j = i; j < i+k; j++) {
                if(a[j] < 0) {
                    firstNegativeNum = a[j];
                    break;
                }
            }
            firstNegativeNumbers[idx++] = firstNegativeNum;
        }

        return firstNegativeNumbers;
    }

    private static int[] findFirstNegativeNumberInSubarrayOptimal(int[] a, int k) {
        int n = a.length;
        int[] firstNegativeNumbers = new int[n - k + 1];
        int idx = 0;

        for(int i = 0; i <= n-k; i++) {
            int firstNegativeNum = 0;
            for(int j = i; j < i+k; j++) {
                if(a[j] < 0) {
                    firstNegativeNum = a[j];
                    break;
                }
            }
            firstNegativeNumbers[idx++] = firstNegativeNum;
        }

        return firstNegativeNumbers;
    }

    public static void main(String[] args) {

        int[] num={-5, 1, 2, -6, 9};
        int[] ans= firstNegativeInSubarray.findFirstNegativeNumberInSubarray(num,2);
        System.out.println(ans);

    }
}
