package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WordPressComments implements iPublish {

    public int id;
    public String email = "dolly.pente@altom.ro",
            content = "d f f g";
    protected Boolean isVisible = true;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Calendar date_time = Calendar.getInstance();

    enum Status {
        Approved,
        Pending,
        Spam
    }

    public WordPressComments.Status status = WordPressComments.Status.Pending;
    public static int CommentCount;

    public WordPressComments() {
        CommentCount++;
        id = CommentCount;
    }

    public WordPressComments(String email){
        this.email = email;
    }

    public String toString() {
        return (id + "\n" + email + "\n" + content + "\n" + isVisible + "\n" + dateFormat.format(date_time.getTime())+ "\n" + status);
        //return title + "\n" + content;
    }

    public void publish() {
        status = Status.Approved;
    }

    public void unpublish() {
        status = Status.Spam;
    }

    public boolean isPublished() {
        if(status == Status.Approved)
            return true;
        else return false;
    }

}
