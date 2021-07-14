package com.ness;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // overriding default constructor
    public BankAccount() {
//        // calling constructor from constructor - must be first statement on constructor body
        this("1112", 1.00, "Bob2", "email2", "0002");
        System.out.println("empty constructor call");

    }

    public BankAccount(String number, double balance, String customerName,
            String customerEmailAddress, String customerPhoneNumber) {
        //setNumber(number);
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("constructor with parameters called");
    }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("5555", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalence() {
        return balance;
    }

    public void setBalence(double balence) {
        this.balance = balence;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Only" + this.balance + "avialable");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal" + withdrawalAmount + " processed.");
        }

    }


}
