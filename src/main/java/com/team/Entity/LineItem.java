package com.team.Entity;

/**
 * Created by andrewdmo on 10/5/16.
 */
public class LineItem {

    private Long id;
    private String title;
    private Long product_id;


    public LineItem(){}


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

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }
}
