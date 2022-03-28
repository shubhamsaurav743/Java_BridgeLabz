package com.assignments.forloopandswitchstatement;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=scanner.nextInt();
        int digit=number;
        int reverse=0;
        for (;digit!=0;digit=digit/10) {
            int remainder = digit % 10;
            reverse = reverse * 10 + remainder;
        }
        if (number==reverse){
            System.out.println(number + " " + "is a Palindrome number . ");
        }
        else{
            System.out.println(number + " " + "is not a Palindrome number .");
        }
    }
}
