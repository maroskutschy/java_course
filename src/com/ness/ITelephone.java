package com.ness;

public interface ITelephone {

    // all methods public by default (cannot be private)
    void powerOn();
    void dial(int phoeNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
