package com.control_flow_statements;

public class while_do_while_statement {
    public static void main(String[] args){
        int count = 1;
        while(count != 6){
            System.out.println("The count is "+count);
            count++;
        }

        System.out.println("*******************");

        count = 1;
        while(true){
            if(count == 6){
                break;
            }
            System.out.println("The count is "+count);
            count++;
        }

        System.out.println("*******************");

        count = 1;
        do {
            System.out.println("The count is "+count);
            count++;
        }while (count != 6);

        System.out.println("*******************");

        count = 1;
        do {
            System.out.println("The count is "+count);
            count++;

            if(count > 100){
                break;
            }
        }while (true); //Code is written wrong in the tutorial! Corrected here!
    }

}
