package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Recycle;
import com.newer.ksgl.model.service.RecycleService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/recycle")
public class RecycleController {

    @Autowired
    private RecycleService service;

    // 查询所有
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Recycle> findAll(){
        return service.findAll();
    }

    // 根据ID查询
    @ResponseBody
    @RequestMapping("/findById")
    public Recycle findById(Long rid){
        return service.findById(rid);
    }

    // 添加数据
    @ResponseBody
    @RequestMapping("/add")
    public Integer add(Recycle recycle){
        try{
            System.out.println(recycle);
            service.add(recycle);
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }

    // 通过ID修改数据
    @ResponseBody
    @RequestMapping("/update")
    public Integer updateById(Recycle recycle){
        try{
            service.update(recycle);
        } catch (Exception e){
            return 0;
        }
        return 1;
    }

    // 根据ID删除
    @ResponseBody
    @RequestMapping("/delete")
    public Integer deleteById(Long id){
        try {
            service.deleteById(id);
        } catch (Exception e){
            return 0;
        }
        return 1;
    }


}
