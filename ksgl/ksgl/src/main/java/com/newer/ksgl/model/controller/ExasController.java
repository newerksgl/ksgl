package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Exas;
import com.newer.ksgl.model.service.ExasService;
import com.newer.ksgl.model.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("exas")
public class ExasController {
    @Autowired
    private ExasService service;

    //查询所有数据入口
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Exas> findAll(){
        List<Exas> exasList = service.findAll();
        return exasList;
    }

    //多样查询分页入口
    @ResponseBody
    @RequestMapping("/find")
    public PageBean<Exas> find(Exas exas, Integer pageNo){
        Integer pageSize = 1;
        String tableName = "Exas";

        PageBean<Exas> pageBean = new PageBean<>();

        Integer pageno = 1;

        if(pageNo!=null && pageNo>0){
            pageno = pageNo;
        }
        int row = (pageno-1)*pageSize;
        pageBean.setData(service.find(exas,row, pageSize));
        pageBean.setPageNo(pageno);
        pageBean.setPageSize(pageSize);
        pageBean.setTotal(service.findRowCount(exas));
        return pageBean;
    }

    //根据id查询数据入口
    @ResponseBody
    @RequestMapping("/findById")
    public Exas findById(Long id){
        Exas e = service.getExasById(id);
        return e;
    }

    //添加数据入口
    @ResponseBody
    @RequestMapping("/add")
    public Integer add(Exas exas){
        try {
            service.add(exas.getSid(),exas.getQid(),exas);
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
    public Integer update(Exas exas){
        try {
            service.updateById(exas.getSid(),exas.getQid(),exas);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }
}
