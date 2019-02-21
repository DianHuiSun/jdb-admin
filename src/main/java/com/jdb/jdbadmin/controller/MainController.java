package com.jdb.jdbadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author：sdh
 * @description：
 * @date：2019-02-21
 * @version： 1.0
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
