package com.wx.filemanagersystem.controller;

import com.wx.filemanagersystem.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController extends BaseController {

    @RequestMapping("/")
    public String index() {
        return "hello";
    }
}
