package com.control_flow_statements;

public class switch_statement {
    public static void main(String[] args){
        int switchCase = 3;

        switch (switchCase){
            case 1 :
                System.out.println("The value was 1");
                break;

            case 2 :
                System.out.println("The value was 2");
                break;

            case 3: case 4: case 5:  //No. of possibilities works at a time
                System.out.println("It was a 3 or 4 or 5");
                System.out.println("Actually it was a "+switchCase);
                break;

            default :
                System.out.println("The value was neither 1 nor 2");
                break;
        }

        switchChar();
        switchString();
    }

    public static void switchChar(){
        char switchValue = 'A';

        switch (switchValue){
            case 'A':
                System.out.println("Hello Ankush");
                break;

            case 'B':
                System.out.println("Hello Tim");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("Hello Mark");
                break;

            default:
                System.out.println("No one is available");
                break;
        }
    }

    public static void switchString(){
        String switchWord = "january";

        switch (switchWord.toLowerCase()){  //.toLowerCase() will make all the case letters to lower case
            case "january":
                System.out.println("Its January");
                break;

            case "february":
                System.out.println("Its February");
                break;

            case "march": case "april": case "may":
                System.out.println("Its may be March or April or May");
                System.out.println("Its actually "+switchWord);
                break;

            default:
                System.out.println("Not sure!");
                break;
        }
    }
}
