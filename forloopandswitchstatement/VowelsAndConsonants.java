package com.assignments.forloopandswitchstatement;
import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a alphabet : ");
        char character=((scanner.nextLine())).charAt(0);
        char word=Character.toLowerCase(character);
        switch(word){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(word+" "+ " is a vowel.");
                break;
            default:
                System.out.println(word+" "+"is a consonants.");
        }
    }
}
