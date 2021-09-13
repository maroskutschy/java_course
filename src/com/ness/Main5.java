package com.ness;

import java.util.ArrayList;

public class Main5 {

    public static void main(String[] args) {
//        Customer customer = new Customer("Maros", 100.36);
//        Customer anotherCustomer = customer;
//        anotherCustomer = customer;
//        anotherCustomer.setBalance(12.69);
//        System.out.println("Balance for cumtomer " + customer.getName() + " is " + customer.getBalance());
//
//        ArrayList<Integer> intList = new ArrayList<Integer>();
//
//        intList.add(1);
//        intList.add(3);
//        intList.add(4);
//
//        for (int i=0; i<intList.size(); i++) {
//            System.out.println(i + ": " + intList.get(i));
//        }
//
//        intList.add(1,2);
//
//        for (int i=0; i<intList.size(); i++) {
//            System.out.println(i + ": " + intList.get(i));
//        }

        // Je to jedno ako ???
        ITelephone marosPhone;
        //DeskPhone marosPhone;
        marosPhone = new DeskPhone(1232, true);
        marosPhone.powerOn();
        marosPhone.callPhone(1232);
        marosPhone.answer();

        marosPhone = new MobilePhone2(132123, true);
        marosPhone.answer();

    }
}
