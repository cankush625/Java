package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.Autoboxing_and_Unboxing;
import java.util.ArrayList;

public class Autoboxing_and_Unboxing {
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i)); //This is the autoboxing
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //This is the unboxing
        }

        //How the Integer works
        Integer myIntValue = 56; //Integer.valueOf(56);
        int myInt = myIntValue; //myIntValue.intValue();

        ArrayList<Double> doubleArrayList = new ArrayList<>();

        for (double i = 0.0; i < 10.0; i+= 0.5) {
            doubleArrayList.add(Double.valueOf(i));
        }

        for (int i = 0; i < doubleArrayList.size(); i++){
            System.out.println(i + " --> " + doubleArrayList.get(i).doubleValue());
        }
    }
}

/*
  Output :
    0 --> 0
    1 --> 1
    2 --> 2
    3 --> 3
    4 --> 4
    5 --> 5
    6 --> 6
    7 --> 7
    8 --> 8
    9 --> 9
    0 --> 0.0
    1 --> 0.5
    2 --> 1.0
    3 --> 1.5
    4 --> 2.0
    5 --> 2.5
    6 --> 3.0
    7 --> 3.5
    8 --> 4.0
    9 --> 4.5
    10 --> 5.0
    11 --> 5.5
    12 --> 6.0
    13 --> 6.5
    14 --> 7.0
    15 --> 7.5
    16 --> 8.0
    17 --> 8.5
    18 --> 9.0
    19 --> 9.5
*/

//by Ankush Chavan