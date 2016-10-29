package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WordPressPost extends WordPressPage {

    public WordPressPost(String title, String c) {
        super(title, c);
    }

    public static List<String> tags = new ArrayList<>();
    public static List<String> categories = new ArrayList<>();

    enum Format {
        Standard,
        Aside,
        Video,
        Image,
        Quote,
        Link
    }
    public static Format format = Format.Aside;
    
}