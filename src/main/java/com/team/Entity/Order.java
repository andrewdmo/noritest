package com.team.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrewdmo on 10/5/16.
 */
public class Order {

    private Integer id;
    private String email;
    private String total_price;
    private List<LineItem> line_items = new ArrayList<>();

    public Order(){}

    public Integer getId() {
        return id;
    }


    public List<LineItem> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<LineItem> line_items) {
        this.line_items = line_items;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }
}


