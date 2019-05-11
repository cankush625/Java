package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.Autoboxing_and_Unboxing;
import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Passing_Integer_Value_to_the_ArrayList_by_Creating_Class {
    public static void main(String[] args) {
        //ArrayList cant take int as a type, because primitive types are not allowed. So we have to declare a class for
        // the integer value and pass that class name as the type for the ArrayList
        //String is the class and not a primitive type so we can pass String as a type to the ArrayList directly
        
        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        intArrayList.add(new IntClass(10));
    }
}

//by Ankush Chavan