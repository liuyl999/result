package com.liuyl.controller;

import com.liuyl.dao.SysUserMapper;
import com.liuyl.entity.SysUser;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * spring boot 测试
 */
@Controller
public class SimpleController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping("/test")
    public ModelAndView get(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aaa");
        return mv;
    }

    @RequestMapping("/try")
    public String toAaa(){
        List<SysUser> userList = sysUserMapper.selectAll();
        return "aaa";
    }

}
