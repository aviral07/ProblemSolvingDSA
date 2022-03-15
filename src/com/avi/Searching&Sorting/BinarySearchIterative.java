import java.util.Arrays;

class BinarySearchIterative {


    public static void main(String[] args) {


        int arr[] = {5, 2, 3, 14, 7};
        Arrays.sort(arr);  //2,3,5,7,14
        int result = BinarySearch(arr, 7);
    System.out.println("index at which the lement is present "+result);
    }

//Iterative
    static int BinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid= (low+high)/2;
            if (arr[mid] == target) {
               return mid;
            }
            if(arr[mid] < target ){
                low =mid +1;
            }
            if(arr[mid] > target){
                  high =mid -1;
            }
        }
        return -1;
    }


}