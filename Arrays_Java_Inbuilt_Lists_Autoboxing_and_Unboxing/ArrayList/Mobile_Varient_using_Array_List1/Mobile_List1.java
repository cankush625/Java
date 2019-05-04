package com.Arrays_Java_Inbuilt_Lists_Autoboxing_and_Unboxing.ArrayList.Mobile_Varient_using_Array_List1;

import java.util.ArrayList;

public class Mobile_List1 {
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

    public void modifyMobileVarient(String currentVarient, String newVarient){
        int position = findVarient(currentVarient);
        if (position >= 0){
            modifyMobileVarient(position, newVarient);
        }
    }

    private void modifyMobileVarient(int position, String newVarient){
        mobileList.set(position, newVarient);
        System.out.println("Mobile varient " + (position+1) + " has been modified");
    }

    public void removeMobileVarient(String varient){
        int position = findVarient(varient);
        if (position >= 0){
            removeMobileVarient(position);
        }
    }

    private void removeMobileVarient(int position){
        mobileList.remove(position);
    }

    private int findVarient(String searchVarient){
        return mobileList.indexOf(searchVarient);
    }

    public boolean ifExist(String searchVarient){
        int position = findVarient(searchVarient);
        if (position >= 0){
            return true;
        }
        return false;
    }
}

// by Ankush Chavan