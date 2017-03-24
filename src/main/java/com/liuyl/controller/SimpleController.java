package com.liuyl.controller;

import com.liuyl.annotation.LogAround;
import com.liuyl.dao.SysUserMapper;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * spring boot 测试
 */
@Controller
public class SimpleController {

    private Logger logger = LogManager.getLogger(SimpleController.class);

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping("/test")
    public ModelAndView get(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aaa");
        return mv;
    }

    @LogAround
    @RequestMapping("/try")
    public String toAaa(){
        logger.info("fsafsafsfsfaafsfafsfaf");
        return "aaa";
    }

}
