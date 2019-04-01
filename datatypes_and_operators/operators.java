package com.datatypes_and_operators;

public class operators {
    public static void main(String[] args){
        int result = 1 + 2;
        System.out.println("The result of 1 + 2 is "+result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = "+result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = "+result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = "+result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = "+result);

        result++;
        System.out.println("The currrent result is "+result);

        result--;
        System.out.println("The result is now "+result);

        result += 10;
        System.out.println("The current result is "+result);

        result *= 4;
        System.out.println("The result is now "+result);

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien!");

        int score = 100;
        int secondScore = 98;
        if(score == 100){
            System.out.println("You got an top score!");
        }else if(score<=99){
            System.out.println("You are not a top scorer");
        }

        if(score>95 && secondScore>96){
            System.out.println("You are the topper of the college!");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true:false;
        if(wasCar){
            System.out.println("This is true!");
        }
    }
}
