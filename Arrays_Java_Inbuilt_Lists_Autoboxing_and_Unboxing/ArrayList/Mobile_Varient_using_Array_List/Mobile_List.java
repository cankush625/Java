package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.ArrayList.Mobile_Varient_using_Array_List;

import java.util.ArrayList;

public class Mobile_List {
    private ArrayList<String> mobileList = new ArrayList<String>();

    public void addMobileVarient(String varient){
        mobileList.add(varient);
    }

    public void printMobileVarient(){
        System.out.println("You have " +mobileList.size()+ " pieces in your mobile list");
        for (int i = 0; i < mobileList.size(); i++){
            System.out.println((i+1) + "." + mobileList.get(i));
        }
    }

    public void modifyMobileVarient(int position, String newVarient){
        mobileList.set(position, newVarient);
        System.out.println("Mobile varient " + (position+1) + " has been modified");
    }

    public void removeMobileVarient(int position){
        String theVarient = mobileList.get(position);
        mobileList.remove(position);
    }

    public String findVarient(String searchVarient){
        int position = mobileList.indexOf(searchVarient);
        if (position >= 0){
            return mobileList.get(position);
        }
        return null;
    }
}

// by Ankush Chavan