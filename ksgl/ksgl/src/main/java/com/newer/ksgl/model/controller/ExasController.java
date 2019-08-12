package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Exas;
import com.newer.ksgl.model.pojo.Subject;
import com.newer.ksgl.model.service.ExasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("exas")
public class ExasController {
    @Autowired
    private ExasService service;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Exas> findAll(){
        List<Exas> exasList = service.findAll();
        return exasList;
    }

    @ResponseBody
    @RequestMapping("/find")
    public List<Exas> find(Exas exas,Integer row,Integer pageSize){
        List<Exas> exasList = service.find(exas,row,pageSize);
        return exasList;
    }

    @ResponseBody
    @RequestMapping("/findRowCount")
    public Integer findRowCount(Exas exas){
        return service.findRowCount(exas);
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Exas findById(Long id){
        Exas e = service.findById(id);
        return e;
    }
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
