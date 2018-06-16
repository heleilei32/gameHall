package com.service.impl;

import com.entity.Admin;
import com.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin findAdmin(String userName) {
        Admin admin = new Admin();
        admin.setUsername(userName);
        return adminMapper.selectOne(admin);
    }
}
