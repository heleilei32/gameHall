package com.service;

import com.entity.Admin;

public interface SystemService {
    /**
     * 根据用户名查找系统用户
     * @param userName
     * @return
     */
    Admin findAdmin(String userName);
}
