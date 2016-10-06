package com.team.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andrewdmo on 9/29/16.
 */

@Controller
public class NoriController {


    @RequestMapping(path = "/")
    public String login(Model model) {
        return "login";
    }

    @RequestMapping(path = "/dashboard")
    public String dashboard(Model model) {
        return "dashboard";
    }

    @RequestMapping(path = "/productdetail")
    public String productdetail(Model model) {
        return "productdetail";
    }


    @RequestMapping("/apilistener")
    public String apilistener (Model model) {
        return "/apilistener";
    }

}



