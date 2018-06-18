package com.service.impl;

import com.entity.Admin;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.AdminMapper;
import com.model.DTParams;
import com.model.Result;
import com.utils.DCLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.SystemService;

import java.util.List;

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

    @Override
    public Result getAllAdmin(DTParams dtParams) {
        //分页插件
        Integer pagenum = dtParams.getStart()/dtParams.getLength()+1;
        PageHelper.startPage(pagenum, dtParams.getLength(), true);

        List<Admin> admins = adminMapper.selectAll();
        PageInfo<Admin> pageInfo = new PageInfo<Admin>(admins);

        Result result = new Result();
        result.setDraw(dtParams.getDraw());
        result.setData(admins);
        result.setRecordsFiltered( new Long(pageInfo.getTotal()).intValue());
        result.setRecordsTotal(new Long(pageInfo.getTotal()).intValue());
        return result;
    }
}
