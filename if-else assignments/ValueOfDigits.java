package com.bridgelabz.assignments;
import java.util.Scanner;

public class ValueOfDigits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter only 4 digit number : ");
        int number=scan.nextInt();
        int thousands;
        int hundred;
        int tens;
        int unit;
        if (number<=99999 && number>99){
            thousands=(number/1000)%10;
            System.out.println("Thousands place digit : " + thousands);
            hundred=(number/100)%10;
            System.out.println("Hundred place digit : " + hundred);
            tens=(number/10)%10;
            System.out.println("Tens place digit : " + tens);
            unit=number%10;
            System.out.println("Units place digit : " + unit);
        }
        else{
            if (number>99999)
                System.out.println("Please enter only 4 digit number !!!!");
                if (number<99)
                    System.out.println("Please enter only 4 digit number !!!!");
        }
    }
}
