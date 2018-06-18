package com.service;

import com.entity.Admin;

import java.util.List;

public interface SystemService {
    /**
     * 根据用户名查找系统用户
     * @param userName
     * @return
     */
    Admin findAdmin(String userName);

    /**
     * 获取所有的系统用户
     * @return
     */
    List<Admin> getAllAdmin();
}
