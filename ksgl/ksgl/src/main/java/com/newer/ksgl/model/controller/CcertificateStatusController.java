package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Ccertificatestatus;
import com.newer.ksgl.model.service.CcertificatestatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping()
public class CcertificateStatusController {

    @Autowired
    private CcertificatestatusService service;

    //查询所有数据入口
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Ccertificatestatus> findAll(){
        return service.findAll();
    }

    //根据id查询入口
    @ResponseBody
    @RequestMapping("/findById")
    public Ccertificatestatus findById(Long id){
        return service.findById(id);
    }

    //添加数据入口
    @ResponseBody
    @RequestMapping("/add")
    public Integer add(Ccertificatestatus ccer){
        try {
            service.add(ccer);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    //通过id修改数据入口
    @ResponseBody
    @RequestMapping("/update")
    public Integer updateById(Ccertificatestatus ccer){
        try {
            service.updateById(ccer);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    //根据id删除数据入口
    @ResponseBody
    @RequestMapping("/del")
    public Integer deleteById(Long id){
        try {
            service.delete(id);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }
}
