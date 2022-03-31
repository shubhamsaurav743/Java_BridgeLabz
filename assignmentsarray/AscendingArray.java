package com.assignmentsarray;

public class AscendingArray {
    public static void main(String[] args) {
        int[] arr={10,60,30,40,90,3,50,100,70,12,5};
        int temp=0;
        System.out.println("Displaying array in original form : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Displaying array in ascending order : ");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
