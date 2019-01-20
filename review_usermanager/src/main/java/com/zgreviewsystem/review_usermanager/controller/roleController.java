package com.zgreviewsystem.review_usermanager.controller;

import com.zgreview.service.bean.role;
import com.zgreviewsystem.review_usermanager.serviceimpl.roleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class roleController {
    @Autowired
    private roleServiceImpl roleService;








    @ResponseBody
    @RequestMapping("index")
    public List<role>  index(){

        return roleService.getRoleInfoList();
    }

    @ResponseBody
    @RequestMapping("index1")
    public role index1(){

        return roleService.getOne();
    }

}
