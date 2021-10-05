package com.ness;

public class SIBTest {

    public static final String owner;

    static {
        System.out.println("2nd static init");
    }

    static {
        owner = "tim";
        System.out.println("static init");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor");
    }



    public void method() {
        System.out.println("method");
    }

}
