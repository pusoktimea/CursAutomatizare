package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WordPressPage {

    public int id = 35,
            parent = 6,
            order = 8,
            viewCount = 8;
    public String title = "g",
            content = "d f f g";
    protected Boolean isVisible = true;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Calendar date_time = Calendar.getInstance();

    enum Status {
        Pending,
        Draft,
        Published
    }

    private Status status = Status.Draft;
    public static int PageCount;
    public static List<WordPressPage> pendingReviewPages = new ArrayList<>();;

    public WordPressPage(String title, String c) {
        String initTitle = this.title;
        this.title = title;
        content = c;
        PageCount++;
        id = PageCount;
    }


    //TODO
    //A[] arr = new A[4];
    //WordPressPage[] arr = new WordPressPage[id,parent,order,viewCount,title,content,isVisible,date_time,status};

    public String toString() {
        return (id + "\n" + parent + "\n" + order + "\n" + viewCount + "\n" + title + "\n" + content + "\n" + isVisible + "\n" + dateFormat.format(date_time.getTime())+ "\n" + status);
        //return title + "\n" + content;
    }

    public void publishHour(int hours) {
        status = Status.Published;
        date_time.add(Calendar.HOUR_OF_DAY,hours);
    }

    public void publishDate(int now) throws Exception {

        if (status == Status.Published)
            throw new NullPointerException("The page is already published");
//te
    }

        // System.out.println(status);
        // System.out.println(date_time);

    public int getWordCount(){

        return content.split(" ").length;

    }

    public void pending() {
        status = Status.Pending;
        pendingReviewPages.add(this);

    }

    public void  printList() {
        for (int i = 0; i < pendingReviewPages.size(); i++) {
            System.out.println(pendingReviewPages.get(i));
        }
    }

    public void setParent(WordPressPage page){
        parent = 1;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(){
        this.status = Status.Published;
    }

    public boolean isPublished(){
        if (status == Status.Published)
                return true;
        else return  false;
    }
}
