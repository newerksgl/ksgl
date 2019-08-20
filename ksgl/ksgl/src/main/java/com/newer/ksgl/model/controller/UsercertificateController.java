package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.pojopage.UsercertificatePage;
import com.newer.ksgl.model.service.UsercertififcatePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/zhangshu")
public class UsercertificateController {
    @Autowired
    private UsercertififcatePageService usercertififcatePageService;
    @ResponseBody
    @RequestMapping("/selectByName")
    public List<UsercertificatePage> selectByname(String name){
        List<UsercertificatePage> lists = usercertififcatePageService.selectname(name);
        return lists;
    }
}
