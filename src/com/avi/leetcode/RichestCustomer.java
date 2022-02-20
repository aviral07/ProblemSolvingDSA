import java.util.Arrays;

public class RichestCustomer {
     public static int findLargest( int[] arr,int n){
        Arrays.sort(arr);
        return arr[n-1];

    }
    public static void main(String[] args) {
        int[][] accounts = { {11, 2} , { 4, 5},{1,1},{1,5} };
        int[]  sum_arr=new int[accounts.length];
        for(int i=0 ;i < accounts.length;i++){
            int sum=0;
            for(int j=0; j <  accounts[i].length;j++){
                sum= sum+accounts[i][j];
            }
            sum_arr[i]=sum;
        }

        int largest = RichestCustomer.findLargest( sum_arr, sum_arr.length);
        System.out.println(largest);
        for(int i=0;i<accounts.length;i++){
            if(largest == sum_arr[i]){
                System.out.println(" The "+ (i+1)+" is Richest Customer");
            }
           // System.out.println(sum_arr[i]);
        }

    }
}
