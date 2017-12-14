package com.example.ghazi.admin;

/**
 * Created by ghazi on 13-Dec-17.
 */

public class Email {
    private String subject,content,receivedTime,sender,Type;

    public Email(String subject, String content, String receivedTime, String sender, String type) {
        this.subject = subject;
        this.content = content;
        this.receivedTime = receivedTime;
        this.sender = sender;
        Type = type;
    }

    public Email() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
