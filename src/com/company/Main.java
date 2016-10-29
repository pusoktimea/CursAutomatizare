package com.company;

public class Main {

    static WordPressPage pageC1 = new WordPressPage("title", "content");
    static WordPressPage pageC2 = new WordPressPage("title2", "content2 2");
    public static WordPressPage pageC3 = new WordPressPage("title3", "content3");
    static WordPressPage pageC4 = new WordPressPage("title4", "content4");


    public static void main(String[] args) throws Exception {
       //pageC3.status = WordPressPage.Status.Published;
        pageC4.isVisible = Boolean.FALSE;

        System.out.println(pageC1.getStatus());
        pageC1.setStatus();
        //System.out.println(pageC1.isPublished());
       // pageC1.publishDate(5);



        System.out.println(pageC1);
        System.out.println(pageC2);
        pageC1.setParent(pageC1);
        pageC3.publishHour(2);
       System.out.println(pageC4);
     //   pageC4.publishDate(5);

       System.out.println(pageC3);
       System.out.println(pageC4);
        System.out.println(pageC4);

       int c = pageC2.getWordCount();
        System.out.println(c);
    }

}
