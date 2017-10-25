package com.example.bootdemo.boot.controller;

import com.example.bootdemo.boot.dao.BootMapper;
import com.example.bootdemo.boot.entity.Boot;
import com.example.bootdemo.boot.service.BootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tomecs on 2017/10/24.
 */
@RestController
@RequestMapping("boot")
public class BootController {

    @Autowired
    private BootService bootService;

    @RequestMapping("/hello")
    public Boot hello() {
        Boot boot = bootService.login();
        return boot;
    }
}
