package com.zayden.android.task;

import java.io.Serializable;
import java.util.HashMap;

public class Todo implements Serializable {

    private String name;
    private String message;
    private String date;
    private String time;

    public Todo() {

    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) { this.date = date; }

    public String getTime() {
        return time;
    }

    public void  setTime(String time) {this.time = time;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public HashMap<String,String> toFirebaseObject() {
        HashMap<String,String> todo =  new HashMap<String,String>();
        todo.put("name", name);
        todo.put("message", message);
        todo.put("date", date);
        todo.put("time", time);

        return todo;
    }

}