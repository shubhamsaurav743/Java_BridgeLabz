package com.assignments.forloopandswitchstatement;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=scanner.nextInt();
        int reverse=0;
        for (;number!=0;number=number/10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of a number is " + reverse);
    }
}
