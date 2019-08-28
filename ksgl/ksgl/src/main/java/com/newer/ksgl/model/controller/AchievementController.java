package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Achievement;
import com.newer.ksgl.model.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/achievement")
public class AchievementController {

    @Autowired
    public AchievementService service;

    // 查询所有
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Achievement> findAll(){
        return service.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    // 通过id查询
    public Achievement findById(Long id){
        return service.findById(id);
    }

    @ResponseBody
    @RequestMapping("/add")
    // 添加数据
    public Integer add(Achievement ach){
        System.out.println(ach);
        try{
            service.add(ach);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    @ResponseBody
    @RequestMapping("/update")
    // 通过id修改数据
    public Integer updateById(Achievement ach){
        try{
            service.updateById(ach);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    @ResponseBody
    @RequestMapping("/delete")
    // 通过id删除数据
    public Integer deleteById(Achievement aid){
        try{
            service.deleteById(aid);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

}
