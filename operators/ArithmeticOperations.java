package com.assignments.operators;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=300;
        int result1=a+b*c;
        int result2=c+b/a;
        int result3=a%b+c;
        int result4=a*b+c;
        if (result1>result2 && result1>result3 && result1>result4){
            System.out.println(result1+" "+"is maximum");
        }
        if (result2>result1 && result2>result3 && result2>result4){
            System.out.println(result2+" "+"is maximum");
        }
        if (result3>result1 && result3>result2 && result3>result4){
            System.out.println(result3+" "+"is maximum");
        }
        if (result4>result1 && result4>result2 && result4>result3){
            System.out.println(result4+" "+"is maximum");
        }
    }
}
