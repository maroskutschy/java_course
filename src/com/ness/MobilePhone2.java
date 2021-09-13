package com.ness;

public class MobilePhone2 implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public MobilePhone2(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    //alt + insert
    @Override
    public void powerOn() {
        System.out.println("No power button.");
    }

    @Override
    public void dial(int phoeNumber) {
        System.out.println("No ringing");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("answering Mobile phone 2");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        System.out.println("Mobile phone");
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring");
        } else {
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
