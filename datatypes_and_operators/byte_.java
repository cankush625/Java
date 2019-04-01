package com.datatypes_and_operators;

public class byte_ {
    public static void main(String[] args){
        byte myBytenum = 127; //byte range is from -128 to 127
        byte myByteDiv =(byte) (5364/2); //type cascading to treat integer value as a byte

        System.out.println(myBytenum);
        System.out.println(myByteDiv);

        byte byteValue = 10;
        short shortValue = 76;
        int intValue = 79;

        long typeSum = 50000 + 10 * (byteValue + shortValue + intValue);
        System.out.println("Long total = "+typeSum);
    }
}
