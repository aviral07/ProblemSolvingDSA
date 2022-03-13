import java.util.ArrayList;
import java.util.List;

public class LinearSearch {


    public static void main(String[] args) {

        int[]  arr={ 2,2,77,34,45};
       // boolean result=findElement(arr, 2,0);
      //  System.out.println(result);

        //int resultI=findIndex(arr,2,0);
        //int resultL=findIndexLast(arr,2,arr.length-1);

findAllIndex(arr,2,0);
        System.out.println(al);

    }

    public static boolean  findElement(int[] arr,int target,int index){

        return arr[index] == target || findElement(arr,target,index +1 );
    }


    static int findIndex(int[] arr,int target,int index){

        if(arr[index] == target){
            return index;
        }
        return findIndex(arr,target,index +1);
    }
    static int findIndexLast(int[] arr,int target,int index){

        if(arr[index] == target){
            return index;
        }
        return findIndexLast(arr,target,index -1);
    }
  static List<Integer> al=new ArrayList<Integer>();
    static void findAllIndex(int[] arr,int target,int index){
        if(index == arr.length){
           return;
        }
        if(arr[index] == target){
            al.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
}
