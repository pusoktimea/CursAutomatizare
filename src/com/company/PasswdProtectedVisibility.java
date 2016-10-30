package com.company;

public class PasswdProtectedVisibility extends PrivateVisibility {

    String password;

    public PasswdProtectedVisibility(String password) {
        this.password = password;
    }

    @Override
    public boolean canView(String passwd) {
        if (passwd == password)
            return true;
        else return false;
    }
}
