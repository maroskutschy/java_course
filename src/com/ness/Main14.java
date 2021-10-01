package com.ness;

public class Main14 {
    // Math is final: cannot do it
    //public class Main14 extends Math{

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());

        System.out.println(Math.PI);

        // cannot create it because constructor is private
        //Math m = new Math();

        int pw = 456456;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(44);
        password.letMeIn(456456);


    }

}
