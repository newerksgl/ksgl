package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Chaptertest;
import com.newer.ksgl.model.service.ChapterTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/chaptertest")
public class ChapterTestController {
    @Autowired
    private ChapterTestService service;

    //查询所有数据入口
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Chaptertest> findAll(){
        return service.findAll();
    }

    //根据id查询入口
    @ResponseBody
    @RequestMapping("/findById")
    public Chaptertest findById(Long id){
        return service.findById(id);
    }

    //添加数据入口
    @ResponseBody
    @RequestMapping("/add")
    public Integer add(Chaptertest chaptertest){
        try {
            service.add(chaptertest);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    //通过id修改数据入口
    @ResponseBody
    @RequestMapping("/update")
    public Integer update(Chaptertest chaptertest){
        try {
            service.updateById(chaptertest);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    //根据id删除数据入口
    @ResponseBody
    @RequestMapping("/del")
    public Integer del(Long id){
        try {
            service.deleteById(id);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }
}
