package com.ness;

public class Password {

    private static final int key = 74857621;
    private final int encryptedePassword;

    public Password(int password) {
        this.encryptedePassword = password;
    }

    private int encryptDecrypt(int password) {
        return password ^ key;
    }

//    public final void storePassword() {
//        System.out.println("stored" + this.encryptedePassword);
//    }
    public void storePassword() {
        System.out.println("stored" + this.encryptedePassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedePassword) {
            System.out.println("Wellcome");
            return true;
        } else {
            System.out.println("No");
            return false;
        }
    }
}
