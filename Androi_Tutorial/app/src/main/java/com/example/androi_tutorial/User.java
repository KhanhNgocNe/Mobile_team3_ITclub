package com.example.androi_tutorial;

public class User {
    String name, lastMessage, lastMsgTime, phone, country;
    int imgId;

    public User(String name, String lastMessage, String lastMsgTime, String phone, String country, int imgId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.lastMsgTime = lastMsgTime;
        this.phone = phone;
        this.country = country;
        this.imgId = imgId;
    }
}
