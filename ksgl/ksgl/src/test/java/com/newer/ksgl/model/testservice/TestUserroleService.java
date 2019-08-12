package com.newer.ksgl.model.testservice;

import com.newer.ksgl.model.pojo.Userrole;
import com.newer.ksgl.model.service.UserroleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Userrole Service层测试
 *
 * @author 谢涛
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserroleService {

    @Autowired
    private UserroleService service;

    /**
     * 测试 添加角色方法
     * */
    @Test
    public void test_insert() {
        Userrole userrole = new Userrole(null, "测试", 0, null, 0);
        Integer row = service.insert(userrole);
        System.out.println(row);
    }

    /**
     * 测试 修改角色方法
     * */
    @Test
    public void test_update() {
        Userrole userrole = service.selectById(5);
        userrole.setRole_name("ceshi");
        Integer row = service.update(userrole);
        System.out.println(row);
    }

    /**
     * 测试 查询角色方法
     * */
    @Test
    public void test_findAll(){
        List<Userrole> ulist = service.findAll();
        for(Userrole u : ulist){
            System.out.println(u);
        }
    }

    /**
     * 测试 查询角色方法
     * */
    @Test
    public void test_deleteById(){
        Integer row = service.deleteById(5);
        System.out.println(row);
    }

}
