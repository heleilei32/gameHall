package com.controller;

import com.entity.Admin;
import com.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("sys")
public class SysController {

    @Autowired
    SystemService systemService;

    @RequestMapping("toUserManage")
    public String toUserManage() {
        return "sys/userManage";
    }

    @RequestMapping("toRoleManage")
    public String toRoleManage() {
        return "sys/roleManage";
    }

    @RequestMapping("toAuthManage")
    public String toAuthManage() {
        return "sys/authManage";
    }


}
