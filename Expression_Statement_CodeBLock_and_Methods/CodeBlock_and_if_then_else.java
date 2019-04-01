package com.Expression_Statement_CodeBLock_and_Methods;

public class CodeBlock_and_if_then_else {
    public static void main(String[] args){
        int a = 50;

        if (a == 50){
            System.out.println("The value of a is "+a);
        }else if(a>100){
            System.out.println("The value of a is wrong");
        }//Code with codeblock

        if (a == 50)
            System.out.println("The value of a is "+a); //Code without codeblock
    }
}
