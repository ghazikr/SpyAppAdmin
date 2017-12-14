package com.example.ghazi.admin;

/**
 * Created by ghazi on 12-Dec-17.
 */

public class Sms {
    private String address;
    private String body;

    public Sms() {
    }

    public Sms(String address, String body) {
        this.address = address;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Sms{" +
                "address='" + address + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
