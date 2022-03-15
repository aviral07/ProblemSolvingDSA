public class LinearSearchRecursive {


    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 14, 7};
        // Arrays.sort(arr);  //2,3,5,7,14
        boolean result = findrecusively(arr, 27,0);
        int resultIndex= findIndex(arr,7,0);
        System.out.println("index at which the element is present "+resultIndex);
    }

static boolean findrecusively(int[] arr, int target, int index)  // In all three argument of this recursive function only index is changing
        //in every recursive call
{
        if( index == arr.length){
            return  false;
        }

        return arr[index]== target || findrecusively(arr,target,index+1);   //the index should exist in remaining part of array
}


static int findIndex(int[] arr, int target, int index){
    if( index == arr.length){
        return  -1;
    }

    if(arr[index]== target ){
        return index;
    }
  else {
        return findIndex(arr,target,index+1);
    }

}
    static int findIndexFromLast(int[] arr, int target, int index){
        if( index == -1){
            return  -1;
        }

        if(arr[index] == target ){
            return index;
        }
        else {
            return findIndex(arr,target,index - 1);
        }

    }
}
