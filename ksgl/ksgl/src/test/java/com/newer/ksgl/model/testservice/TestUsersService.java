package com.newer.ksgl.model.testservice;

import com.newer.ksgl.model.mapper.UsersMapper;
import com.newer.ksgl.model.pojo.Users;
import com.newer.ksgl.model.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Users Service层测试
 * @author 谢涛
 * */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUsersService {
    @Autowired
    private UsersService service;

    /**
     * 测试 添加用户方法
     * */
    @Test
    public void test_insert() throws Exception{
        InetAddress addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = sdf.format(new Date());

        Users users = new Users();
        users.setName("ceshi");
        users.setEmail("ceshi@163.com");
        users.setUsers_ip(ip);
        users.setIntegral(0l);
        users.setRegister(datetime);
        users.setPassword("ceshi");
        users.setRid(2l);
        Integer row = service.insert(users);
        System.out.println(row);
    }

    /**
     * 测试 修改用户方法
     * */
    @Test
    public void test_update(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = sdf.format(new Date());

        Users users = service.login("ceshi","ceshi");
        users.setName("ceshi up");
        users.setEmail("ceshi up@163.com");
        users.setPassword("ceshi up");
        users.setRegister(datetime);
        System.out.println(users);
        Integer row = service.update(users);
        System.out.println(row);
    }

    /**
     * 测试 修改用户密码方法
     * */
    @Test
    public void test_upPass(){
        Integer row = service.upPass(1, "123456");
        System.out.println(row);
    }

    /**
     * 测试 查询用户方法
     * */
    @Test
    public void test_findAll(){
        List<Users> ulist = service.findAll();
        for(Users u : ulist){
            System.out.println(u);
        }
    }

    /**
     * 测试 删除用户方法
     * */
    @Test
    public void test_delete(){
        Integer row = service.deleteById(8);
        System.out.println(row);
    }

}
