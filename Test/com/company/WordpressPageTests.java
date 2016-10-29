package com.company;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WordpressPageTests {



    @Test
    public void isSorted(){

        List<WordPressPage> wordPressPages = new ArrayList<>();
        WordPressPage pageTitle1 = new WordPressPage("A", "content1");
        WordPressPage pageTitle2 = new WordPressPage("B", "content2");
        WordPressPage pageTitle3 = new WordPressPage("C", "content2");

        wordPressPages.add(pageTitle1);
        wordPressPages.add(pageTitle3);
        wordPressPages.add(pageTitle2);

        wordPressPages = WordPressPage.sortByTitle(wordPressPages);
        Assert.assertEquals(wordPressPages.get(0).title,"A");
        Assert.assertEquals(wordPressPages.get(1).title, "B");
        Assert.assertEquals(wordPressPages.get(2).title,"C");













    }

}
