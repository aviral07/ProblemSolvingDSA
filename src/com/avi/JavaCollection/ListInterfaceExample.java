import java.util.*;

class ListInterfaceExample{
    public static void main(String[] args) {
        List<Integer> alist =new ArrayList<>();

        alist.add(1);
        alist.add(2);
        alist.add(3);
        //System.out.println(alist);

      //  System.out.println("Elemnt that got replace"+alist.set(1,100));

        //System.out.println(alist);

        List<Integer> alist2 =new ArrayList<>();
        alist2.add(4);
        alist2.add(5);
        alist2.add(6);

        alist2.addAll(alist);   //imp method to add two list


       // System.out.println(alist2.lastIndexOf(2));  //get the index of the last occurrence of an element in an ArrayList
      //  System.out.println(alist2);
        List<Integer> alist3 =alist2.subList(1,4);

      //  System.out.println(alist3);

        for(int x:alist3)
            System.out.println(x);


        //Sometimes in leetcode we need to use arraylist and returns an array as a return for that function

        Integer[] arr=alist.toArray(new Integer[0]);

    }





}