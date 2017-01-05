package com.niall.geocoder.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by niallodwyer on 05/01/2017.
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }

}
