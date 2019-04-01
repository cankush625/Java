package com.Expression_Statement_CodeBLock_and_Methods;

public class methods {
    public static void main(String[] args){
        int a = 50;

        if (a == 50){
            System.out.println("The value of a is "+a);
        }else if(a>100){
            System.out.println("The value of a is wrong");
        }//Code with codeblock

        calc(a);
        calc(100);
    }

    public static int calc(int a){
        if (a == 50) {
            System.out.println("The value of a is " + a);
            return a;
        }else{
            return -1;
        }
    }
}
