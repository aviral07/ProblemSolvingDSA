package com.avi.arrayprograms;

public class SecondLargestNumber {

    //Basic Solution is to sort array and find the second last element in that array

    public static void findSecondLargest(int arr[]){

        if(arr.length <2){
            System.out.println("Second largest does not exist");
        }
        //Integer.MIN_VALUE=-214k7483648
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                secondlargest=largest;
                largest=arr[i];
            }
            if(arr[i] != largest && arr[i] >secondlargest){
                secondlargest=arr[i];
            }
        }
        if(secondlargest == Integer.MIN_VALUE){
            System.out.println("Not exist");
        }
        else{
            System.out.println("Second largest Element is"+secondlargest);
        }

        //o(n) this solution complexity
    }
    public static void main(String[] args)
    {
        SecondLargestNumber sl = new SecondLargestNumber();
        int arr[] = { -1, -2, -3, -3, -4, -6};
        int arr_size = arr.length;

        //dp.findDuplicate(arr);
        sl.findSecondLargest(arr);

    }
}
