package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.mapper.CertificateMapperImpl;
import com.newer.ksgl.model.pojo.Certificate;
import com.newer.ksgl.model.pojo.Chaptertest;
import com.newer.ksgl.model.pojo.Usercertificate;
import com.newer.ksgl.model.service.CertificateService;
import com.newer.ksgl.model.service.UsercertififcatePageService;
import com.newer.ksgl.model.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/certificate")
public class CertificateController {

    @Autowired
    private CertificateService service;
    private UsersService usersService;
    private UsercertififcatePageService usercertififcatePageService;
    private CertificateMapperImpl certificateMapper;

    //查询所有数据入口
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Certificate> findAll(){
        return service.findAll();
    }

    //根据id查询入口
    @ResponseBody
    @RequestMapping("/findById")
    public Certificate findById(Long id){
        return service.findById(id);
    }

    //添加数据入口
    @ResponseBody
    @RequestMapping("/add")
    public Integer add(Certificate cert){
        try {
            service.add(cert);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    //通过id修改数据入口
    @ResponseBody
    @RequestMapping("/update")
    public Integer updateById(Certificate cert){
        try {
            service.updateById(cert);
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
            service.deleteById(id);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }
    @ResponseBody
    @RequestMapping("/intertu")
    public  String instertu(Long id,String name){
        if(usersService.selectByNameU(name).getIntegral()>= service.findById(id).getPrice()){
            Usercertificate usercertificate = new Usercertificate();
            usercertificate.setCid(id);
            usercertificate.setCsid(1l);

            usercertificate.setName(name);
            if(1<=usercertififcatePageService.insert(usercertificate)){
                return "申请成功";
            }else{
                return "申请失败";
            }
        }else {
            return "积分不足";
        }
    }
    @ResponseBody
    @RequestMapping("/selecbyname")
    public  List<Certificate> selectbyname(String name){
        return certificateMapper.selectByName(name);
    }
}
