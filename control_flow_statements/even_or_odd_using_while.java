package com.control_flow_statements;

public class even_or_odd_using_while {
    public static void main(String[] args){
        int count = 1;
        int isEven = 0;

        while(count != 9){
            if(count%2 == 0){
                System.out.println("The "+count+" is an even number");
                count++;
                isEven++;
            }else{
                System.out.println("The "+count+" is an odd number");
                count++;
            }
        }

        System.out.println("Total even numbers found are "+isEven);
    }
}
