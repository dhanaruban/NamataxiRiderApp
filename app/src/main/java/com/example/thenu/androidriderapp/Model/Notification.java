package com.example.thenu.androidriderapp.Model;

public class Notification extends android.app.Notification {
    public String title;
    public String body;

    public Notification(String title, String body) {
        this.title = title;
        this.body = body;
    }

}
