package com.control_flow_statements;

public class for_loop {
    public static void main(String[] args){
        for (int i=0; i<5; i++){
            System.out.println("The loop " + i +" hello!");
        }

        for (double i = 0; i<5; i++){
            System.out.println("The value of i is "+String.format("%.2f", i));
        }
    }
}
