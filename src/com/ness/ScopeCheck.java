package com.ness;

public class ScopeCheck {

    public int  publicVar = 0;
    private int privaVar = 1;

//    public ScopeCheck(int publicVar, int privaVar) {
//        this.publicVar = publicVar;
//        this.privaVar = privaVar;
//        System.out.println("Scopecheck created, PV = " + privaVar + ", privateVar = " + privaVar);
//    }

    public ScopeCheck() {
       System.out.println("Scopecheck created, PV = " + privaVar + ", privateVar = " + privaVar);
    }

    public int getPublicVar() {
        return publicVar;
    }

    public int getPrivaVar() {
        return privaVar;
    }

    public void timesTwo() {
        int privateVar = 2;
        for (int i=0; i<10; i++) {
            System.out.println(i + " times two is " + i * privateVar);
            System.out.println(i + " times two is " + i * this.privaVar);
        }
    }

    public class InnerClass {
        public int privaVar = 3;

    }

}
