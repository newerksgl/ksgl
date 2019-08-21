package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Userrole;
import com.newer.ksgl.model.service.UserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/**
 * 角色控制层
 * @author 谢涛
 * */
@Controller
@RequestMapping("/Userrole")
public class UserroleController {

    @Autowired
    private UserroleService userroleService;

    void show(List<Userrole> ulist){
        for(Userrole u : ulist){
            System.out.println(u);
        }
    }

    /**
     * 添加角色入口
     * @param userrole 角色类
     * @return Integer
     * */
    @ResponseBody
    @RequestMapping("/insert")
    Integer insert(Userrole userrole){
        System.out.println(userrole);
        Integer row = userroleService.insert(userrole);
        return row;
    }

    /**
     * 删除角色入口
     * @param rid 角色id
     * @return Integer
     * */
    @ResponseBody
    @RequestMapping("/deleteById")
    Integer deleteById(Integer rid){
        try {
            return userroleService.deleteById(rid);
        }catch (Exception e) {
            return 2;
        }
    }

    /**
     * 修改角色入口
     * @param userrole 角色类
     * @return Integer
     * */
    @ResponseBody
    @RequestMapping("/update")
    Integer update(Userrole userrole){
        System.out.println(userrole);
        Integer row = userroleService.update(userrole);
        return row;
    }

    /**
     * 查询所有角色入口
     * @return List<Userrole>
     * */
    @ResponseBody
    @RequestMapping("/findAll")
    List<Userrole> findAll(){
        List<Userrole> ulist = userroleService.findAll();
        show(ulist);
        return ulist;
    }

    /**
     * 查询所有角色入口
     * @param rid 角色id
     * @return Userrole
     * */
    @ResponseBody
    @RequestMapping("/selectById")
    Userrole selectById(Integer rid){
        Userrole userrole = userroleService.selectById(rid);
        System.out.println(userrole);
        return userrole;
    }

}
