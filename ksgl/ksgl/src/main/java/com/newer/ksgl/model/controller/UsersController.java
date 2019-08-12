package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Users;
import com.newer.ksgl.model.service.UsersService;
import com.newer.ksgl.model.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 用户控制层
 * @author 谢涛
 * */
@Controller
@RequestMapping("/Users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    void show(List<Users> ulist){
        for(Users u : ulist){
            System.out.println(u);
        }
    }

    /**
     * 添加用户入口
     * @author 谢涛
     * @param name 用户名
     * @param email 邮箱
     * @param pass 密码
     * @return Integer
     * */
    @ResponseBody
    @RequestMapping(value = "/insert")
    // produces = "text/plain;charset=UTF-8"
    Integer insert(String name,String email,String pass) throws Exception{
        InetAddress addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = sdf.format(new Date());

        Users users = new Users();
        users.setName(name);
        users.setEmail(email);
        users.setUsers_ip(ip);
        users.setRegister(datetime);
        users.setPassword(pass);
        users.setRid(2);
        Integer row = usersService.insert(users);
        return row;
    }

    /**
     * 删除用户入口
     * @author 谢涛
     * @param priId 隐私id
     * @return Integer
     * */
    @ResponseBody
    @RequestMapping(value = "/delete",produces = "text/plain;charset=UTF-8")
    Integer delete(Integer priId){
        Integer row = usersService.deleteById(priId);
        return row;
    }

    /**
     * 修改用户入口
     * @author 谢涛
     * @param users 用户类
     * @return Integer
     * */
    @ResponseBody
    @RequestMapping(value = "/update",produces = "text/plain;charset=UTF-8")
    Integer update(Users users){
        Integer row = usersService.update(users);
        return row;
    }

    /**
     * 修改用户密码入口
     * @author 谢涛
     * @param priId 隐私id
     * @param password 密码
     * @return Integer
     * */
    @ResponseBody
    @RequestMapping(value = "/upPass",produces = "text/plain;charset=UTF-8")
    Integer upPass(Integer priId,String password){
        Integer row = usersService.upPass(priId,password);
        return row;
    }

    /**
     * 查询用户入口
     * @author 谢涛
     * @return List<Users>
     * */
    @ResponseBody
    @RequestMapping("/findAll")
    List<Users> findAll(){
        List<Users> ulist = usersService.findAll();
        show(ulist);
        return ulist;
    }

    /**
     * 查询用户名是否存在入口
     * @author 谢涛
     * @param name 用户名
     * @return Integer
     * */
    @ResponseBody
    @RequestMapping(value = "/selectByName")
    // ,produces = "text/plain;charset=UTF-8"
    Integer selectByName(String name){
        Integer row = usersService.selectByName(name);
        return row;
    }

    /**
     * 用户登录入口
     * @author 谢涛
     * @param name 用户名
     * @param password 密码
     * @return Users 用户类
     * */
    @ResponseBody
    @RequestMapping(value = "/login")
    // ,produces = "text/plain;charset=UTF-8"
    Users login(String name,String password){
        Users user = usersService.login(name, password);
        System.out.println(user);
        return user;
    }

    /**
     * 分页查询用户入口
     * @author 谢涛
     * @param pageNo 当前页码
     * @return PageBean<Users> 分页类<用户类>
     * */
    @ResponseBody
    @RequestMapping(value = "/pagingFindAll",produces = "text/plain;charset=UTF-8")
    PageBean<Users> pagingFindAll(Integer pageNo){
        Integer pageSize = 1;
        String tableName = "Users";

        PageBean<Users> pageBean = new PageBean<>();

        Integer pageno = 1;

        if(pageNo!=null && pageNo>0){
            pageno = pageNo;
        }

        pageBean.setData(usersService.pagingFindAll(pageno, pageSize));
        pageBean.setPageNo(pageno);
        pageBean.setPageSize(pageSize);
        pageBean.setTotal(usersService.selectCount());

        return pageBean;
    }

}
