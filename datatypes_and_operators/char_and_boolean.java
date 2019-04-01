package com.datatypes_and_operators;

public class char_and_boolean {
    public static void main(String[] args){
        char myChar = 'A'; //width 16 (2 bytes)
        char myUniChar = '\u00A9';

        System.out.println("Char is = "+myChar);
        System.out.println("Unicode char is = "+myUniChar);

        boolean myBoolean = false;
        boolean isMAle = true;

        System.out.println(myBoolean);
        System.out.println(isMAle);
    }
}
