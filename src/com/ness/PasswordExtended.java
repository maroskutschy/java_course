package com.ness;

public class PasswordExtended extends Password {

    private int decryptedPassword;

    public PasswordExtended(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    @Override
    public void storePassword() {
        System.out.println("saving password" + this.decryptedPassword);
        super.storePassword();
    }
}
