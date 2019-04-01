package com.oops.composition;

public class PC {
    private case_ theCase;
    private monitor theMonitor;
    private motherboard theMotherboard;

    public PC(case_ theCase, monitor theMonitor, motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public case_ getTheCase() {
        return theCase;
    }

    public monitor getTheMonitor() {
        return theMonitor;
    }

    public motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
