package com.example.bootdemo.boot.service;

import com.example.bootdemo.boot.dao.BootMapper;
import com.example.bootdemo.boot.entity.Boot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tomecs on 2017/10/25.
 */
@Service
public class BootServiceImpl implements BootService {

    @Autowired
    private BootMapper bootMapper;

    @Override
    public Boot login() {
        Boot boot = bootMapper.selectByPrimaryKey(2);
        return boot;
    }
}
