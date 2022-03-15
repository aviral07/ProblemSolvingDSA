import java.util.Arrays;

public class LinearSearchIterative {


    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 14, 7};
       // Arrays.sort(arr);  //2,3,5,7,14
        int result = LinearSearch(arr, 7);
        System.out.println("index at which the lement is present "+result);
    }

    //iterative

    static int LinearSearch(int[] arr , int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
