package com.oops.composition;

public class PC_main {
    public static void main(String[] args){
        dimensions dimensions = new dimensions(64, 24, 8);
        case_ theCase = new case_("HP", "HP", "240", dimensions);

        monitor theMonitor = new monitor("Apple", "Apple", 64, new resolution(64, 24));
        motherboard theMotherboard = new motherboard("Apple", "Apple", 4, 6, "v8.66");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getTheMonitor().getManufacturer();
        thePC.getTheMotherboard().loadProgram("Java");
    }
}
