package com.ness;

public class Main12 {


    public static void main(String[] args) {

//        String privateVar = "private";
//
//        ScopeCheck scopeCheck = new ScopeCheck();
//
//        System.out.println(privateVar);
//
//        scopeCheck.timesTwo();

        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        //System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Isnatnce");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        // System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        // all instances share same copy of static fields !
        StaticTest thirdInstance = new StaticTest("3rd Isnatnce");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        //System.out.println(thirdInstance.getName() + " is instance number " + thirdInstance.getNumInstances());
        //System.out.println(thirdInstance.getName() + " is instance number " + secondInstance.getNumInstances());

    }





}
