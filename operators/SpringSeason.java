package com.assignments.operators;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter date : ");
        System.out.println("Enter month : ");
        int d=scanner.nextInt();
        int m=scanner.nextInt();

        if ((m <= 6 && d <= 20) && (m >= 3 && d <= 20) && (d<31)){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
