package com.company;

public abstract class WordpressVisibility {
    public enum AccessLevel {
        Anyone,
        Editor,
        Administrator
    }

    public abstract boolean isVisible(AccessLevel level);
    public abstract boolean canView(String passwd);




    public boolean isInFeed(){
        return isVisible(AccessLevel.Anyone);
    }

    public boolean canBeSearched(){
        return isVisible(AccessLevel.Anyone);
    }

    public boolean isViewable() {return isVisible(AccessLevel.Anyone); }
}
