package com.team.Controller;

import com.team.Entity.Order;
import com.team.Entity.Product;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by andrewdmo on 10/5/16.
 */
@RestController
public class NotificationController {

    @RequestMapping (path = "/notification/update")
    public String productUpdate (@RequestBody Product product) {

        return "Buy me!";
    }

    @RequestMapping (path = "/notification/order/fulfillment")
    public String orderFulfillment (@RequestBody Order order){

        return "Return me!";

    }




}
