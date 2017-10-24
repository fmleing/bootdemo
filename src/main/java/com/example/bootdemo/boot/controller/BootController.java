package com.example.bootdemo.boot.controller;

import com.example.bootdemo.boot.dao.BootMapper;
import com.example.bootdemo.boot.entity.Boot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tomecs on 2017/10/24.
 */
@RestController
@RequestMapping("boot")
public class BootController {

    @Autowired
    private BootMapper bootMapper;

    @RequestMapping("/hello")
    public Boot hello() {
        Boot boot = bootMapper.selectByPrimaryKey(1);
        return boot;
    }
}
