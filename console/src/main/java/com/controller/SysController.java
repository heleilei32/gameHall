package com.controller;

import com.entity.Admin;
import com.model.DTParams;
import com.model.Result;
import com.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

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

    @RequestMapping("/getAllAdmin")
    @ResponseBody
    public Result getAllAdmin(DTParams dtParams) {
        return systemService.getAllAdmin(dtParams);
    }




}
