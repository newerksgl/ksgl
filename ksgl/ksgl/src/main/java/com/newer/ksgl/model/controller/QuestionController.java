package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Question;
import com.newer.ksgl.model.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService service;

    //查询所有数据入口
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Question> findAll(){
        return service.findAll();
    }

    //根据id查询数据入口
    @ResponseBody
    @RequestMapping("/findById")
    public Question findById(Long id){
        return service.finById(id);
    }

    //添加数据入口
    @ResponseBody
    @RequestMapping("/add")
    public Integer add(Question question){
        try {
            service.add(question);
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

    //通过id修改数据入口
    @ResponseBody
    @RequestMapping("/update")
    public Integer update(Question question){
        try {
            service.updateById(question);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }
}
