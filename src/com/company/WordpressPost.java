package com.company;

import java.util.ArrayList;
import java.util.List;

public class WordPressPost extends WordPressPage {

    public List<String> tags = new ArrayList<>();
    public List<String> cathegory = new ArrayList<>();
    public enum Format {
        Standard, Aside, Image,Video, Quote, Link
    }
    Format format;
    public static int PostCount;

    public WordPressPost(String title, String c) {
        super(title, c);
        PostCount++;
        id = PostCount;
    }


}
