package com.assignments.forloopandswitchstatement;
import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number from 1 to 12 : ");
        int number=scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("1 represents January . ");
                break;
            case 2:
                System.out.println("2 represents February . ");
                break;
            case 3:
                System.out.println("3 represents March . ");
                break;
            case 4:
                System.out.println("4 represents April . ");
                break;
            case 5:
                System.out.println("5 represents May . ");
                break;
            case 6:
                System.out.println("6 represents June . ");
                break;
            case 7:
                System.out.println("7 represents July . ");
                break;
            case 8:
                System.out.println("8 represents August . ");
                break;
            case 9:
                System.out.println("9 represents September . ");
                break;
            case 10:
                System.out.println("10 represents October . ");
                break;
            case 11:
                System.out.println("11 represents November . ");
                break;
            case 12:
                System.out.println("12 represents December . ");
                break;
            default:
                System.out.println("Please enter number between 1 to 12 !!!");
        }
    }
}
