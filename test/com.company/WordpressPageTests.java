package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WordpressPageTests {

    // return (id + "\n" + parent + "\n" + order + "\n" + viewCount + "\n" + title + "\n" + content + "\n" + isVisible + "\n" + dateFormat.format(date_time.getTime())+ "\n" + status);

    ArrayList<WordPressPage> pageList = new ArrayList<>();

    static WordPressPage page1 = new WordPressPage("ala", "content");
    static WordPressPage page2 = new WordPressPage("portocala", "content");
    static WordPressPage page3 = new WordPressPage("bala", "content");
    static WordPressPage page4 = new WordPressPage("zala", "content");


    @Test
    public void alphabeticalTitlesTest() {
        pageList.add(page1);
        pageList.add(page2);
        pageList.add(page3);
        pageList.add(page4);

        System.out.println("Lista initiala");
        for (int i = 0; i < pageList.size(); i++) {
            System.out.println(pageList.get(i));
        }

        pageList = WordPressPage.sortByTitle(pageList);

        System.out.println("Lista ordonata");
        for (int i = 0; i < pageList.size(); i++) {
            System.out.println(pageList.get(i));
        }

        Assert.assertTrue("Nu e sortat poz 0", page1 == pageList.get(0));
        Assert.assertTrue("Nu e sortat poz 2", page2 == pageList.get(2));
        Assert.assertTrue("Nu e sortat poz 1", page3 == pageList.get(1));
        Assert.assertTrue("Nu e sortat poz 3", page4 == pageList.get(3));
    }
}
