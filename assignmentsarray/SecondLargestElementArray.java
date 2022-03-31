package com.assignmentsarray;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        int[] arr={10,60,30,40,90,3,50,100,70,12,5};
        int temp=0;
        System.out.println("Displaying array in original form : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Displaying array in descending order : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Displaying the 2nd largest number in a given array : ");
        System.out.println(arr[1]);
    }
}
