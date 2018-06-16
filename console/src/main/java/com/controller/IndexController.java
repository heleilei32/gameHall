package com.controller;

import com.entity.Admin;
import com.utils.DCLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import com.service.SystemService;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @Autowired
    SystemService systemService;

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping(value = {"/","/login"})
    public String toLogin(){
        return "login";
    }

    /**
     * 跳转首页
     * @param userName
     * @param password
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/index")
    public String auth(String userName, String password, Model model, HttpSession session ){
    Admin admin = systemService.findAdmin(userName);

    if (StringUtils.isEmpty(admin)){
        model.addAttribute("userName",userName);
        model.addAttribute("errMsg","用户名不存在");
        return "forward:/login";
    }

    if (!password.equals(admin.getPassword())){
        model.addAttribute("userName",userName);
        model.addAttribute("errMsg","密码错误");
        return "forward:/login";
    }
        session.setAttribute(Admin.AdminKey.AdminSesionKey,admin);
        return "redirect:/auth";
    }


    /**
     * 获取权限
     * @return
     */
    @RequestMapping(value = "/auth")
    public String auth( Model model,HttpSession session){


        Admin admin = (Admin)session.getAttribute(Admin.AdminKey.AdminSesionKey);
        model.addAttribute("userName",admin.getUsername());

        //TODO 获取权限
        // systemService.getAuth()



        return "index";
    }





}
