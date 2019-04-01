package com.interface_;

public class main {
    public static void main(String[] args){
        ITelephone AnkushsPhone;
        AnkushsPhone = new DeskPhone(12345);
        AnkushsPhone.poweron();
        AnkushsPhone.callPhone(12345);
        AnkushsPhone.answer();

        AnkushsPhone = new MobilePhone(23456);
        AnkushsPhone.poweron();
        AnkushsPhone.callPhone(23456);
        AnkushsPhone.answer();
    }
}
