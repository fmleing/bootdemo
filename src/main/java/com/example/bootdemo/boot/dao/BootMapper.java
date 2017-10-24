package com.example.bootdemo.boot.dao;

import com.example.bootdemo.boot.entity.Boot;

public interface BootMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Boot record);

    int insertSelective(Boot record);

    Boot selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Boot record);

    int updateByPrimaryKey(Boot record);
}