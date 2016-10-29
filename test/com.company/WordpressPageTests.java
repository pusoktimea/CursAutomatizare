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

    static WordPressPost post1 = new WordPressPost("post1", "contentpost1");
    static WordPressPost post2 = new WordPressPost("post2", "contentpost21");

    static WordPressComments comm1 = new WordPressComments();
    static WordPressComments comm2 = new WordPressComments("dolores.pente@altom.ro");


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


    @Test
    public void unicitateaIDurilorTest(){
        System.out.println("Page 1 title " + page1.id);
        System.out.println("Post 1 title " + post1.id);
        System.out.println("Page 2 title " + page2.id);
        System.out.println("Post 2 title " + post2.id);
        Assert.assertEquals(page1.id, post1.id);
        Assert.assertNotEquals(page1.id, page2.id);
        Assert.assertNotEquals(post2.id, post1.id);
        Assert.assertEquals(post2.id, page2.id);

    }

    @Test
    public void isPagedPublishedTest(){
        //Assert.assertTrue("Nu e published", page1.status == WordPressPage.Status.Published);
        page2.publish();
        Assert.assertTrue("Nu e published", page2.status == WordPressPage.Status.Published);
    }

    @Test
    public void isCommPublishedTest(){
        comm1.publish();
        System.out.println(comm1);
        System.out.println(comm2);
        Assert.assertTrue("Nu e published", comm1.status == WordPressComments.Status.Approved);
    }

    public void testPublish(iPublish element){
        element.publish();
        Assert.assertTrue("Nu e published", element.isPublished());
    }

    @Test
    public void publishCommTest(){
        testPublish(comm1);
        testPublish(page1);
        testPublish(post1);
    }

}
