package com.company;

public class PublicVisibility extends WordpressVisibility {


    @Override
    public boolean isVisible(AccessLevel level) {
        return true;

    }

    @Override
    public boolean canView(String passwd) {
        return true;
    }


}
