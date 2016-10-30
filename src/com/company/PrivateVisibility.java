package com.company;

public class PrivateVisibility extends WordpressVisibility{


    @Override
    public boolean isVisible(AccessLevel level) {
        return false;
    }

    @Override
    public boolean canView(String passwd) {
        return true;
    }
}
