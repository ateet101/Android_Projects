package com.example.ateet.recyclerviewapp;

import java.util.UUID;

/**
 * Created by ateet on 11/19/16.
 */
public class MyList {

    private UUID id;
    private String title;
    private String desc;

    public MyList(){
        this.id = UUID.randomUUID();
    }

    public MyList(String title, String desc){
        this.id = UUID.randomUUID();
        this.title = title;
        this.desc = desc;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
