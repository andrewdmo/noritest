package com.team.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * Created by andrewdmo on 9/30/16.
 */


@Entity
public class Order {

    @Id
    @GeneratedValue
    private Integer id;

    private String name1;
    private String name2;
    private String itemNum;
    private ArrayList itemPic; //optional/separate object?
    private Integer quantity; //optional/separate object?

    //no argument constructors:
    public Order() {
    }

    public Order(Integer id, String name1, String name2, String itemNum, ArrayList itemPic, Integer quantity) {
        this.id = id;
        this.name1 = name1;
        this.name2 = name2;
        this.itemNum = itemNum;
        this.itemPic = itemPic;
        this.quantity = quantity;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName1() {
        return getName1();
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getItemNum() {
        return itemNum;
    }

    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    public ArrayList getItemPic() {
        return itemPic;
    }

    public void setItemPic(ArrayList itemPic) {
        this.itemPic = itemPic;
    }
    publi
}