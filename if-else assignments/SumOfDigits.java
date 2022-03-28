package com.bridgelabz.assignments;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a range of number : ");
        int number=scanner.nextInt();
        int sum=0;
        int i=0;
        while (i<=number){
            sum+=i;
            i++;
        }
        System.out.println("The sum of range is : " + sum);
    }
}
