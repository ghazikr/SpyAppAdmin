package com.example.ghazi.admin;

/**
 * Created by ghazi on 12-Dec-17.
 */

public class Notification {
    private String type,content,receivedTime,sender;

    public Notification() {
    }

    public Notification(String type, String content, String receivedTime, String sender) {
        this.type = type;
        this.content = content;
        this.receivedTime = receivedTime;
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", receivedTime='" + receivedTime + '\'' +
                ", sender='" + sender  + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return sender ;
    }

    public void setSender(String sender) {
        this.sender  = sender;
    }
}
