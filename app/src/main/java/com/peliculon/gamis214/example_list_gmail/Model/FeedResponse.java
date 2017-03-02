package com.peliculon.gamis214.example_list_gmail.Model;

import java.util.List;

/**
 * Created by GAMA on 02/03/17.
 */

public class FeedResponse {

    private int id;
    private boolean isImportant;
    private String picture;
    private String from;
    private String subject;
    private String message;
    private String pictimestampture;
    private boolean isRead;
    private int color = -1;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPictimestampture() {
        return pictimestampture;
    }

    public void setPictimestampture(String pictimestampture) {
        this.pictimestampture = pictimestampture;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

}
