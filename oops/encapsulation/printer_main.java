package com.oops.encapsulation;

public class printer_main {
    public static void main(String[] args) {
        printer printer_ = new printer(60, true);
        System.out.println("Initial pages count = "+printer_.getPagesPrinted());
        int pagesPrinted = printer_.printPages(20);
        System.out.println("Pages printed was "+pagesPrinted + ", new total print count for printer = "+printer_.getPagesPrinted());
        pagesPrinted = printer_.printPages(12);
        System.out.println("Pages printed was "+pagesPrinted + ", new total print count for printer = "+printer_.getPagesPrinted());
    }
}