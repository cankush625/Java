package com.interface_;

public interface ITelephone {
    void poweron();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
