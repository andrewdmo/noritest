package com.team.Entity;

/**
 * Created by andrewdmo on 10/5/16.
 */
public class Product {

    private Long id;
    private String title;

    public Product(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
