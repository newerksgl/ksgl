package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Examinations;
import com.newer.ksgl.model.service.ExaminationsService;
import com.newer.ksgl.model.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/examinations")
public class ExaminationsController {
    @Autowired
    private ExaminationsService service;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Examinations> findAll(){
        return service.findAll();
    }

    @ResponseBody
    @RequestMapping("/find")
    public PageBean<Examinations> find(Examinations e,Integer pageNo){
        Integer pageSize = 1;

        PageBean<Examinations> pageBean = new PageBean<>();

        Integer pageno = 1;

        if(pageNo!=null && pageNo>0){
            pageno = pageNo;
        }
        int row = (pageno-1)*pageSize;
        pageBean.setData(service.find(e,row, pageSize));
        pageBean.setPageNo(pageno);
        pageBean.setPageSize(pageSize);
        pageBean.setTotal(service.findRowCount(e));
        return pageBean;
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Examinations findById(Long id){
        return service.findById(id);
    }

    @ResponseBody
    @RequestMapping("/add")
    public Integer add(Examinations examinations){
        try{
            service.add(examinations);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    @ResponseBody
    @RequestMapping("/update")
    public Integer update(Examinations examinations){
        try{
            service.update(examinations);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

}
