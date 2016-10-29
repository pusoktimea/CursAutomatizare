package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WordPressPost extends WordPressPage {

    public static int postCount;

    public WordPressPost(String title, String c) {
        super(title, c);
            this.title = title;
            content = c;
            postCount++;
            id = postCount;
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