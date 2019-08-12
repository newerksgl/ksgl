package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Privacy;
import com.newer.ksgl.model.service.PrivacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 隐私控制层
 * @author 谢涛
 */
@Controller
@RequestMapping("/Privacy")
public class PrivacyController {

    @Autowired
    private PrivacyService privacyService;

    void show(List<Privacy> plist) {
        for (Privacy p : plist) {
            System.out.println(p);
        }
    }

    /**
     * 添加隐私入口
     * @param privacy 隐私类
     * @return Integer
     */
    @ResponseBody
    @RequestMapping("/insert")
    Integer insert(Privacy privacy) {
        System.out.println(privacy);
        Integer row = privacyService.insert(privacy);
        return row;
    }

    /**
     * 删除隐私入口
     * @param pri_id 隐私id
     * @return Integer
     */
    @ResponseBody
    @RequestMapping("/deleteById")
    Integer deleteById(Integer pri_id) {
        Integer row = privacyService.deleteById(pri_id);
        return row;
    }

    /**
     * 修改隐私入口
     * @param privacy 隐私类
     * @return Integer
     */
    @ResponseBody
    @RequestMapping("/update")
    Integer update(Privacy privacy) {
        System.out.println(privacy);
        Integer row = privacyService.update(privacy);
        return row;
    }

    /**
     * 查询隐私入口
     * @return List<Privacy>
     */
    @ResponseBody
    @RequestMapping("/findAll")
    List<Privacy> findAll() {
        List<Privacy> plist = privacyService.findAll();
        show(plist);
        return plist;
    }

    /**
     * 查询个人隐私入口
     * @param pri_id
     * @return Privacy
     */
    @ResponseBody
    @RequestMapping("/selectById")
    Privacy selectById(Integer pri_id) {
        Privacy privacy = privacyService.selectById(pri_id);
        return privacy;
    }

}
