package com.ness;

public class Main14 {
    // Math is final: cannot do it
    //public class Main14 extends Math{

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(SomeClass.classCounter);
//
//        System.out.println(Math.PI);
//
//        // cannot create it because constructor is private
//        //Math m = new Math();
//
//        int pw = 456456;
//        Password password = new PasswordExtended(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(44);
//        password.letMeIn(456456);

//        System.out.println("main methods");
//        SIBTest test = new SIBTest();
//        test.method();
//        System.out.println("owner is" + SIBTest.owner);

        Theatre theatre = new Theatre("Test", 10, 11);
        theatre.getSeats();
        if (theatre.reserveSeat("H11")) {
            System.out.println("pay");
        } else {
            System.out.println("taken");
        }

        if (theatre.reserveSeat("H11")) {
            System.out.println("pay");
        } else {
            System.out.println("taken");
        }


    }

}
