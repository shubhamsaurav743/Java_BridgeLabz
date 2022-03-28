package com.assignments.forloopandswitchstatement;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=scanner.nextInt();
        int sum=0;
        for (int i=0;i<=number;i++){
            sum += i;
        }
        System.out.println("The sum of number is : " + sum);
    }
}
