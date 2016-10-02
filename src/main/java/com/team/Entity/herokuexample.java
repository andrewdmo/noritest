package com.team.Entity;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by andrewdmo on 10/1/16.
 */

@Entity
//@Table(name = "herokuexample")
public class herokuexample {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name1")
    private String name1;

    @Column(name = "name2")
    private String name2;

    @Column(name = "itemNum")
    private String itemNum;

    @Column(name = "EMAIL")
    private ArrayList itemPic;

    @Column(name = "ROLE")
    private Integer quantity;


    private herokuexample() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

//    private Integer id;
//
//    private String name1;
//    private String name2;
//    private String itemNum;
//    private ArrayList itemPic; //optional/separate object?
//    private Integer quantity; //optional/separate object?